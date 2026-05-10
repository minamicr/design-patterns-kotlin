package abstractfactory.model

data class PropertyImpl(
    override val name: String,
    override val value: Any
): Property
