@file:Suppress("NOTHING_TO_INLINE")

package ktfx.beans.property

import javafx.beans.property.IntegerProperty
import javafx.beans.property.ReadOnlyIntegerProperty
import javafx.beans.property.ReadOnlyIntegerWrapper
import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.value.ObservableValue

/** Wrap this int in modifiable property. */
inline fun Int?.toMutableProperty(): IntegerProperty = SimpleIntegerProperty(this ?: 0)

/** Wrap this int in unmodifiable property. */
inline fun Int?.toProperty(): ReadOnlyIntegerProperty = ReadOnlyIntegerWrapper(this ?: 0)

/** Returns this int property as an observable. */
@Suppress("UNCHECKED_CAST")
inline fun IntegerProperty.asObservable(): ObservableValue<Int> = this as ObservableValue<Int>