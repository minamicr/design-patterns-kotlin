package abstractfactory.model

fun main() {
    // Implementação utilizando serviço ServerConfigurationService
    val serverConfigurationService = ServerConfigurationService(PropertyFactory())
    val serverProperties = serverConfigurationService.server(listOf("port: 8080", "environment: production"))
    println(serverProperties)

    // Abstract Factory
    // Implementação no qual a classe Parser faz o parse das properties, e também cria o ServerConfiguration
    val parser = Parser.server(listOf("port: 8080", "environment: production"))
    println(parser)
}
