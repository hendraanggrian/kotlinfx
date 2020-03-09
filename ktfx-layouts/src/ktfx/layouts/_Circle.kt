@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.paint.Paint
import javafx.scene.shape.Circle
import kotlin.Double
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName
import ktfx.internal.KtfxInternals.newChild

/**
 * Add a [Circle] to this manager.
 */
fun NodeManager.circle(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radius: Double = 0.0,
    fill: Paint? = null
): Circle = circle(centerX = centerX, centerY = centerY, radius = radius, fill = fill) { }

/**
 * Create a [Circle] with configuration block.
 */
inline fun circle(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radius: Double = 0.0,
    fill: Paint? = null,
    configuration: (@LayoutDslMarker Circle).() -> Unit
): Circle {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(Circle(centerX, centerY, radius, fill), configuration = configuration)
}

/**
 * Add a [Circle] with configuration block to this manager.
 */
inline fun NodeManager.circle(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radius: Double = 0.0,
    fill: Paint? = null,
    configuration: (@LayoutDslMarker Circle).() -> Unit
): Circle {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(newChild(Circle(centerX, centerY, radius, fill), configuration = configuration))
}

/**
 * Create a styled [Circle].
 */
fun styledCircle(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radius: Double = 0.0,
    fill: Paint? = null,
    vararg styleClass: String,
    id: String? = null
): Circle = styledCircle(centerX = centerX, centerY = centerY, radius = radius, fill = fill,
        styleClass = *styleClass, id = id) { }

/**
 * Add a styled [Circle] to this manager.
 */
fun NodeManager.styledCircle(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radius: Double = 0.0,
    fill: Paint? = null,
    vararg styleClass: String,
    id: String? = null
): Circle = styledCircle(centerX = centerX, centerY = centerY, radius = radius, fill = fill,
        styleClass = *styleClass, id = id) { }

/**
 * Create a styled [Circle] with configuration block.
 */
inline fun styledCircle(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radius: Double = 0.0,
    fill: Paint? = null,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker Circle).() -> Unit
): Circle {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(Circle(centerX, centerY, radius, fill), styleClass = *styleClass, id = id,
            configuration = configuration)
}

/**
 * Add a styled [Circle] with configuration block to this manager.
 */
inline fun NodeManager.styledCircle(
    centerX: Double = 0.0,
    centerY: Double = 0.0,
    radius: Double = 0.0,
    fill: Paint? = null,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker Circle).() -> Unit
): Circle {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(newChild(Circle(centerX, centerY, radius, fill), styleClass = *styleClass, id =
            id, configuration = configuration))
}
