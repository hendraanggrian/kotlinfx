@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.jfoenix

import com.jfoenix.controls.JFXTogglePane
import ktfx.layouts.NodeInvokable
import ktfx.layouts.LayoutMarker

/** Creates a [JFXTogglePane]. */
fun jfxTogglePane(
    init: ((@LayoutMarker JFXTogglePane).() -> Unit)? = null
): JFXTogglePane = JFXTogglePane().also { init?.invoke(it) }

/** Creates a [JFXTogglePane] and add it to this manager. */
inline fun NodeInvokable.jfxTogglePane(
    noinline init: ((@LayoutMarker JFXTogglePane).() -> Unit)? = null
): JFXTogglePane = ktfx.jfoenix.jfxTogglePane(init)()