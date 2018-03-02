@file:Suppress("NOTHING_TO_INLINE", "ClassName")

package kotfx.layout

import javafx.collections.ObservableList
import javafx.scene.Node
import javafx.scene.control.Tab
import javafx.scene.control.TabPane
import kotfx.annotations.LayoutDsl

interface TabManager {

    fun getTabs(): ObservableList<Tab>

    fun <T : Tab> T.add(): T = apply { getTabs() += this }
}

class _TabPane(vararg tabs: Tab) : TabPane(*tabs), TabManager

inline fun tabPane(vararg tabs: Tab, noinline init: ((@LayoutDsl _TabPane).() -> Unit)? = null): TabPane = _TabPane(*tabs).apply { init?.invoke(this) }
inline fun ChildManager.tabPane(vararg tabs: Tab, noinline init: ((@LayoutDsl _TabPane).() -> Unit)? = null): TabPane = kotfx.layout.tabPane(*tabs, init = init).add()
inline fun ItemManager.tabPane(vararg tabs: Tab, noinline init: ((@LayoutDsl _TabPane).() -> Unit)? = null): TabPane = kotfx.layout.tabPane(*tabs, init = init).add()
inline fun ButtonManager.tabPane(vararg tabs: Tab, noinline init: ((@LayoutDsl _TabPane).() -> Unit)? = null): TabPane = kotfx.layout.tabPane(*tabs, init = init).add()

inline fun tab(text: String? = null, content: Node? = null, noinline init: ((@LayoutDsl Tab).() -> Unit)? = null): Tab = Tab(text, content).apply { init?.invoke(this) }
inline fun TabManager.tab(text: String? = null, content: Node? = null, noinline init: ((@LayoutDsl Tab).() -> Unit)? = null): Tab = kotfx.layout.tab(text, content, init).add()