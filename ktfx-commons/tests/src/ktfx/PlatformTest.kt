package ktfx

import javafx.application.ConditionalFeature
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.runBlocking
import ktfx.testing.ToolkitTest
import ktfx.testing.assertContains
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

class PlatformTest : ToolkitTest {

    @Test
    fun isFxThread() {
        val check = { ktfx.isFxThread() }
        assertFalse(check())
        ktfx.runLater { assertTrue(check()) }
        runBlocking(Dispatchers.JavaFx) { assertTrue(check()) }
        runBlocking(Dispatchers.IO) { assertFalse(check()) }
    }

    @Test
    fun runLater() {
        // without receiver
        val list = mutableListOf<Int>()
        ktfx.runLater {
            list += 1
            assertContains(list, 2, 1).inOrder()
        }
        list += 2

        // with receiver
        val receiverList = mutableListOf<Int>()
        receiverList.runLater {
            list += 1
            assertContains(list, 2, 1).inOrder()
        }
        receiverList += 2
    }

    @Test
    fun withLater() {
        val list = mutableListOf<Int>()
        withLater(list) {
            this += 1
            assertContains(this, 2, 1).inOrder()
        }
        list += 2
    }

    @Test
    fun applyLater() {
        mutableListOf<Int>().applyLater {
            this += 1
            assertContains(this, 2, 1).inOrder()
        } += 2
    }

    @Test
    fun alsoLater() {
        mutableListOf<Int>().alsoLater {
            it += 1
            assertContains(it, 2, 1).inOrder()
        } += 2
    }

    @Test
    fun letLater() {
        val list = mutableListOf<Int>()
        list.letLater {
            it += 1
            assertContains(it, 2, 1).inOrder()
        }
        list += 2
    }

    @Test
    fun isSupported() {
        assertTrue(ConditionalFeature.CONTROLS.isSupported())
        assertTrue(isSupported(ConditionalFeature.GRAPHICS, ConditionalFeature.CONTROLS))
    }
}