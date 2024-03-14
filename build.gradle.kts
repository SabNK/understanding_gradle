plugins {
    id("java-library") // Gradle Core Plugin
    kotlin("jvm") version "1.9.0" // Community plugin with Version
    //Locally defined Plugin e.g. convention plugin
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}