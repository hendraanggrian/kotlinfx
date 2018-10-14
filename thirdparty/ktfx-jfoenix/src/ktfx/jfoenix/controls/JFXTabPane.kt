@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

/* ktlint-disable package-name */
package ktfx.jfoenix

/* ktlint-enable package-name */

import com.jfoenix.controls.JFXTabPane
import ktfx.NodeManager
import ktfx.annotations.LayoutDsl

/** Creates a [JFXTabPane]. */
fun jfxTabPane(
    init: ((@LayoutDsl JFXTabPane).() -> Unit)? = null
): JFXTabPane = JFXTabPane().also { init?.invoke(it) }

/** Creates a [JFXTabPane] and add it to this manager. */
inline fun NodeManager.jfxTabPane(
    noinline init: ((@LayoutDsl JFXTabPane).() -> Unit)? = null
): JFXTabPane = ktfx.jfoenix.jfxTabPane(init)()