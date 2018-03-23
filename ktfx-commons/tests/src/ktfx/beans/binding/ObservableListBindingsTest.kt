package ktfx.beans.binding

import javafx.beans.binding.Bindings
import javafx.collections.ObservableList
import ktfx.collections.emptyBinding
import ktfx.collections.getBinding
import ktfx.collections.sizeBinding

class ObservableListBindingsTest {

    fun sizeBinding(list: ObservableList<*>) {
        Bindings.size(list)
        list.sizeBinding()
    }

    fun isEmpty(list: ObservableList<*>) {
        Bindings.isEmpty(list)
        list.emptyBinding()
    }

    fun isNotEmpty(list: ObservableList<*>) {
        Bindings.isNotEmpty(list)
        list.emptyBinding()
    }

    fun valueAt(list: ObservableList<*>) {
        Bindings.valueAt(list, 0)
        list.getBinding(0)
    }

    fun booleanValueAt(list: ObservableList<Boolean>) {
        Bindings.booleanValueAt(list, 0)
        list.getBinding(0)
    }

    fun doubleValueAt(list: ObservableList<Double>) {
        Bindings.doubleValueAt(list, 0)
        list.getBinding(0)
    }

    fun floatValueAt(list: ObservableList<Float>) {
        Bindings.floatValueAt(list, 0)
        list.getBinding(0)
    }

    fun integerValueAt(list: ObservableList<Int>) {
        Bindings.integerValueAt(list, 0)
        list.getBinding(0)
    }

    fun longValueAt(list: ObservableList<Long>) {
        Bindings.longValueAt(list, 0)
        list.getBinding(0)
    }

    fun stringValueAt(list: ObservableList<String>) {
        Bindings.stringValueAt(list, 0)
        list.getBinding(0)
    }
}