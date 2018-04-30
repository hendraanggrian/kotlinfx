@file:Suppress("NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.control.ToggleButton

inline fun toggleButton(
    text: String? = null,
    graphic: Node? = null
): ToggleButton = toggleButton(text, graphic) { }

inline fun toggleButton(
    text: String? = null,
    graphic: Node? = null,
    init: (@LayoutDsl ToggleButton).() -> Unit
): ToggleButton = ToggleButton(text, graphic).apply(init)

inline fun LayoutManager<Node>.toggleButton(
    text: String? = null,
    graphic: Node? = null
): ToggleButton = toggleButton(text, graphic) { }

inline fun LayoutManager<Node>.toggleButton(
    text: String? = null,
    graphic: Node? = null,
    init: (@LayoutDsl ToggleButton).() -> Unit
): ToggleButton = ktfx.layouts.toggleButton(text, graphic, init).add()