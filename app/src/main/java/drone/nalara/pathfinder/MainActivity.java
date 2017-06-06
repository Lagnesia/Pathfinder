package drone.nalara.pathfinder;

import android.content.Intent;
import android.net.Uri;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
// static final int REQ_CODE_OVERLAY_PERMISSION = 88;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
      //  Intent intent = new Intent(Settings.ACTION_MANAGE_OVERLAY_PERMISSION, Uri.parse("package:" + getPackageName()));
       // startActivityForResult(intent, REQ_CODE_OVERLAY_PERMISSION);

    }

    public  void onStartButtonClicked(View v){
        Toast.makeText(this, "어플,동작,성공적", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(getApplicationContext(),MapActivity.class);
        startActivity(intent);
    }
}
