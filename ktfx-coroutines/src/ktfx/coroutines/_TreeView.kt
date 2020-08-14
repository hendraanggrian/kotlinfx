@file:JvmMultifileClass
@file:JvmName("FxCoroutinesKt")

package ktfx.coroutines

import javafx.scene.control.ScrollToEvent
import javafx.scene.control.TreeView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.javafx.JavaFx
import kotlinx.coroutines.launch
import kotlin.Int
import kotlin.Unit
import kotlin.coroutines.CoroutineContext
import kotlin.jvm.JvmMultifileClass
import kotlin.jvm.JvmName

/**
 * @see TreeView.setOnEditStart
 */
fun <T> TreeView<T>.onEditStart(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(TreeView.EditEvent<T>) -> Unit
): Unit = setOnEditStart { event ->
    GlobalScope.launch(context) { action(event) }
}

/**
 * @see TreeView.setOnEditCommit
 */
fun <T> TreeView<T>.onEditCommit(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(TreeView.EditEvent<T>) -> Unit
): Unit = setOnEditCommit { event ->
    GlobalScope.launch(context) { action(event) }
}

/**
 * @see TreeView.setOnEditCancel
 */
fun <T> TreeView<T>.onEditCancel(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(TreeView.EditEvent<T>) -> Unit
): Unit = setOnEditCancel { event ->
    GlobalScope.launch(context) { action(event) }
}

/**
 * @see TreeView.setOnScrollTo
 */
fun <T> TreeView<T>.onScrollTo(
    context: CoroutineContext = Dispatchers.JavaFx,
    action: suspend    
    CoroutineScope.(ScrollToEvent<Int>) -> Unit
): Unit = setOnScrollTo { event ->
    GlobalScope.launch(context) { action(event) }
}
