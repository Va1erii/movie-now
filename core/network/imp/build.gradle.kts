plugins {
    id("android-library-convention")
    id("kotlin-kapt")

}

dependencies {
    api(project(":core:network:api"))
    implementation(project(":core:di"))
    implementation(libs.dagger)
    kapt(libs.daggerKapt)
    implementation(libs.retrofit)
}