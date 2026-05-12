package abstractfactory.serverconfiguration

data class ServerConfigurationImpl(
    override val properties: List<Property>
): ServerConfiguration {

}
