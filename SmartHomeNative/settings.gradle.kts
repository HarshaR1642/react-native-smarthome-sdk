pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
        mavenLocal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
      maven {
        name = "smarthomesdk"
        url = uri("https://maven.pkg.github.com/HarshaR1642/react-native-smarthome-sdk")
        credentials {
          username = "HarshaR1642"
          password = "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"
        }
      }
    }
}

rootProject.name = "SmartHomeSDK"
include(":app")
