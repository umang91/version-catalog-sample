import org.gradle.kotlin.dsl.execution.ProgramText.Companion.from

pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}
enableFeaturePreview("VERSION_CATALOGS")

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("androidx") {
            from("dev.assemblage:androidx-catalog:0.0.1")
        }
    }
}
rootProject.name = "VersionCatalogExample"
include(":app")
