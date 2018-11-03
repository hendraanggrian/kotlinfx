@file:Suppress("PackageDirectoryMismatch")

package ktfx.listeners

import javafx.scene.chart.ValueAxis

/** StringConverter used to format tick mark labels. If null a default will be used. */
inline fun <T : Number> ValueAxis<T>.tickLabelFormatter(
    converter: StringConverterBuilder<T>.() -> Unit
): Unit = setTickLabelFormatter(buildStringConverter(converter))