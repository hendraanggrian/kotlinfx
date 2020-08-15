plugins {
    `git-publish`
}

gitPublish {
    repoUri.set(RELEASE_WEB)
    branch.set("gh-pages")
    contents.from(
        "src",
        *ktfxArtifacts
            .map { "../$it/build/docs" }
            .toTypedArray()
    )
}

tasks["gitPublishCopy"].dependsOn(
    *ktfxArtifacts
        .map { it.replace('/', ':') }
        .map { ":$it:dokka" }
        .toTypedArray()
)

val ktfxArtifacts: List<String>
    get() = listOf("commons", "layouts", "listeners", "coroutines").map { "$RELEASE_ARTIFACT-$it" } +
            listOf("controlsfx", "jfoenix").flatMap {
                listOf(
                    "features/$it-commons",
                    "features/$it-layouts",
                    "features/$it-listeners",
                    "features/$it-coroutines"
                )
            }