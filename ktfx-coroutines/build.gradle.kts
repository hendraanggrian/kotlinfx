group = RELEASE_GROUP
version = RELEASE_VERSION

plugins {
    kotlin("jvm")
    dokka
    `maven-publish`
    signing
}

sourceSets {
    main {
        java.srcDir("src")
    }
    test {
        java.srcDir("tests/src")
    }
}

ktlint(
    project(":rulesets:basic"),
    project(":rulesets:non-commons")
)

dependencies {
    api(kotlin("stdlib"))
    api(kotlinx("coroutines-javafx", VERSION_COROUTINES))
    testImplementation(project(":testing:listeners-coroutines"))
}

tasks {
    dokkaJavadoc {
        dokkaSourceSets {
            "main" {
                sourceLink {
                    localDirectory.set(projectDir.resolve("src"))
                    remoteUrl.set(getGithubRemoteUrl())
                    remoteLineSuffix.set("#L")
                }
            }
        }
    }
    dokkaHtml {
        outputDirectory.set(buildDir.resolve("dokka/html/$RELEASE_ARTIFACT-coroutines"))
    }
}

mavenPublishJvm("$RELEASE_ARTIFACT-coroutines")