package ktfx

import javafx.scene.Node
import javafx.scene.control.Menu
import javafx.scene.control.MenuItem
import javafx.scene.control.Tab
import javafx.scene.control.TitledPane
import javafx.scene.shape.PathElement
import ktfx.internal.KtfxInternals
import ktfx.internal.KtfxManager

/** Manager for most panes. */
interface NodeManager : KtfxManager<Node> {

    companion object {
        /** Managers delegated by this object must override `invoke` to avoid unsupported error operation. */
        val INVOKABLE_ONLY: NodeManager = object : NodeManager {
            override val collection: MutableCollection<Node>
                get() = KtfxInternals.fail {
                    "This manager has no children, because it is intended to be invokable only."
                }
        }
    }
}

/** Manager for [javafx.scene.control.Accordion]. */
interface TitledPaneManager : KtfxManager<TitledPane>

/** Manager for [javafx.scene.control.MenuBar]. */
interface MenuManager : KtfxManager<Menu>

/** Manager for [javafx.scene.control.SplitMenuButton]. */
interface MenuItemManager : KtfxManager<MenuItem>

/** Manager for [javafx.scene.control.TabPane]. */
interface TabManager : KtfxManager<Tab>

/** Manager for [javafx.scene.shape.Path]. */
interface PathElementManager : KtfxManager<PathElement>