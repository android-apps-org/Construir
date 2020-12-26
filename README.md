# [Gradle](https://gradle.org/)

## Responsibilities of Build

- Run Tests
- Buy coded resources from multiple resources
- Generate documentation
- Create multiple build variance
- Publish application(s)
- Manage dependencies
- Build has become the software factory:
  - to continually change, test, and release apps
- Gradle: one stop shop
  - to define and integrate all parts of software delivery process
  - i.e. the process that executes modern IDs like Android Studio
    - or CI front end products like Jenkins

## Gradle Tasks

- Self-contained unit of work that Gradle can reason about
- At core of task is its action
  - i.e. task to compile some Java sources
  - or to copy some files from one directory to another
- Can define its inputs and outputs
- gradle wrapper: gradle (jar), gradlew (l/unix), gradlew.bat (windows)
  - ./gradlew (installs gradle if not installed)

## Gradle Daemon

- Gradle has to do significant work to startup,
  - mainly because its required to spin up an instance of JVM
- Startup time can be mitigated by using Gradle Demon
- Demon: process that hangs around in background of OS

## Resources

- [Gradle Version Manager](https://sdkman.io/)
- [Learn Groovy](https://learnxinyminutes.com/docs/groovy/)
- [Gradle DSL](https://docs.gradle.org/current/dsl/)
- [Build Lifecycle](https://docs.gradle.org/current/userguide/build_lifecycle.html)
- [Gradle Plugin](https://docs.gradle.org/current/userguide/plugin_reference.html)
- [Gradle Plugin Portal](https://plugins.gradle.org/)
- [Add Gradle Plugin](https://plugins.gradle.org/docs/submit)

