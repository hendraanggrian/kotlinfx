@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.shape.Arc
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract

/** Create an [Arc] with configuration block. */
inline fun arc(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radiusX: Double = 0.0,
    radiusY: Double = 0.0,
    startAngle: Double = 0.0,
    length: Double = 0.0,
    configuration: (@LayoutDslMarker Arc).() -> Unit
): Arc {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return Arc(centerX, centerY, radiusX, radiusY, startAngle, length).apply(configuration)
}

/** Add an [Arc] to this manager. */
fun NodeManager.arc(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radiusX: Double = 0.0,
    radiusY: Double = 0.0,
    startAngle: Double = 0.0,
    length: Double = 0.0
): Arc = addChild(Arc(centerX, centerY, radiusX, radiusY, startAngle, length))

/** Add an [Arc] with configuration block to this manager. */
inline fun NodeManager.arc(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radiusX: Double = 0.0,
    radiusY: Double = 0.0,
    startAngle: Double = 0.0,
    length: Double = 0.0,
    configuration: (@LayoutDslMarker Arc).() -> Unit
): Arc {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(Arc(centerX, centerY, radiusX, radiusY, startAngle, length), configuration)
}
