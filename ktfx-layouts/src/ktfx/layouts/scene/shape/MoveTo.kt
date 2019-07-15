@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.shape.MoveTo

/** Creates a [MoveTo]. */
fun moveTo(
    x: Double = 0.0,
    y: Double = 0.0,
    init: ((@LayoutDslMarker MoveTo).() -> Unit)? = null
): MoveTo = MoveTo(x, y).also { init?.invoke(it) }

/** Creates a [MoveTo] and add it to this manager. */
inline fun PathElementManager.moveTo(
    x: Double = 0.0,
    y: Double = 0.0,
    noinline init: ((@LayoutDslMarker MoveTo).() -> Unit)? = null
): MoveTo = ktfx.layouts.moveTo(x, y, init).add()
