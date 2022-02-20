plugins {
    id("android-library-convention")
    id("kotlin-kapt")
    id("base-compose-convention")
}

android {
    kapt {
        correctErrorTypes = true
    }
}

dependencies {
    api(project(":feature:movie-list:api"))
    implementation(project(":core:di"))
    implementation(project(":core:navigation"))
    implementation(project(":core:util"))
    implementation(project(":core:design-system"))
    implementation(libs.composeMaterial)
    implementation(libs.composeTooling)
    implementation(libs.coroutinesCore)
    implementation(libs.dagger)
    kapt(libs.daggerKapt)
}
