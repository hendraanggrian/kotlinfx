const val ARTIFACT_COMMONS = "$RELEASE_ARTIFACT-commons"
const val ARTIFACT_COROUTINES = "$RELEASE_ARTIFACT-coroutines"
const val ARTIFACT_LAYOUTS = "$RELEASE_ARTIFACT-layouts"
const val ARTIFACT_LISTENERS = "$RELEASE_ARTIFACT-listeners"
const val ARTIFACT_STYLES = "$RELEASE_ARTIFACT-styles"
val ARTIFACTS = listOf(ARTIFACT_COMMONS, ARTIFACT_COROUTINES, ARTIFACT_LAYOUTS, ARTIFACT_LISTENERS, ARTIFACT_STYLES)

fun String.asGroup(): String = replace('-', '.')