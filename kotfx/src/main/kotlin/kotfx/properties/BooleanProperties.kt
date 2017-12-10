@file:JvmMultifileClass
@file:JvmName("PropertiesKt")
@file:Suppress("NOTHING_TO_INLINE", "UNUSED")

package kotfx.properties

import javafx.beans.property.BooleanProperty
import javafx.beans.property.ReadOnlyBooleanWrapper
import javafx.beans.property.SimpleBooleanProperty
import javafx.beans.value.ObservableValue

/** Wrap this boolean in modifiable property. */
inline fun Boolean?.asMutableProperty(): BooleanProperty = SimpleBooleanProperty(this ?: false)

/** Wrap this boolean in unmodifiable property. */
inline fun Boolean?.asProperty(): BooleanProperty = ReadOnlyBooleanWrapper(this ?: false)

/** Returns this boolean property as an observable. */
inline fun BooleanProperty.asObservable(): ObservableValue<Boolean> = this