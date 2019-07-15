@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.CheckMenuItem

/** Creates a [CheckMenuItem]. */
fun checkMenuItem(
    text: String? = null,
    graphic: Node? = null,
    init: ((@LayoutDslMarker CheckMenuItem).() -> Unit)? = null
): CheckMenuItem = CheckMenuItem(text, graphic).also { init?.invoke(it) }

/** Creates a [CheckMenuItem] and add it to this manager. */
inline fun MenuItemManager.checkMenuItem(
    text: String? = null,
    graphic: Node? = null,
    noinline init: ((@LayoutDslMarker CheckMenuItem).() -> Unit)? = null
): CheckMenuItem = ktfx.layouts.checkMenuItem(text, graphic, init).add()
