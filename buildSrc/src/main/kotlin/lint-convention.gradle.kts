import com.android.build.gradle.BaseExtension

configure<BaseExtension> {
    val reportsFolder = "${rootDir}/reports/lint"
    val reportName = prepareReportName()
    lintOptions {
        isWarningsAsErrors = true
        isAbortOnError = true
        isCheckDependencies = true
        isCheckReleaseBuilds = true
        htmlReport = true
        htmlOutput = file("${reportsFolder}/${reportName}.html")
        xmlReport = true
        xmlOutput = file("${reportsFolder}/${reportName}.xml")
        isIgnoreTestSources = true
    }
}


fun Project.prepareReportName(): String {
    val prefix = parent?.name?.takeIf { it != "MovieNow" }?.plus("-") ?: ""
    return "$prefix${project.name}-lint-report"
}
