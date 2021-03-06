@file:JvmMultifileClass
@file:JvmName("ControlsFxLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.controlsfx.layouts

import ktfx.layouts.KtfxLayoutDslMarker
import ktfx.layouts.NodeManager
import org.controlsfx.control.HiddenSidesPane
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * Add a [HiddenSidesPane] to this manager.
 *
 * @return the control added.
 */
public fun NodeManager.hiddenSidesPane(): HiddenSidesPane = hiddenSidesPane() { }

/**
 * Create a [HiddenSidesPane] with configuration block.
 *
 * @param configuration the configuration block.
 * @return the control created.
 */
public inline fun hiddenSidesPane(
    configuration: (@KtfxLayoutDslMarker KtfxHiddenSidesPane).() ->
    Unit
): HiddenSidesPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxHiddenSidesPane()
    child.configuration()
    return child
}

/**
 * Add a [HiddenSidesPane] with configuration block to this manager.
 *
 * @param configuration the configuration block.
 * @return the control added.
 */
public inline fun NodeManager.hiddenSidesPane(
    configuration: (
        @KtfxLayoutDslMarker
        KtfxHiddenSidesPane
    ).() -> Unit
): HiddenSidesPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxHiddenSidesPane()
    child.configuration()
    return addChild(child)
}

/**
 * Create a styled [HiddenSidesPane].
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control created.
 */
public fun styledHiddenSidesPane(vararg styleClass: String, id: String? = null): HiddenSidesPane =
    styledHiddenSidesPane(styleClass = *styleClass, id = id) { }

/**
 * Add a styled [HiddenSidesPane] to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @return the styled control added.
 */
public fun NodeManager.styledHiddenSidesPane(vararg styleClass: String, id: String? = null):
    HiddenSidesPane = styledHiddenSidesPane(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [HiddenSidesPane] with configuration block.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control created.
 */
public inline fun styledHiddenSidesPane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@KtfxLayoutDslMarker KtfxHiddenSidesPane).() -> Unit
): HiddenSidesPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxHiddenSidesPane()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return child
}

/**
 * Add a styled [HiddenSidesPane] with configuration block to this manager.
 *
 * @param styleClass the CSS style class.
 * @param id the CSS id.
 * @param configuration the configuration block.
 * @return the styled control added.
 */
public inline fun NodeManager.styledHiddenSidesPane(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@KtfxLayoutDslMarker KtfxHiddenSidesPane).() -> Unit
): HiddenSidesPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    val child = KtfxHiddenSidesPane()
    child.styleClass += styleClass
    child.id = id
    child.configuration()
    return addChild(child)
}
