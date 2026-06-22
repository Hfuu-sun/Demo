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
    }
}
plugins {
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven(url = "https://maven.aliyun.com/nexus/content/repositories/central/")
        maven(url = "https://maven.aliyun.com/repository/google")
        maven(url = "https://maven.aliyun.com/repository/jcenter")
        maven {
            url = uri("http://172.16.15.158:8081/artifactory/libs-release-local")
            isAllowInsecureProtocol = true
            credentials {
                username = providers.gradleProperty("MAVENUSER").orNull
                password = providers.gradleProperty("MAVENPASSWORD").orNull
            }
        }
        maven(url = "https://jitpack.io")
    }
}

        rootProject.name = "Demo"
        include(":app")