package abstractfactory.serverconfiguration

class PropertyFactory {
    fun property(prop: String): Property {
        val (name, value) = prop.split(":")
        return when (name) {
            "port" -> PropertyImpl(name, value.trim().toInt())
            "environment" -> PropertyImpl(name, value.trim())
            else -> throw IllegalArgumentException("Unknown property: $name")
        }
    }
}