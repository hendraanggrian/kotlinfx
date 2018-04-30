@file:Suppress("NOTHING_TO_INLINE")

package ktfx.layouts

import javafx.scene.Node
import javafx.scene.shape.CubicCurve

inline fun cubicCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX1: Double = 0.0,
    controlY1: Double = 0.0,
    controlX2: Double = 0.0,
    controlY2: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0
): CubicCurve = cubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY) { }

inline fun cubicCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX1: Double = 0.0,
    controlY1: Double = 0.0,
    controlX2: Double = 0.0,
    controlY2: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0,
    init: (@LayoutDsl CubicCurve).() -> Unit
): CubicCurve = CubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY).apply(init)

inline fun LayoutManager<Node>.cubicCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX1: Double = 0.0,
    controlY1: Double = 0.0,
    controlX2: Double = 0.0,
    controlY2: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0
): CubicCurve = cubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY) { }
    .add()

inline fun LayoutManager<Node>.cubicCurve(
    startX: Double = 0.0,
    startY: Double = 0.0,
    controlX1: Double = 0.0,
    controlY1: Double = 0.0,
    controlX2: Double = 0.0,
    controlY2: Double = 0.0,
    endX: Double = 0.0,
    endY: Double = 0.0,
    init: (@LayoutDsl CubicCurve).() -> Unit
): CubicCurve = ktfx.layouts.cubicCurve(startX, startY, controlX1, controlY1, controlX2, controlY2, endX, endY, init)
    .add()