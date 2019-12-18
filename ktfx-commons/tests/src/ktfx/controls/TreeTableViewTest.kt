package ktfx.controls

import javafx.scene.control.TreeTableView
import kotlin.test.Test
import kotlin.test.assertEquals
import ktfx.test.ToolkitInitializer

class TreeTableViewTest : ToolkitInitializer {

    @Test fun columns() {
        val treeTable = TreeTableView<Nothing>()
        treeTable.columns {
            "Full name"<String> {
                columns {
                    column<String>("First name")
                    column<String>("Last name")
                }
            }
            column<Int>("Age")
        }
        assertEquals(treeTable.columns[0].text, "Full name")
        assertEquals(treeTable.columns[0].columns[0].text, "First name")
        assertEquals(treeTable.columns[0].columns[1].text, "Last name")
        assertEquals(treeTable.columns[1].text, "Age")
    }
}
