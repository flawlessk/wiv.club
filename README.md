# Wiv club

# 1.0 Project Prerequisites

Follow official [React Native CLI Quickstart](https://reactnative.dev/docs/getting-started) guide for installing required dependencies:

- Node
- Watchman
- Yarn || npm
- CocoaPods
- Android Studio
- Xcode

#### Install Xcode

1. Follow the instructions provided by official Apple Documentation [https://developer.apple.com/xcode/](https://developer.apple.com/xcode/)

#### Configure Virtual Devices

1. Create Android Virtual Device (AVD) in Android Studio.

- Follow the official docs [https://developer.android.com/studio/run/managing-avds](https://developer.android.com/studio/run/managing-avds)

2. Create iOS Simulator

- Follow the official docs [https://developer.apple.com/documentation/xcode/running_your_app_in_the_simulator_or_on_a_device](https://developer.apple.com/documentation/xcode/running_your_app_in_the_simulator_or_on_a_device)

### 1.2 Project Installation

Once all is set up, clone the source locally:

```sh
git clone https://git.bacardiapps.com/mobile-apps/drinkonomy-front
cd drinkonomy-front
```

Install yarn dependencies:

```sh
yarn
```

### 1.3 Running the App

Start the Metro development server:

```sh
yarn start
```

#### Run on iOS simulator

```sh
yarn ios
yarn ios --simulator="SIMULATOR_NAME"
yarn ios --device="DEVICE_NAME"
```

To get list of available iOS devices and simulators run:

```sh
instruments -s devices
```

#### Run on Android emulator

```sh
yarn android
yarn android --deviceId="DEVICE_ID"
```

To get list of available devices ids' run:

```sh
adb devices
```

#### Build on Android developmentRelease apk

```sh
yarn android:dev
```

`## Git Patterns

### Opening branches

The developer is responsible to open a new branch whenever it needs to develop one or multiple tasks that are related to one another and cannot be delivered atomically.

### Naming the branch

The developer should follow the [GitFlow](https://leanpub.com/git-flow/read) standard with the following name convention:
`{intention}/{task-name}`
The name uses dash`(-)` for spliting spaces.

### Feature branches

- `feature`: Reserved for the development of new features, or continuing old features
  example:

```
- feature/onboarding
- feature/wallet-api-integration
```

### Hotfix branches

- `hotfix`: reserved for fixing problems of already merged master branches
  example:

```
- hotfix/s3-uploader-paths
- hotfix/test-repository-fix
```

### fix branches

- `fix`: reserved for fixing code problems like a refactor
  example:

```
- fix/signup-hooks
- fix/user-components
```

### Bugfix branches

- `bugfix`: reserved for fixing problems of already merged feature branches
  example:

```
- bugfix/s3-uploader-paths-fixes
- bugfix/signup-issues
```

### Types of commit messages

- feat: A new feature
- fix: A bug fix
- docs: Documentation only changes
- lint: Changes that do not affect the meaning of the code (white-space, formatting, missing semi-colons, etc)
- refactor: A code change that neither fixes a bug nor adds a feature
- test: Adding missing or correcting existing tests
- chore: Changes to the build process or auxiliary tools and libraries such as documentation generation
  example:

```
[feat]: new user field (email)
`
```
