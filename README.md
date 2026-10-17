# Design Patterns Examples

Catálogo didático de **Design Patterns** em Java, voltado a iniciantes e a contribuições de alunos em projetos open source.

Os exemplos de código seguem cenários do livro [Engenharia de Software Moderna](http://www.engsoftmoderna.dcc.ufmg.br/), salvo onde um padrão novo foi adicionado com cenário próprio documentado no README do padrão.

## Requisitos

- [JDK 17+](https://adoptium.net/) (recomendado: instalar via [SDKMAN](https://sdkman.io/))
- [Apache Maven 3.9+](https://maven.apache.org/)

## Como compilar e executar

Na raiz do repositório:

```bash
mvn compile
```

Cada padrão possui uma classe com `main`. Exemplos (após compilar):

```bash
java -cp target/classes creational.singleton.Singleton
java -cp target/classes creational.factory.Factory
java -cp target/classes structural.adapter.Adapter
java -cp target/classes behavioral.strategy.Strategy
```

Detalhes, saída esperada e diagramas estão no `README.md` de cada pasta.

## Catálogo de padrões

### Criacionais

| Padrão | Pasta | Classe `main` | Documentação |
|--------|-------|---------------|--------------|
| Factory Method | [factory](src/main/java/creational/factory/) | `creational.factory.Factory` | [README](src/main/java/creational/factory/README.md) |
| Singleton | [singleton](src/main/java/creational/singleton/) | `creational.singleton.Singleton` | [README](src/main/java/creational/singleton/README.md) |
| Builder | [builder](src/main/java/creational/builder/) | `creational.builder.BuilderDemo` | [README](src/main/java/creational/builder/README.md) |

### Estruturais

| Padrão | Pasta | Classe `main` | Documentação |
|--------|-------|---------------|--------------|
| Adapter | [adapter](src/main/java/structural/adapter/) | `structural.adapter.Adapter` | [README](src/main/java/structural/adapter/README.md) |
| Decorator | [decorator](src/main/java/structural/decorator/) | `structural.decorator.Decorator` | [README](src/main/java/structural/decorator/README.md) |
| Facade | [facade](src/main/java/structural/facade/) | `structural.facade.Facade` | [README](src/main/java/structural/facade/README.md) |
| Proxy | [proxy](src/main/java/structural/proxy/) | `structural.proxy.Proxy` | [README](src/main/java/structural/proxy/README.md) |
| Composite | [composite](src/main/java/structural/composite/) | `structural.composite.CompositeDemo` | [README](src/main/java/structural/composite/README.md) |

### Comportamentais

| Padrão | Pasta | Classe `main` | Documentação |
|--------|-------|---------------|--------------|
| Strategy | [strategy](src/main/java/behavioral/strategy/) | `behavioral.strategy.Strategy` | [README](src/main/java/behavioral/strategy/README.md) |
| Observer | [observer](src/main/java/behavioral/observer/) | `behavioral.observer.Observer` | [README](src/main/java/behavioral/observer/README.md) |
| Template Method | [templatemethod](src/main/java/behavioral/templatemethod/) | `behavioral.templatemethod.TemplateMethod` | [README](src/main/java/behavioral/templatemethod/README.md) |
| Command | [command](src/main/java/behavioral/command/) | `behavioral.command.CommandDemo` | [README](src/main/java/behavioral/command/README.md) |

## Contribuir

Leia [CONTRIBUTING.md](CONTRIBUTING.md). Código de conduta: [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md).

## CI

Pull requests e pushes na branch `main` disparam um workflow que executa `mvn compile` para garantir que o projeto compila.
