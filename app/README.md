# Android Builds

## Libraries

## App Signing

- Google and Users to verify identity of developer who published app
- Guarantees app has not been tampered with since its been signed

## Three Requires Steps

- Create Key Store and Key
  - Build -> Generate Signed Bundle / APK ...  (manual)
  - Project -> app (right-click) -> Open Module Settings  (automate)
- Create signing config in build.gradle
  -  -> Signing Configs
- Assign Signing Config to Build Type
  - BuildType -> config (name of signing config)

## Multi-dex Support

- when more than 64K methods

## Proguard

- clean, shrink, minify apk

## Testing

- build -> reports -> tests?
- build -> test-results ->
- Method i in android.util.Log not mocked
- Use connected tests

## Update Old Project

- Update Android Gradle plugin
  - [versions](https://developer.android.com/studio/releases/gradle-plugin.html#updating-gradle)
  - [releases](https://gradle.org/releases/)
  - $ gradle --version
- Update Gradle Wrapper
  - after updating to latest gradle run command:
  - $ gradle wrapper
  - re-creates wrapper including updates to shell scripts or wrapper jar
  - open gradle/wrapper/gradle-wrapper.properties
  - change ../../gradle-.6.7-bin.zip to ../../gradle-.6.7-all.zip
  - sync gradle
- Update SDK, build tools, libraries, etc.

## Resources

- [Gradle Versions Plugin](https://github.com/ben-manes/gradle-versions-plugin)

