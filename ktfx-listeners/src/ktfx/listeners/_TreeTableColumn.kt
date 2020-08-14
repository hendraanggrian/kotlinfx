@file:JvmMultifileClass
@file:JvmName("FxListenersKt")
@file:Suppress("NOTHING_TO_INLINE")

package ktfx.listeners

import javafx.scene.control.TreeTableColumn
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * @see TreeTableColumn.setOnEditStart
 */
inline fun <S, T> TreeTableColumn<S, T>.onEditStart(
    noinline
    action: (TreeTableColumn.CellEditEvent<S, T>) -> Unit
): Unit = setOnEditStart(action)

/**
 * @see TreeTableColumn.setOnEditCommit
 */
inline fun <S, T> TreeTableColumn<S, T>.onEditCommit(
    noinline
    action: (TreeTableColumn.CellEditEvent<S, T>) -> Unit
): Unit = setOnEditCommit(action)

/**
 * @see TreeTableColumn.setOnEditCancel
 */
inline fun <S, T> TreeTableColumn<S, T>.onEditCancel(
    noinline
    action: (TreeTableColumn.CellEditEvent<S, T>) -> Unit
): Unit = setOnEditCancel(action)
