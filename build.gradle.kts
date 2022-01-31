plugins {
    kotlin("jvm") version "1.6.10"
}

group = "com.katzendorn.okb.first"
version = "0.0.1"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))
}

val myFirstTask: Task = tasks.create("myFirstTask") {
    doFirst {
        println("Hello, Gradle!")
    }
}