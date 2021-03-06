@file:JvmMultifileClass
@file:JvmName("KtfxListenersKt")
@file:Suppress("NOTHING_TO_INLINE")

package ktfx.listeners

import javafx.event.ActionEvent
import javafx.scene.control.ButtonBase
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * @see ButtonBase.setOnAction
 */
public inline fun ButtonBase.onAction(noinline action: (ActionEvent) -> Unit) {
    return setOnAction(action)
}
