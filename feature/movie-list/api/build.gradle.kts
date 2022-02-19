plugins {
    id("android-library-convention")
}

dependencies {
    implementation(project(":core:di"))
    implementation(project(":core:navigation"))
    implementation(libs.coroutinesCore)
}
