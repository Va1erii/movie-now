enableFeaturePreview("VERSION_CATALOGS")

@Suppress("UnstableApiUsage")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        jcenter()
    }
    versionCatalogs {
        create("libs") {
            from(files("libs.versions.toml"))
        }
    }
}
rootProject.name = "MovieNow"
include(":app")
include(":core:di")
include(":core:design-system")
include(":core:navigation")
include(":core:util")
include(":core:network:api")
include(":core:network:imp")
include(":feature:movie-list:api")
include(":feature:movie-list:imp")