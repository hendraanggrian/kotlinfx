package ktfx.layouts

import javafx.scene.control.RadioButton
import ktfx.test.LayoutTest
import kotlin.test.assertNull

class RadioButtonTest : LayoutTest<NodeManager, RadioButton>() {

    override fun manager() = KtfxPane()
    override fun childCount() = manager.childCount
    override fun child1() = radioButton { }
    override fun NodeManager.child2() = radioButton()
    override fun NodeManager.child3() = radioButton { }

    override fun RadioButton.testDefaultValues() {
        assertNull(text)
    }
}