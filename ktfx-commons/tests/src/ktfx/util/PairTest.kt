package ktfx.util

import ktfx.component1
import ktfx.component2
import ktfx.toFxPair
import ktfx.toKotlinPair
import org.junit.Test
import kotlin.test.assertEquals

class PairTest {

    @Test fun toKotlinPair() {
        val (s, i) = Pair("Hello", 123).toFxPair()
        assertEquals("Hello", s)
        assertEquals(123, i)
    }

    @Test fun toFxPair() {
        val (s, i) = javafx.util.Pair("Hello", 123).toKotlinPair()
        assertEquals("Hello", s)
        assertEquals(123, i)
    }
}