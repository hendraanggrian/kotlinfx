@file:JvmMultifileClass
@file:JvmName("JfoenixLayoutsKt")
@file:OptIn(ExperimentalContracts::class)

package ktfx.jfoenix.layouts

import com.jfoenix.controls.JFXListCell
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.InvocationKind
import kotlin.contracts.contract
import ktfx.layouts.LayoutDslMarker
import ktfx.layouts.NodeManager
import ktfx.layouts.addChild

/** Create a [JFXListCell] with configuration block. */
inline fun <T> jfxListCell(
    configuration: (@LayoutDslMarker JFXListCell<T>).() -> Unit
): JFXListCell<T> {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return JFXListCell<T>().apply(configuration)
}

/** Add a [JFXListCell] to this manager. */
fun <T> NodeManager.jfxListCell(): JFXListCell<T> = addChild(JFXListCell())

/** Add a [JFXListCell] with configuration block to this manager. */
inline fun <T> NodeManager.jfxListCell(
    configuration: (@LayoutDslMarker JFXListCell<T>).() -> Unit
): JFXListCell<T> {
    contract { callsInPlace(configuration, InvocationKind.EXACTLY_ONCE) }
    return addChild(JFXListCell(), configuration)
}
