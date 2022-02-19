plugins {
    id("detekt-convention")
    id("ktlint-convention")
}

allprojects {
    extra["minSdkVersion"] = 23
    extra["compileSdkVersion"] = 32
    extra["targetSdkVersion"] = 32
}

tasks.register("clean", Delete::class) {
    delete(rootProject.buildDir)
    delete("${rootProject.projectDir}/reports")
}
