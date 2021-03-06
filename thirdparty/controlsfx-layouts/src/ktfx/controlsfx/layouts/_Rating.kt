@file:JvmMultifileClass
@file:JvmName("ControlsFxLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.controlsfx.layouts

import ktfx.layouts.KtfxLayoutDslMarker
import ktfx.layouts.NodeManager
import org.controlsfx.control.Rating
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [Rating] to this manager.
 *
 * @return the control added.
 */
public fun NodeManager.rating(max: Int = 5, rating: Int = -1): Rating = rating(
    max = max,
    rating =
    rating
) { }

/**
 * Create a [Rating] with configuration block.
 * @param configuration the configuration block.
 *
 * @return the control created.
 */
public inline fun rating(
    max: Int = 5,
    rating: Int = -1,
    configuration: (@KtfxLayoutDslMarker Rating).() -> Unit
): Rating {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = Rating(max, rating)
    child.configuration()
    return child
}

/**
 * Add a [Rating] with configuration block to this manager.
 * @param configuration the configuration block.
 *
 * @return the control added.
 */
public inline fun NodeManager.rating(
    max: Int = 5,
    rating: Int = -1,
    configuration: (@KtfxLayoutDslMarker Rating).() -> Unit
): Rating {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = Rating(max, rating)
    child.configuration()
    return addChild(child)
}

/**
 * Create a styled [Rating].
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control created.
 */
public fun styledRating(
    max: Int = 5,
    rating: Int = -1,
    vararg styleClass: String,
    id: String? = null
): Rating = styledRating(max = max, rating = rating, styleClass = *styleClass, id = id) { }

/**
 * Add a styled [Rating] to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 *
 * @return the styled control added.
 */
public fun NodeManager.styledRating(
    max: Int = 5,
    rating: Int = -1,
    vararg styleClass: String,
    id: String? = null
): Rating = styledRating(max = max, rating = rating, styleClass = *styleClass, id = id) { }

/**
 * Create a styled [Rating] with configuration block.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control created.
 */
public inline fun styledRating(
    max: Int = 5,
    rating: Int = -1,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@KtfxLayoutDslMarker Rating).() -> Unit
): Rating {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = Rating(max, rating)
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [Rating] with configuration block to this manager.
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 *
 * @return the styled control added.
 */
public inline fun NodeManager.styledRating(
    max: Int = 5,
    rating: Int = -1,
    vararg styleClass: String,
    id: String? = null,
    configuration: (@KtfxLayoutDslMarker Rating).() -> Unit
): Rating {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = Rating(max, rating)
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
