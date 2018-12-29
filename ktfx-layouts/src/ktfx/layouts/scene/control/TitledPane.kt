@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE", "ClassName")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.TitledPane

open class _TitledPane(title: String?) : TitledPane(title, null), NodeInvokable {

    override operator fun <T : Node> T.invoke(): T = also { content = it }
}

/** Creates a [TitledPane]. */
fun titledPane(
    title: String? = null,
    init: ((@LayoutMarker _TitledPane).() -> Unit)? = null
): TitledPane = _TitledPane(title).also { init?.invoke(it) }

/** Creates a [TitledPane] and add it to this manager. */
inline fun NodeInvokable.titledPane(
    title: String? = null,
    noinline init: ((@LayoutMarker _TitledPane).() -> Unit)? = null
): TitledPane = ktfx.layouts.titledPane(title, init)()

/** Creates a [TitledPane] and add it to this manager. */
inline fun TitledPaneInvokable.titledPane(
    title: String? = null,
    noinline init: ((@LayoutMarker _TitledPane).() -> Unit)? = null
): TitledPane = ktfx.layouts.titledPane(title, init)()