import com.android.build.gradle.BaseExtension

configure<BaseExtension> {
    val versionCatalog = extensions.getByType(VersionCatalogsExtension::class).named("libs")
    buildFeatures.apply {
        compose = true
    }
    composeOptions.apply {
        // Android Studio issue. Cannot use jdk in compile time
        kotlinCompilerExtensionVersion = versionCatalog.findVersion("compose")
            .get()
            .getRequiredVersion()
    }
}