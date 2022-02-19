import com.android.build.gradle.BaseExtension

configure<BaseExtension> {
    setCompileSdkVersion(project.extra["compileSdkVersion"] as Int)
    defaultConfig {
        minSdk = project.extra["minSdkVersion"] as Int
        targetSdk = project.extra["targetSdkVersion"] as Int
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    packagingOptions {
        resources.excludes.add("META-INF/DEPENDENCIES")
        resources.excludes.add("META-INF/LICENSE")
        resources.excludes.add("META-INF/LICENSE.txt")
        resources.excludes.add("META-INF/license.txt")
        resources.excludes.add("META-INF/NOTICE")
        resources.excludes.add("META-INF/NOTICE.txt")
        resources.excludes.add("META-INF/notice.txt")
        resources.excludes.add("META-INF/ASL2.0")
        resources.excludes.add("META-INF/*.kotlin_module")
        resources.excludes.add("META-INF/gradle/incremental.annotation.processors")
    }
}