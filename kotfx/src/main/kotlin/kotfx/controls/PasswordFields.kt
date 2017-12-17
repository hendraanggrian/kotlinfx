@file:JvmMultifileClass
@file:JvmName("ControlsKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kotfx

import javafx.scene.control.PasswordField
import kotfx.internal.ChildManager
import kotfx.internal.KotfxDsl
import kotfx.internal.ItemManager

@JvmOverloads
inline fun passwordFieldOf(
        noinline init: ((@KotfxDsl PasswordField).() -> Unit)? = null
): PasswordField = PasswordField().apply { init?.invoke(this) }

@JvmOverloads
inline fun ChildManager.passwordField(
        noinline init: ((@KotfxDsl PasswordField).() -> Unit)? = null
): PasswordField = PasswordField().apply { init?.invoke(this) }.add()

@JvmOverloads
inline fun ItemManager.passwordField(
        noinline init: ((@KotfxDsl PasswordField).() -> Unit)? = null
): PasswordField = PasswordField().apply { init?.invoke(this) }.add()