@file:JvmMultifileClass
@file:JvmName("ScenesKt")
@file:Suppress("NOTHING_TO_INLINE")

package kotfx

import javafx.scene.Node
import javafx.scene.Scene
import javafx.scene.SnapshotParameters
import javafx.scene.SnapshotResult
import javafx.scene.image.WritableImage
import kotfx.internal.Interops

inline fun Node.screenshot(
    params: SnapshotParameters? = null,
    image: WritableImage? = null,
    noinline callback: (SnapshotResult) -> Unit
) = snapshot(Interops.asCallback(callback), params, image)

inline fun Node.screenshot(
    params: SnapshotParameters? = null,
    image: WritableImage? = null
): WritableImage = snapshot(params, image)

inline fun Scene.screenshot(
    image: WritableImage? = null,
    noinline callback: (SnapshotResult) -> Unit
) = snapshot(Interops.asCallback(callback), image)

inline fun Scene.screenshot(
    image: WritableImage? = null
): WritableImage = snapshot(image)