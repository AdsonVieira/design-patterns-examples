# Composite

## Intenção

Compor objetos em estruturas de árvore para tratar **folhas e compostos** de forma uniforme.

## Problema

Pastas e arquivos precisam expor operações como tamanho total, mas pastas agregam filhos recursivamente.

## Analogia

Organograma: pessoa e departamento respondem a “quantas pessoas há?” — o departamento soma os times internos.

## Quando usar

1. Hierarquias parte-todo (pastas, menus, UI).
2. Operações recursivas sobre toda a árvore.
3. Cliente ignora se o nó é folha ou composto.

## Quando evitar

- Estrutura rasa sem necessidade de recursão.
- Tipos de folha e composto com comportamentos muito diferentes (interface comum fica forçada).

## Participantes

- `FileSystemNode` — componente
- `File` — folha
- `Directory` — composto com filhos
- `CompositeDemo` — `main`

## Trade-offs

| Prós | Contras |
|------|---------|
| Uniformidade no cliente | Difícil restringir o que só folha pode fazer |
| Extensão de novos tipos de nó | Recursão mal documentada confunde iniciantes |

## Diagrama

```ascii
Directory project
  Directory src
    File Main.java
    File Utils.java
  File README.md
```

## Executar

```bash
mvn compile
java -cp target/classes structural.composite.CompositeDemo
```

**Saída esperada (resumo):** árvore impressa e linha `Tamanho total: 2400 bytes`.

## Como contribuir

Veja [CONTRIBUTING.md](../../../../../CONTRIBUTING.md) na raiz do repositório.
