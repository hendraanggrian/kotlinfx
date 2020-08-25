@file:JvmMultifileClass
@file:JvmName("KtfxLayoutsKt")
@file:OptIn(ExperimentalContracts::class)
@file:Suppress("NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.geometry.Insets
import javafx.geometry.Orientation
import javafx.scene.Node
import javafx.scene.layout.FlowPane
import kotlin.contracts.ExperimentalContracts

/**
 * [FlowPane] with dynamic-layout dsl support.
 * Invoking dsl will add its children.
 */
open class KtfxFlowPane(orientation: Orientation, hgap: Double, vgap: Double) :
    FlowPane(orientation, hgap, vgap),
    NodeManager {

    constructor(orientation: Orientation, gap: Double) : this(orientation, gap, gap)

    final override fun <C : Node> addChild(child: C): C = child.also { children += it }

    /** Children margin in this layout. */
    inline var Node.margin: Insets?
        @JvmName("getMargin2") get() = getMargin(this)
        @JvmName("setMargin2") set(value) = setMargin(this, value)

    /** Set children margin in this layout. */
    fun <C : Node> C.margin(insets: Insets): C {
        margin = insets
        return this
    }

    /** Clear children constraints. */
    @JvmName("clearConstraints2")
    inline fun Node.clearConstraints(): Unit = clearConstraints(this)
}
