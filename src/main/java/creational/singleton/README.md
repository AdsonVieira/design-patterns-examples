# Singleton

## Intenção

Garantir que uma classe tenha **no máximo uma instância** e oferecer um ponto global de acesso a ela.

## Problema

Vários componentes precisam registrar logs, mas abrir múltiplos loggers duplicaria estado e recursos.

## Analogia

O presidente de uma república: há um único cargo ativo; todos consultam a mesma autoridade.

## Quando usar

1. Recurso compartilhado único (logger, pool de conexões configurado uma vez).
2. Contador ou cache global com consistência.
3. Coordenação de acesso a hardware ou arquivo exclusivo.

## Quando evitar

- Dificulta testes e injeção de dependência.
- Em aplicações distribuídas, “único” no processo não implica único no cluster.
- Estado global escondido gera acoplamento.

## Participantes

- `Logger` — singleton com construtor privado e `getInstance()`
- `Singleton` — classe `main` que demonstra o acesso

## Trade-offs

| Prós | Contras |
|------|---------|
| Acesso centralizado | Estado global, difícil de mockar |
| Controle sobre instância única | Em multithread exige cuidado extra (não tratado neste exemplo mínimo) |

## Diagrama

```ascii
+-------------+
|   Cliente   |
+------+------+
       | getInstance()
       v
+-------------+     única
|   Logger    |<----instância
+-------------+
```

## Executar

```bash
mvn compile
java -cp target/classes creational.singleton.Singleton
```

**Saída esperada:** um número (hash da instância), por exemplo `622488023`.

> Este exemplo educativo é mínimo; em produção prefira enum singleton ou inicialização thread-safe explícita.

## Como contribuir

Veja [CONTRIBUTING.md](../../../../../CONTRIBUTING.md) na raiz do repositório.
