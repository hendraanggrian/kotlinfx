@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXSlider
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import ktfx.layouts.NodeManager
import ktfx.layouts.addNode

/** Create a [JFXSlider] with initialization block. */
inline fun jfxSlider(
    min: Double = 0.0,
    max: Double = 100.0,
    value: Double = 50.0,
    init: JFXSlider.() -> Unit
): JFXSlider {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return JFXSlider(min, max, value).apply(init)
}
/** Add a [JFXSlider] to this manager. */
fun NodeManager.jfxSlider(
    min: Double = 0.0,
    max: Double = 100.0,
    value: Double = 50.0
): JFXSlider = addNode(JFXSlider(min, max, value))

/** Add a [JFXSlider] with initialization block to this manager. */
inline fun NodeManager.jfxSlider(
    min: Double = 0.0,
    max: Double = 100.0,
    value: Double = 50.0,
    init: JFXSlider.() -> Unit
): JFXSlider {
    contract { callsInPlace(init, InvocationKind.EXACTLY_ONCE) }
    return addNode(JFXSlider(min, max, value), init)
}