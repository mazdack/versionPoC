plugins {
    id("org.jetbrains.kotlin.jvm")
    `java-library`
    id("pl.allegro.tech.build.axion-release") version "1.11.0"
    `maven-publish`
}
scmVersion {
    useHighestVersion = true
    versionCreator("versionWithBranch")
    versionIncrementer("incrementMinor")
}

project.version = scmVersion.version

dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
}