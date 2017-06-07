package drone.nalara.pathfinder.net.xxhong.rosclient;

import android.app.Application;

import drone.nalara.pathfinder.com.rosbridge.ROSBridgeClient;

/**
 * Created by xxhong on 16-11-21.
 */

public class RCApplication extends Application {
    ROSBridgeClient client;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public void onTerminate() {
        if(client != null)
            client.disconnect();
        super.onTerminate();
    }

    public ROSBridgeClient getRosClient() {
        return client;
    }

    public void setRosClient(ROSBridgeClient client) {
        this.client = client;
    }
}
