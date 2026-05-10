### FACTORY

## Static Factory Method
```kotlin notebook
    Long l1 = new Long("1");
    Long l2 = Long.valueOf("1");
```
Ambos exemplos criam um objeto Long, o primeiro pelo construtor e o segundo utilizando o static factory method.
Porque utilizar o segundo?
- permite um nome mais descritivo que os construtores, sendo vantajoso quando o objeto tem múltiplos construtores,
melhorando a leitura e facilitando entendimento
- flexibilidade no tratamento de exceções
- flexibilidade na criação, por exemplo, utilização de cache

## Abstract Factory
É uma fábrica de fábricas, que pode criar múltiplas classes relacionadas.
O objetivo da aplicação é criar um ServerConfiguration com um List<Property>, no qual
a property tem um name e value, que pode ser inteiro, string.
Para criar as properties, é utilizado o PropertyFactory, onde é decidido o tipo de valor.
A classe Parser cria tanto ServerConfiguration como Property, podendo ser considerada
uma abstract factory.