plugins {
    id("my-java-library")
    kotlin("jvm") version "1.9.0"
}


dependencies {
    implementation("org.example.my-app:shared-utils")
    api("org.example.my-app:data-model") //alternative: implementation(project(":data-model"))
    //compileOnly("")
    //compileOnlyApi("")

    implementation("org.apache.commons:commons-lang3:3.9")
}
