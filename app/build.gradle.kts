plugins {
    id("com.android.application")
    id("kotlin-android")
    id("kotlin-kapt")
    id("base-android-convention")
    id("base-compose-convention")
    id("base-kotlin-convention")
}

android {
    compileSdk = extra["compileSdkVersion"] as Int

    defaultConfig {
        applicationId = "com.vpopov.movienow"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        vectorDrawables {
            useSupportLibrary = true
        }
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                file("proguard-rules.pro")
            )
        }
    }
}

dependencies {
    implementation(project(":core:di"))
    implementation(project(":core:design-system"))
    implementation(project(":core:navigation"))
    implementation(project(":core:network:imp"))
    implementation(project(":feature:movie-list:imp"))
    implementation("androidx.core:core-ktx:1.7.0")
    implementation("androidx.appcompat:appcompat:1.4.1")
    implementation("com.google.android.material:material:1.5.0")
    implementation(libs.composeMaterial)
    implementation(libs.composeTooling)
    implementation(libs.composeNavigation)
    implementation(libs.dagger)
    kapt(libs.daggerKapt)
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.4.0")
    implementation("androidx.activity:activity-compose:1.4.0")
    testImplementation("junit:junit:4.+")
    androidTestImplementation("androidx.test.ext:junit:1.1.3")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.4.0")
}
