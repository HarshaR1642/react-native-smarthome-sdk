package com.smarthomesdk

import com.BV.LinearGradient.LinearGradientPackage
import com.airbnb.android.react.lottie.LottiePackage
import com.facebook.react.ReactPackage
import com.facebook.react.shell.MainReactPackage
import com.horcrux.svg.SvgPackage
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage
import com.reactnativecommunity.clipboard.ClipboardPackage
import com.reactnativecommunity.picker.RNCPickerPackage
import com.swmansion.gesturehandler.RNGestureHandlerPackage
import com.swmansion.reanimated.ReanimatedPackage
import com.swmansion.rnscreens.RNScreensPackage
import com.th3rdwave.safeareacontext.SafeAreaContextPackage

class CustomPackageList {
  fun getPackages(): List<ReactPackage> {
    return listOf(
      MainReactPackage(null),
      AsyncStoragePackage(),
      ClipboardPackage(),
      RNCPickerPackage(),
      LottiePackage(),
      RNGestureHandlerPackage(),
      LinearGradientPackage(),
      ReanimatedPackage(),
      SafeAreaContextPackage(),
      RNScreensPackage(),
      SvgPackage()
    )
  }
}
