@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:UseExperimental(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.control.TabPane
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName
import ktfx.internal.KtfxInternals.newChild

/**
 * Add a [TabPane] to this manager.
 */
fun NodeManager.tabPane(): TabPane = tabPane() { }

/**
 * Create a [TabPane] with configuration block.
 */
inline fun tabPane(configuration: (@LayoutDslMarker KtfxTabPane).() -> Unit): TabPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(KtfxTabPane(), configuration = configuration)
}

/**
 * Add a [TabPane] with configuration block to this manager.
 */
inline fun NodeManager.tabPane(configuration: (@LayoutDslMarker KtfxTabPane).() -> Unit): TabPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(newChild(KtfxTabPane(), configuration = configuration))
}

/**
 * Create a styled [TabPane].
 */
fun styledTabPane(vararg styleClass: String): TabPane = styledTabPane(styleClass = *styleClass) { }

/**
 * Add a styled [TabPane] to this manager.
 */
fun NodeManager.styledTabPane(vararg styleClass: String): TabPane = styledTabPane(styleClass =
        *styleClass) { }

/**
 * Create a styled [TabPane] with configuration block.
 */
inline fun styledTabPane(
    vararg styleClass: String,
    configuration: (@LayoutDslMarker    
            KtfxTabPane).() -> Unit
): TabPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(KtfxTabPane(), styleClass = *styleClass, configuration = configuration)
}

/**
 * Add a styled [TabPane] with configuration block to this manager.
 */
inline fun NodeManager.styledTabPane(
    vararg styleClass: String,
    configuration: (@LayoutDslMarker    
            KtfxTabPane).() -> Unit
): TabPane {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(newChild(KtfxTabPane(), styleClass = *styleClass, configuration =
            configuration))
}