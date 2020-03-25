plugins {
    id("pl.allegro.tech.build.axion-release") version "1.11.0"
}
scmVersion {
    useHighestVersion = true
    versionCreator("versionWithBranch")
    versionIncrementer("incrementMinor")
}

project.version = scmVersion.version