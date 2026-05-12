package abstractfactory.serverconfiguration

class ServerConfigurationService (
    private val propertyFactory: PropertyFactory
) {

    fun server(propertyStrings: List<String>): ServerConfiguration {
        val parsedProperties = mutableListOf<Property>()
        for (p in propertyStrings) {
            parsedProperties += propertyFactory.property(p)
        }
        return ServerConfigurationImpl(parsedProperties)
    }

}