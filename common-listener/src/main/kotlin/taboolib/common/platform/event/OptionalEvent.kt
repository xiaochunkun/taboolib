package taboolib.common.platform.event

import org.tabooproject.reflex.Reflex.Companion.getProperty
import org.tabooproject.reflex.Reflex.Companion.setProperty

/**
 * @author sky
 * @since 2021/7/4 3:19 下午
 */
class OptionalEvent(val source: Any) {

    inline fun <reified T> get() = source as T

    fun <T> read(name: String) = source.getProperty<T>(name)

    fun write(name: String, value: Any?) {
        source.setProperty(name, value)
    }
}
