## Version Catalog Example

This is an sample project demonstrating how to integrate a published Version Catalog in your Android Project.

### Add catalog to your project

You need to add the catalog in the `settings.gradle(.kts)` file of your project.

```kotlin
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
```
### Use the dependencies in the catalog

Libraries defined in the catalog can be added to the project as shown below.

```kotlin
dependencies {
    implementation(androidx.core)
    implementation(androidx.appCompat)
}
```

Refer to the [article](https://umang91.medium.com/integrating-a-version-catalog-c5c7d45516dbß) for a step by step guide on the integration steps.