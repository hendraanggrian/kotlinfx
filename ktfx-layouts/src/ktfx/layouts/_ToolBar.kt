@file:JvmMultifileClass
@file:JvmName("LayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.layouts

import javafx.scene.control.ToolBar
import kotlin.String
import kotlin.Unit
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind.EXACTLY_ONCE
import kotlin.contracts.contract
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName
import ktfx.internal.KtfxInternals.newChild

/**
 * Add a [ToolBar] to this manager.
 */
fun NodeManager.toolBar(): ToolBar = toolBar() { }

/**
 * Create a [ToolBar] with configuration block.
 */
inline fun toolBar(configuration: (@LayoutDslMarker KtfxToolBar).() -> Unit): ToolBar {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(KtfxToolBar(), configuration = configuration)
}

/**
 * Add a [ToolBar] with configuration block to this manager.
 */
inline fun NodeManager.toolBar(configuration: (@LayoutDslMarker KtfxToolBar).() -> Unit): ToolBar {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(newChild(KtfxToolBar(), configuration = configuration))
}

/**
 * Create a styled [ToolBar].
 */
fun styledToolBar(vararg styleClass: String, id: String? = null): ToolBar = styledToolBar(styleClass =
        *styleClass, id = id) { }

/**
 * Add a styled [ToolBar] to this manager.
 */
fun NodeManager.styledToolBar(vararg styleClass: String, id: String? = null): ToolBar =
        styledToolBar(styleClass = *styleClass, id = id) { }

/**
 * Create a styled [ToolBar] with configuration block.
 */
inline fun styledToolBar(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxToolBar).() -> Unit
): ToolBar {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return newChild(KtfxToolBar(), styleClass = *styleClass, id = id, configuration = configuration)
}

/**
 * Add a styled [ToolBar] with configuration block to this manager.
 */
inline fun NodeManager.styledToolBar(
    vararg styleClass: String,
    id: String? = null,
    configuration: (@LayoutDslMarker KtfxToolBar).() -> Unit
): ToolBar {
    contract { callsInPlace(configuration, EXACTLY_ONCE) }
    return addChild(newChild(KtfxToolBar(), styleClass = *styleClass, id = id, configuration =
            configuration))
}
