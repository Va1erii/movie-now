import org.jlleitschuh.gradle.ktlint.KtlintExtension
import org.jlleitschuh.gradle.ktlint.reporter.ReporterType
import org.jlleitschuh.gradle.ktlint.tasks.GenerateReportsTask

allprojects {
    plugins.apply("org.jlleitschuh.gradle.ktlint")
    val reportsFolder = "${rootDir}/reports/ktlint"
    configure<KtlintExtension> {
        reporters {
            reporter(ReporterType.JSON)
            reporter(ReporterType.HTML)
        }
    }
    tasks.withType<GenerateReportsTask> {
        reportsOutputDirectory.set(File("$reportsFolder/${getProjectName()}"))
    }
}

fun Project.getProjectName(): String {
    val prefix = parent?.name?.takeIf { it != "MovieNow" }?.plus("-") ?: ""
    return "$prefix${project.name}"
}