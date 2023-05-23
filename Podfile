require_relative '../node_modules/react-native/scripts/react_native_pods'
require_relative '../node_modules/@react-native-community/cli-platform-ios/native_modules'
# use_frameworks!


platform :ios, '13.0'

config = use_native_modules!

use_react_native!(:path => config["reactNativePath"])
target 'movieApp' do
  config = use_native_modules!

  use_react_native!(
    :path => config[:reactNativePath],
    # to enable hermes on iOS, change `false` to `true` and then install pods
    :hermes_enabled => false
  )
  # Pods for movieApp
  permissions_path = '../node_modules/react-native-permissions/ios'
  pod 'Permission-Camera', :path => "#{permissions_path}/Camera.podspec"
  use_native_modules!
  use_flipper!()

  post_install do |installer|
    find_and_replace("../node_modules/react-native/React/CxxBridge/RCTCxxBridge.mm",
    "_initializeModules:(NSArray<id<RCTBridgeModule>> *)modules", "_initializeModules:(NSArray<Class> *)modules")
    find_and_replace("../node_modules/react-native/ReactCommon/turbomodule/core/platform/ios/RCTTurboModuleManager.mm",
        "RCTBridgeModuleNameForClass(module))", "RCTBridgeModuleNameForClass(Class(module)))")
    installer.pods_project.targets.each do |target|
      target.build_configurations.each do |config|
        config.build_settings['APPLICATION_EXTENSION_API_ONLY'] = 'NO'
        config.build_settings["ONLY_ACTIVE_ARCH"] = "NO"
      end
      __apply_Xcode_12_5_M1_post_install_workaround(installer)

    end
    
  end
  


  pod 'react-native-restart', :path => '../node_modules/react-native-restart'
  pod 'PushNotifications'
  pod 'Mixpanel'
  target 'movieAppTests' do
    inherit! :complete
    # Pods for testing
  end

  
# end


  # Pods for movieApp-tvOS

  target 'movieApp-tvOSTests' do
    inherit! :search_paths
    # Pods for testing
  end

def find_and_replace(dir, findstr, replacestr)
  Dir[dir].each do |name|
      text = File.read(name)
      replace = text.gsub(findstr,replacestr)
      if text != replace
          puts "Fix: " + name
          File.open(name, "w") { |file| file.puts replace }
          STDOUT.flush
      end
  end
  Dir[dir + '*/'].each(&method(:find_and_replace))
end

# pre_install do |installer|
#   puts("Image fix for ios14: remove this when upgradeing to >= 0.63.3")
#   find = "_currentFrame.CGImage;"
#   replace = "_currentFrame.CGImage ;} else { [super displayLayer:layer];"
#   op = `sed -ie "s/#{find}/#{replace}/" ../node_modules/react-native/Libraries/Image/RCTUIImageViewAnimated.m`
#   puts("Image fix for ios14 done")
# #should remove on 0.63
end









