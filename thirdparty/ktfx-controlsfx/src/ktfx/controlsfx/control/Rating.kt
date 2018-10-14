@file:Suppress("PackageDirectoryMismatch", "NOTHING_TO_INLINE")

/* ktlint-disable package-name */
package ktfx.controlsfx

/* ktlint-enable package-name */

import ktfx.annotations.LayoutDsl
import ktfx.NodeManager
import org.controlsfx.control.Rating

/** Creates a [Rating]. */
fun rating(
    max: Int = 5,
    rating: Int = -1,
    init: ((@LayoutDsl Rating).() -> Unit)? = null
): Rating = Rating(max, rating).also { init?.invoke(it) }

/** Creates a [Rating] and add it to this manager. */
inline fun NodeManager.rating(
    max: Int = 5,
    rating: Int = -1,
    noinline init: ((@LayoutDsl Rating).() -> Unit)? = null
): Rating = ktfx.controlsfx.rating(max, rating, init)()