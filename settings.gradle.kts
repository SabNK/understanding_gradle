pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
    }
    includeBuild("../my-build-logic")
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
    includeBuild("../my-other-project")
    includeBuild(".")
}

rootProject.name = "my-project"

rootDir.listFiles().filter{ it.isDirectory && !it.isHidden
        && it.name != "gradle"

    //windows case - Hidden not starts with dot!
        && !it.name.startsWith('.')}.forEach{
    include(it.name)
}
//alternative!

/*include("app")
include("business-logic")
include("data-model")*/

//from intellij for java resolution
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.5.0"
}

