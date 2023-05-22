
package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import java.util.Arrays;
import java.util.ArrayList;

// @pusher/pusher-websocket-react-native
import com.pusherwebsocketreactnative.PusherWebsocketReactNativePackage;
// @react-native-async-storage/async-storage
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
// @react-native-clipboard/clipboard
import com.reactnativecommunity.clipboard.ClipboardPackage;
// @react-native-community/datetimepicker
import com.reactcommunity.rndatetimepicker.RNDateTimePickerPackage;
// @react-native-community/masked-view
import org.reactnative.maskedview.RNCMaskedViewPackage;
// @react-native-picker/picker
import com.reactnativecommunity.picker.RNCPickerPackage;
// react-native-calendar-events
import com.calendarevents.RNCalendarEventsPackage;
// react-native-config
import com.lugg.RNCConfig.RNCConfigPackage;
// react-native-create-thumbnail
import com.reactlibrary.createthumbnail.CreateThumbnailPackage;
// react-native-device-info
import com.learnium.RNDeviceInfo.RNDeviceInfo;
// react-native-dialogs
import com.aakashns.reactnativedialogs.ReactNativeDialogsPackage;
// react-native-document-picker
import io.github.elyx0.reactnativedocumentpicker.DocumentPickerPackage;
// react-native-fast-image
import com.dylanvann.fastimage.FastImageViewPackage;
// react-native-gesture-handler
import com.swmansion.gesturehandler.react.RNGestureHandlerPackage;
// react-native-i18n
import com.AlexanderZaytsev.RNI18n.RNI18nPackage;
// react-native-image-crop-picker
import com.reactnative.ivpusic.imagepicker.PickerPackage;
// react-native-image-picker
import com.imagepicker.ImagePickerPackage;
// react-native-keep-awake
import com.corbt.keepawake.KCKeepAwakePackage;
// react-native-linear-gradient
import com.BV.LinearGradient.LinearGradientPackage;
// react-native-locale-listener
import com.toyberman.localeReload.RNReactNativeLocalePackage;
// react-native-localize
import com.zoontek.rnlocalize.RNLocalizePackage;
// react-native-notifications
import com.wix.reactnativenotifications.RNNotificationsPackage;
// react-native-pager-view
import com.reactnativepagerview.PagerViewPackage;
// react-native-permissions
import com.reactnativecommunity.rnpermissions.RNPermissionsPackage;
// react-native-reanimated
import com.swmansion.reanimated.ReanimatedPackage;
// react-native-restart
import com.reactnativerestart.RestartPackage;
// react-native-safe-area-context
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
// react-native-screens
import com.swmansion.rnscreens.RNScreensPackage;
// react-native-share
import cl.json.RNSharePackage;
// react-native-share-menu
import com.meedan.ShareMenuPackage;
// react-native-snackbar
import com.azendoo.reactnativesnackbar.SnackbarPackage;
// react-native-sound
import com.zmxv.RNSound.RNSoundPackage;
// react-native-splash-screen
import org.devio.rn.splashscreen.SplashScreenReactPackage;
// react-native-svg
import com.horcrux.svg.SvgPackage;
// react-native-vector-icons
import com.oblador.vectoricons.VectorIconsPackage;
// react-native-video
import com.brentvatne.react.ReactVideoPackage;
// react-native-webview
import com.reactnativecommunity.webview.RNCWebViewPackage;
// react-native-youtube
import com.inprogress.reactnativeyoutube.ReactNativeYouTube;
// rn-fetch-blob
import com.RNFetchBlob.RNFetchBlobPackage;

public class PackageList {
  private Application application;
  private ReactNativeHost reactNativeHost;
  private MainPackageConfig mConfig;

  public PackageList(ReactNativeHost reactNativeHost) {
    this(reactNativeHost, null);
  }

  public PackageList(Application application) {
    this(application, null);
  }

  public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig config) {
    this.reactNativeHost = reactNativeHost;
    mConfig = config;
  }

  public PackageList(Application application, MainPackageConfig config) {
    this.reactNativeHost = null;
    this.application = application;
    mConfig = config;
  }

  private ReactNativeHost getReactNativeHost() {
    return this.reactNativeHost;
  }

  private Resources getResources() {
    return this.getApplication().getResources();
  }

  private Application getApplication() {
    if (this.reactNativeHost == null) return this.application;
    return this.reactNativeHost.getApplication();
  }

  private Context getApplicationContext() {
    return this.getApplication().getApplicationContext();
  }

  public ArrayList<ReactPackage> getPackages() {
    return new ArrayList<>(Arrays.<ReactPackage>asList(
      new MainReactPackage(mConfig),
      new PusherWebsocketReactNativePackage(),
      new AsyncStoragePackage(),
      new ClipboardPackage(),
      new RNDateTimePickerPackage(),
      new RNCMaskedViewPackage(),
      new RNCPickerPackage(),
      new RNCalendarEventsPackage(),
      new RNCConfigPackage(),
      new CreateThumbnailPackage(),
      new RNDeviceInfo(),
      new ReactNativeDialogsPackage(),
      new DocumentPickerPackage(),
      new FastImageViewPackage(),
      new RNGestureHandlerPackage(),
      new RNI18nPackage(),
      new PickerPackage(),
      new ImagePickerPackage(),
      new KCKeepAwakePackage(),
      new LinearGradientPackage(),
      new RNReactNativeLocalePackage(),
      new RNLocalizePackage(),
      new RNNotificationsPackage(reactNativeHost.getApplication()),
      new PagerViewPackage(),
      new RNPermissionsPackage(),
      new ReanimatedPackage(),
      new RestartPackage(),
      new SafeAreaContextPackage(),
      new RNScreensPackage(),
      new RNSharePackage(),
      new ShareMenuPackage(),
      new SnackbarPackage(),
      new RNSoundPackage(),
      new SplashScreenReactPackage(),
      new SvgPackage(),
      new VectorIconsPackage(),
      new ReactVideoPackage(),
      new RNCWebViewPackage(),
      new ReactNativeYouTube(),
      new RNFetchBlobPackage()
    ));
  }
}
