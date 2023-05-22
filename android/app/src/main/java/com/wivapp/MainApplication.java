package com.wivapp;

import android.app.Application;
import android.content.Context;
import com.facebook.react.ReactInstanceManager;

import com.b8ne.RNPusherPushNotifications.RNPusherPushNotificationsPackage;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;
import java.lang.reflect.InvocationTargetException;

import java.util.List;


public class MainApplication extends Application implements ReactApplication {

   private final ReactNativeHost mReactNativeHost =
    new ReactNativeHost(this) {
      @Override
      public boolean getUseDeveloperSupport() {
        return BuildConfig.DEBUG;
      }

    @Override
    protected List<ReactPackage> getPackages() {
      @SuppressWarnings("UnnecessaryLocalVariable")
      List<ReactPackage> packages = new PackageList(this).getPackages();
      // Packages that cannot be autolinked yet can be added manually here, for example:
      // packages.add(new MyReactNativePackage());
      packages.add(new RNPusherPushNotificationsPackage());
//      packages.add(new RNNotificationsPackage(MainApplication.this));
      
      return packages;
    }
    

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
    
  };

  public List<ReactPackage> createAdditionalReactPackages() {
    return new PackageList(this).getPackages();
  }
  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  public boolean isDebug() {
      return BuildConfig.DEBUG;
  }


  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}