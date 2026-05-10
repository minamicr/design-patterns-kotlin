package abstractfactory.model

data class ServerConfigurationImpl(
    override val properties: List<Property>
): ServerConfiguration {

}
