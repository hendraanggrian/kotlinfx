package ktfx.bindings

import ktfx.booleanPropertyOf
import ktfx.collections.observableListOf
import ktfx.collections.observableSetOf
import ktfx.doublePropertyOf
import ktfx.floatPropertyOf
import ktfx.intPropertyOf
import ktfx.longPropertyOf
import ktfx.propertyOf
import ktfx.time.m
import ktfx.time.s
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertNull

class BindingsSetTest {

    @Test fun multipleDependencies() {
        val dependency1 = propertyOf(1.m)
        val dependency2 = propertyOf(30.s)
        val binding = setBindingOf(
            dependency1,
            dependency2
        ) { observableSetOf(dependency1.value, dependency2.value) }
        assertEquals(1.m, binding.value.first())
        dependency1.value = 15.s
        assertEquals(30.s, binding.value.drop(1).first())
    }

    @Test fun anyDependency() {
        val dependency = propertyOf(1.m)
        val binding = dependency.asSet { it?.let { observableSetOf(it.toMillis()) } }
        assertEquals(60000.0, binding.value.first())
        dependency.value = null
        assertNull(binding.value)
    }

    @Test fun booleanDependency() {
        val dependency = booleanPropertyOf()
        val binding = dependency.asSet { observableSetOf(it) }
        assertEquals(false, binding.value.first())
        dependency.value = true
        assertEquals(true, binding.value.first())
    }

    @Test fun doubleDependency() {
        val dependency = doublePropertyOf()
        val binding = dependency.asSet { observableSetOf(it) }
        assertEquals(0.0, binding.value.first())
        dependency.value = Double.MAX_VALUE
        assertEquals(Double.MAX_VALUE, binding.value.first())
    }

    @Test fun floatDependency() {
        val dependency = floatPropertyOf()
        val binding = dependency.asSet { observableSetOf(it) }
        assertEquals(0f, binding.value.first())
        dependency.value = Float.MAX_VALUE
        assertEquals(Float.MAX_VALUE, binding.value.first())
    }

    @Test fun intDependency() {
        val dependency = intPropertyOf()
        val binding = dependency.asSet { observableSetOf(it) }
        assertEquals(0, binding.value.first())
        dependency.value = Int.MAX_VALUE
        assertEquals(Int.MAX_VALUE, binding.value.first())
    }

    @Test fun longDependency() {
        val dependency = longPropertyOf()
        val binding = dependency.asSet { observableSetOf(it) }
        assertEquals(0L, binding.value.first())
        dependency.value = Long.MAX_VALUE
        assertEquals(Long.MAX_VALUE, binding.value.first())
    }
}
