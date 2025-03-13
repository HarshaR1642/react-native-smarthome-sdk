package com.smarthomesdk

import android.app.Application
import com.facebook.react.ReactPackage
import com.facebook.react.shell.MainReactPackage

//// @react-native-async-storage/async-storage
//import com.reactnativecommunity.asyncstorage.AsyncStoragePackage // @react-native-clipboard/clipboard
//
//// @react-native-clipboard/clipboard
//import com.reactnativecommunity.clipboard.ClipboardPackage // @react-native-picker/picker
//
//// @react-native-picker/picker
//import com.reactnativecommunity.picker.RNCPickerPackage // lottie-react-native
//
//// lottie-react-native
//import com.airbnb.android.react.lottie.LottiePackage // react-native-gesture-handler
//
//// react-native-gesture-handler
//import com.swmansion.gesturehandler.RNGestureHandlerPackage // react-native-linear-gradient
//
//// react-native-linear-gradient
//import com.BV.LinearGradient.LinearGradientPackage // react-native-reanimated
//
//// react-native-reanimated
//import com.swmansion.reanimated.ReanimatedPackage // react-native-safe-area-context
//
//// react-native-safe-area-context
//import com.th3rdwave.safeareacontext.SafeAreaContextPackage // react-native-screens
//
//// react-native-screens
//import com.swmansion.rnscreens.RNScreensPackage // react-native-svg
//
//// react-native-svg
//import com.horcrux.svg.SvgPackage

class CustomPackageList(private val application: Application) {
  fun getPackages(): List<ReactPackage> {
    return listOf(
      MainReactPackage(),
//      AsyncStoragePackage(),
//      ClipboardPackage(),
//      RNCPickerPackage(),
//      LottiePackage(),
//      RNGestureHandlerPackage(),
//      LinearGradientPackage(),
//      ReanimatedPackage(),
//      SafeAreaContextPackage(),
//      RNScreensPackage(),
//      SvgPackage()
    )
  }
}
