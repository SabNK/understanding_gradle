plugins {
    id("my-java-application")
}

dependencies {
    implementation("org.example.my-app:business-logic")

    runtimeOnly("org.slf4j:slf4j-simple")
}
