package drone.nalara.pathfinder;

import android.*;
import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    private GoogleMap map;
    private double latitude, longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        SupportMapFragment map =
                (SupportMapFragment)getSupportFragmentManager().findFragmentById(R.id.map);
        map.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap googleMap) {
                LatLng curPoint = new LatLng(latitude,longitude);
                MarkerOptions O = new MarkerOptions().position(curPoint);
                Marker curpoint=googleMap.addMarker(O);
               // googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(curPoint,15));
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(curPoint, 18));

                // 지도 유형 설정. 지형도인 경우에는 GoogleMap.MAP_TYPE_TERRAIN, 위성 지도인 경우에는 GoogleMap.MAP_TYPE_SATELLITE
                googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
            }
        });

        startLocationService();
        checkDangerousPermissions();
    }


    @Override
    public void onMapReady(GoogleMap map) {
        map.addMarker(new MarkerOptions()
                .position(new LatLng(0, 0))
                .title("Marker"));
    }

    private void checkDangerousPermissions() {
        String[] permissions = {
                android.Manifest.permission.ACCESS_FINE_LOCATION,
                android.Manifest.permission.ACCESS_COARSE_LOCATION,
                android.Manifest.permission.READ_EXTERNAL_STORAGE,
                Manifest.permission.WRITE_EXTERNAL_STORAGE
        };

        int permissionCheck = PackageManager.PERMISSION_GRANTED;
        for (int i = 0; i < permissions.length; i++) {
            permissionCheck = ContextCompat.checkSelfPermission(this, permissions[i]);
            if (permissionCheck == PackageManager.PERMISSION_DENIED) {
                break;
            }
        }

        if (permissionCheck == PackageManager.PERMISSION_GRANTED) {
            Toast.makeText(this, "권한 있음", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "권한 없음", Toast.LENGTH_LONG).show();

            if (ActivityCompat.shouldShowRequestPermissionRationale(this, permissions[0])) {
                Toast.makeText(this, "권한 설명 필요함.", Toast.LENGTH_LONG).show();
            } else {
                ActivityCompat.requestPermissions(this, permissions, 1);
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (requestCode == 1) {
            for (int i = 0; i < permissions.length; i++) {
                if (grantResults[i] == PackageManager.PERMISSION_GRANTED) {
                    Toast.makeText(this, permissions[i] + " 권한이 승인됨.", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(this, permissions[i] + " 권한이 승인되지 않음.", Toast.LENGTH_LONG).show();
                }
            }
        }
    }

    public  void onBackButtonClicked(View v){
        finish();
    }

    public void GPSClicked(View v){
        startLocationService();
    }

    private void startLocationService() {
        LocationManager lm = (LocationManager)getSystemService(Context.LOCATION_SERVICE);

        GPSListener GPSListen = new GPSListener();
        long minTime = 10000;
        float minDistance = 0;


        try{
            lm.requestLocationUpdates(LocationManager.GPS_PROVIDER,minTime,minDistance,GPSListen);

            Location lastPos = lm.getLastKnownLocation(LocationManager.GPS_PROVIDER);

            if(lastPos!=null){
                latitude = lastPos.getLatitude();
                longitude = lastPos.getLongitude();
                Double altitude = lastPos.getAltitude();

                Toast.makeText(getApplicationContext(),"Latitude: " + latitude + "\nLongitude: " + longitude +
                        "\nAltitude: " + altitude,Toast.LENGTH_LONG).show();
              //  showCurrentLocation(latitude,longitude);
            }
        }catch(SecurityException ex) {
            ex.printStackTrace();
        }


    }

    private class GPSListener implements LocationListener{
        public void onLocationChanged(Location location){
            latitude = location.getLatitude();
            longitude = location.getLongitude();
            Double altitude = location.getAltitude();

            String msg = "//Latitude: " + latitude + "Longtitude: " + longitude +
                    "\nAltitude: " + altitude;
            Log.i("GPSListener",msg);
          // showCurrentLocation(latitude, longitude);
        }

        public void onProviderDisabled(String provider){}

        public void onProviderEnabled(String provider){}

        public void onStatusChanged(String provider, int status, Bundle extras){}
    }
    private void showCurrentLocation(Double latitude, Double longitude) {
        // 현재 위치를 이용해 LatLon 객체 생성
        LatLng curPoint = new LatLng(37.572826, 126.976853/*latitude, longitude*/);
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(curPoint,15));
        map.animateCamera(CameraUpdateFactory.newLatLngZoom(curPoint, 15));

        // 지도 유형 설정. 지형도인 경우에는 GoogleMap.MAP_TYPE_TERRAIN, 위성 지도인 경우에는 GoogleMap.MAP_TYPE_SATELLITE
        map.setMapType(GoogleMap.MAP_TYPE_NORMAL);

    }
}
