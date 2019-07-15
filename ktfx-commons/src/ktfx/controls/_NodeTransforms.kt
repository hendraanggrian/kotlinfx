@file:JvmMultifileClass
@file:JvmName("NodesKt")
@file:Suppress("NOTHING_TO_INLINE", "EXTENSION_SHADOWED_BY_MEMBER")

package ktfx.controls

import javafx.geometry.Point3D
import javafx.scene.Node
import javafx.scene.transform.Affine
import javafx.scene.transform.MatrixType
import javafx.scene.transform.Rotate
import javafx.scene.transform.Scale
import javafx.scene.transform.Shear
import javafx.scene.transform.Transform
import javafx.scene.transform.Translate

inline fun Node.affine(): Affine = Affine().also { transforms += it }

inline fun Node.affine(transform: Transform): Affine = Affine(transform).also { transforms += it }

inline fun Node.affine(
    mxx: Double,
    mxy: Double,
    tx: Double,
    myx: Double,
    myy: Double,
    ty: Double
): Affine = Affine(mxx, mxy, tx, myx, myy, ty).also { transforms += it }

inline fun Node.affine(
    mxx: Double,
    mxy: Double,
    mxz: Double,
    tx: Double,
    myx: Double,
    myy: Double,
    myz: Double,
    ty: Double,
    mzx: Double,
    mzy: Double,
    mzz: Double,
    tz: Double
): Affine = Affine(mxx, mxy, mxz, tx, myx, myy, myz, ty, mzx, mzy, mzz, tz).also { transforms += it }

inline fun Node.affine(matrix: DoubleArray, type: MatrixType, offset: Int): Affine =
    Affine(matrix, type, offset).also { transforms += it }

inline fun Node.rotate(): Rotate = Rotate().also { transforms += it }

inline fun Node.rotate(angle: Double): Rotate = Rotate(angle).also { transforms += it }

inline fun Node.rotate(angle: Double, axis: Point3D): Rotate = Rotate(angle, axis).also { transforms += it }

inline fun Node.rotate(angle: Double, pivotX: Double, pivotY: Double): Rotate =
    Rotate(angle, pivotX, pivotY).also { transforms += it }

inline fun Node.rotate(angle: Double, pivotX: Double, pivotY: Double, pivotZ: Double): Rotate =
    Rotate(angle, pivotX, pivotY, pivotZ).also { transforms += it }

inline fun Node.rotate(angle: Double, pivotX: Double, pivotY: Double, pivotZ: Double, axis: Point3D): Rotate =
    Rotate(angle, pivotX, pivotY, pivotZ, axis).also { transforms += it }

inline fun Node.scale(x: Double, y: Double): Scale = Scale(x, y).also { transforms += it }

inline fun Node.scale(
    x: Double,
    y: Double,
    pivotX: Double,
    pivotY: Double
): Scale = Scale(x, y, pivotX, pivotY).also { transforms += it }

inline fun Node.scale(x: Double, y: Double, z: Double): Scale = Scale(x, y, z).also { transforms += it }

inline fun Node.scale(
    x: Double,
    y: Double,
    z: Double,
    pivotX: Double,
    pivotY: Double,
    pivotZ: Double
): Scale = Scale(x, y, z, pivotX, pivotY, pivotZ).also { transforms += it }

inline fun Node.shear(): Shear = Shear().also { transforms += it }

inline fun Node.shear(x: Double, y: Double): Shear = Shear(x, y).also { transforms += it }

inline fun Node.shear(x: Double, y: Double, pivotX: Double, pixotY: Double): Shear =
    Shear(x, y, pivotX, pixotY).also { transforms += it }

inline fun Node.translate(): Translate = Translate().also { transforms += it }

inline fun Node.translate(x: Double, y: Double): Translate = Translate(x, y).also { transforms += it }

inline fun Node.translate(x: Double, y: Double, z: Double): Translate = Translate(x, y, z).also { transforms += it }
