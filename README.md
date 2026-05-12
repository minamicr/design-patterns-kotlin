### DESIGN PATTERNS
#### Livro: Kotlin Design Patterns and Best Practices
#### Autor: Alexey Soshin
#### Editora: Packt

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

## Abstract Factory - Server Configuration
É uma fábrica de fábricas, que pode criar múltiplas classes relacionadas.<p>
O objetivo da aplicação é criar um ServerConfiguration com um List<Property>, no qual
a property tem um name e value, que pode ser inteiro, string.<p>
Para criar as properties, é utilizado o PropertyFactory, onde é decidido o tipo de valor a ser criado (String, Int).<p>
A classe Parser cria tanto ServerConfiguration como Property, podendo ser considerada
uma abstract factory.

## Factory - Chess
É uma fábrica de criação de objetos.
No exemplo, é utilizada uma notação algébrica para indicar a peça e respectiva posição.
- pa4 -> pawn file:a (column) rank:4 (row)
- qc3 -> queen file:q (column) rank:3 (row)
- nd1 -> knight file:n (column) rank:1 (row)
A classe PieceFactory verifica pela primeira letra qual tipo de peça deve ser criada.

## Template - Daily Routine
No padrão template é criada uma classe do tipo abstrata, onde existem métodos com 
implementação padrão e métodos abstratos que deverão ser implementados pela classe que a estende.

