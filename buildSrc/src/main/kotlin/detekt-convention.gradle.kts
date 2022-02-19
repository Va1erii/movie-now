import io.gitlab.arturbosch.detekt.Detekt
import io.gitlab.arturbosch.detekt.extensions.DetektExtension

allprojects {
    plugins.apply("io.gitlab.arturbosch.detekt")
    val configsFolder = "${rootDir}/configs/detekt"
    val reportsFolder = "${rootDir}/reports/detekt"
    configure<DetektExtension> {
        buildUponDefaultConfig = true
        config = files("$configsFolder/detekt.yml")
    }
    tasks.withType<Detekt>().configureEach {
        jvmTarget = "1.8"
        reports {
            val reportName = prepareReportName()
            html {
                required.set(true)
                outputLocation.set { File("$reportsFolder/${reportName}.html") }
            }
            xml {
                required.set(true)
                outputLocation.set { File("$reportsFolder/${reportName}.xml") }
            }
        }
    }
}

fun Project.prepareReportName(): String {
    val prefix = parent?.name?.takeIf { it != "MovieNow" }?.plus("-") ?: ""
    return "$prefix${project.name}-detekt"
}