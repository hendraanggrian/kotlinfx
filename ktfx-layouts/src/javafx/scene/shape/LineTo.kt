@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.LineTo
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create a [LineTo] with configuration block. */
inline fun lineTo(
    x: Double = 0.0,
    y: Double = 0.0,
    configuration: (@LayoutDslMarker LineTo).() -> Unit
): LineTo {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return LineTo(x, y).apply(configuration)
}

/** Add a [LineTo] to this manager. */
fun PathElementManager.lineTo(
    x: Double = 0.0,
    y: Double = 0.0
): LineTo = addChild(LineTo(x, y))

/** Add a [LineTo] with configuration block to this manager. */
inline fun PathElementManager.lineTo(
    x: Double = 0.0,
    y: Double = 0.0,
    configuration: (@LayoutDslMarker LineTo).() -> Unit
): LineTo {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(LineTo(x, y), configuration)
}
