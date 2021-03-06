@file:JvmMultifileClass
@file:JvmName("KtfxLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.HLineTo
import kotlin.Double
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [HLineTo] to this manager.
 *
 * @return the control added.
 */
public fun PathElementManager.hlineTo(x: Double = 0.0): HLineTo = hlineTo(x = x) { }

/**
 * Create a [HLineTo] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
public inline fun hlineTo(
    x: Double = 0.0,
    configuration: (@KtfxLayoutDslMarker HLineTo).() ->    
    Unit
): HLineTo {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = HLineTo(x)
    child.configuration()
    return child
}

/**
 * Add a [HLineTo] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
public inline fun PathElementManager.hlineTo(
    x: Double = 0.0,
    configuration: (
        @KtfxLayoutDslMarker    
        HLineTo
    ).() -> Unit
): HLineTo {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = HLineTo(x)
    child.configuration()
    return addChild(child)
}
