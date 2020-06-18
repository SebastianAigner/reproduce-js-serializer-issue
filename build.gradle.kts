val kotlinVersion = "1.4-M2"
val serializationVersion = "0.20.0-1.4-M2"
val ktorVersion = "1.3.2-1.4-M2"

plugins {
    id("org.jetbrains.kotlin.js") version "1.4-M2"
    kotlin("plugin.serialization") version "1.4-M2"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    maven("https://dl.bintray.com/kotlin/kotlin-eap")
    mavenCentral()
    maven("https://kotlin.bintray.com/kotlinx")
    mavenCentral()
    jcenter()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation("org.jetbrains.kotlinx:kotlinx-serialization-runtime:$serializationVersion")
    implementation(npm("text-encoding"))
    implementation(npm("abort-controller"))
    implementation(npm("bufferutil"))
    implementation(npm("utf-8-validate"))
    implementation(npm("fs"))
}

kotlin {
    js(IR) {
        browser { }
        binaries.executable()
    }
}