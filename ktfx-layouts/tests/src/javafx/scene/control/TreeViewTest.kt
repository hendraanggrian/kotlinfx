package ktfx.layouts

import javafx.scene.control.TreeView
import ktfx.test.LayoutTest
import kotlin.test.assertNull

class TreeViewTest : LayoutTest<NodeManager, TreeView<String>>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = treeView<String> { }
    override fun NodeManager.child2() = treeView<String>()
    override fun NodeManager.child3() = treeView<String> { }

    override fun TreeView<String>.testDefaultValues() {
        assertNull(root)
    }
}