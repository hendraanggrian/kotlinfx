@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.control.TreeItem
import javafx.scene.control.TreeView

/** Creates a [TreeView]. */
fun <T> treeView(
    root: TreeItem<T>? = null,
    init: ((@LayoutMarker TreeView<T>).() -> Unit)? = null
): TreeView<T> = TreeView<T>(root).also { init?.invoke(it) }

/** Creates a [TreeView] and add it to this manager. */
inline fun <T> NodeInvokable.treeView(
    root: TreeItem<T>? = null,
    noinline init: ((@LayoutMarker TreeView<T>).() -> Unit)? = null
): TreeView<T> = ktfx.layouts.treeView(root, init)()