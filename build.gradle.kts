import pl.allegro.tech.build.axion.release.domain.TagNameSerializationConfig

/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Kotlin library project to get you started.
 */

plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
    id("pl.allegro.tech.build.axion-release") version "1.11.0"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
    `maven-publish`
}

publishing {
    repositories {
        mavenLocal()
    }
}

allprojects {
    repositories {
        // Use jcenter for resolving dependencies.
        // You can declare any Maven/Ivy/file repository here.
        jcenter()
    }
}

subprojects {
    val myProject = this
    apply(plugin = "pl.allegro.tech.build.axion-release")

    scmVersion {
        useHighestVersion = true
        versionCreator("versionWithBranch")
        versionIncrementer("incrementMinor")
        tag(closureOf<TagNameSerializationConfig> {
            prefix = myProject.name
        })
    }

    version = scmVersion.version
}