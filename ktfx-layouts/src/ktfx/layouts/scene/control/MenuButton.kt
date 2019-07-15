@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE", "ClassName")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.MenuButton
import javafx.scene.control.MenuItem

open class _MenuButton(text: String?, graphic: Node?) : MenuButton(text, graphic), MenuItemManager {

    override fun <R : MenuItem> R.add(): R = also { items + it }

    /** Creates a [MenuItem] and add it to this manager. */
    inline operator fun String.invoke(
        graphic: Node? = null,
        noinline init: ((@LayoutDslMarker MenuItem).() -> Unit)? = null
    ): MenuItem = menuItem(this, graphic, init)
}

/** Creates a [MenuButton]. */
fun menuButton(
    text: String? = null,
    graphic: Node? = null,
    init: ((@LayoutDslMarker _MenuButton).() -> Unit)? = null
): MenuButton = _MenuButton(text, graphic).also { init?.invoke(it) }

/** Creates a [MenuButton] and add it to this manager. */
inline fun NodeManager.menuButton(
    text: String? = null,
    graphic: Node? = null,
    noinline init: ((@LayoutDslMarker _MenuButton).() -> Unit)? = null
): MenuButton = ktfx.layouts.menuButton(text, graphic, init).add()
