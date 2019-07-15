@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE", "ClassName")

package ktfx.layouts

import javafx.geometry.Insets
import javafx.geometry.Orientation
import javafx.geometry.Orientation.HORIZONTAL
import javafx.scene.Node
import javafx.scene.layout.FlowPane

open class _FlowPane(orientation: Orientation, hgap: Double, vgap: Double) : FlowPane(orientation, hgap, vgap),
    NodeManager, MarginableConstraints {

    override fun <R : Node> R.add(): R = also { children += it }

    override fun Node.reset(): Unit = clearConstraints(this)

    override var Node.margins: Insets?
        get() = getMargin(this)
        set(value) = setMargin(this, value)
}

/** Creates a [FlowPane]. */
fun flowPane(
    orientation: Orientation = HORIZONTAL,
    hgap: Double = 0.0,
    vgap: Double = 0.0,
    init: ((@LayoutDslMarker _FlowPane).() -> Unit)? = null
): FlowPane = _FlowPane(orientation, hgap, vgap).also { init?.invoke(it) }

/** Creates a [FlowPane] and add it to this manager. */
inline fun NodeManager.flowPane(
    orientation: Orientation = HORIZONTAL,
    hgap: Double = 0.0,
    vgap: Double = 0.0,
    noinline init: ((@LayoutDslMarker _FlowPane).() -> Unit)? = null
): FlowPane = ktfx.layouts.flowPane(orientation, hgap, vgap, init).add()
