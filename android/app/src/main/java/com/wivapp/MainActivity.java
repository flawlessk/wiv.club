package com.wivapp;
import com.facebook.react.ReactInstanceManager;
import com.pusher.pushnotifications.PushNotifications;
import com.b8ne.RNPusherPushNotifications.NotificationsMessagingService;
import com.facebook.react.ReactActivity;
import android.content.res.Configuration;
import android.content.Intent;
import android.os.Bundle;
import org.devio.rn.splashscreen.SplashScreen;


public class MainActivity extends ReactActivity {

    /**
     * Returns the name of the main component registered from JavaScript.
     * This is used to schedule rendering of the component.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        SplashScreen.show(this);  // here
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String getMainComponentName() {
        return "movieApp";
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
    super.onConfigurationChanged(newConfig);
    Intent intent = new Intent("onConfigurationChanged");
    intent.putExtra("newConfig", newConfig);
    this.sendBroadcast(intent);
    }

//   @Override
//   public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
//       CalendarEventsPackage.onRequestPermissionsResult(requestCode, permissions, grantResults);
//       super.onRequestPermissionsResult(requestCode, permissions, grantResults);
//   }
}
