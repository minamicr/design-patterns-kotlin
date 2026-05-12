package abstractfactory.serverconfiguration

class Parser {

    companion object {
        fun property(prop: String): Property {
            val (name, value) = prop.split(":")
            return when (name) {
                "port" -> PropertyImpl(name, value.trim().toInt())
                "environment" -> PropertyImpl(name, value.trim())
                else -> throw IllegalArgumentException("Unknown property: $name")
            }
        }

        fun server(propertyStrings: List<String>): ServerConfiguration {
            val parsedProperties = mutableListOf<Property>()
            for (p in propertyStrings) {
                parsedProperties += property(p)
            }
            return ServerConfigurationImpl(parsedProperties)
        }
    }
}