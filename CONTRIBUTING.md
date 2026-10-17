# Como contribuir

Obrigado por considerar uma contribuição neste catálogo didático. O projeto é pensado para quem está aprendendo Design Patterns e, muitas vezes, fazendo o primeiro contato com open source.

## Antes de começar

1. Veja as [issues abertas](https://github.com/AdsonVieira/design-patterns-examples/issues).
2. Escolha uma issue (ou proponha uma nova, se fizer sentido).
3. **Comente na issue** que pretende trabalhar nela, para evitar trabalho duplicado.

## Fluxo fork → Pull Request

1. Faça um **fork** do repositório no GitHub.
2. Clone o seu fork:

   ```bash
   git clone https://github.com/SEU_USUARIO/design-patterns-examples.git
   cd design-patterns-examples
   ```

3. Crie uma branch descritiva:

   ```bash
   git checkout -b docs/observer-readme
   ```

4. Instale **JDK 17+** e **Maven** (o [SDKMAN](https://sdkman.io/) facilita em Linux/macOS).

5. Compile o projeto:

   ```bash
   mvn compile
   ```

6. Se alterou um exemplo, execute a classe `main` documentada no README do padrão e confira a saída descrita.

7. Commit com mensagem clara (ex.: `docs: adiciona README do padrão Observer`).

8. Envie para o seu fork e abra um **Pull Request** para `main`, referenciando a issue (`Closes #12` ou `Relates to #12`).

## Padrão de código

- Mantenha cada padrão em sua pasta (`creational/`, `structural/`, `behavioral/`).
- Use nomes de classes e pacotes em inglês, em minúsculas no pacote (ex.: `behavioral.templatemethod`).
- Prefira exemplos **pequenos**, sem frameworks, com uma classe `main` para demonstração.
- Comentários só quando explicarem uma decisão não óbvia.
- Não inclua credenciais, arquivos de IDE (`.idea/`, `*.iml`) nem pasta `target/` nos commits.

## Documentação de um padrão

Cada pasta de padrão deve ter um `README.md` em português com:

- Intenção, problema e analogia curta
- Três cenários em que usar e quando evitar
- Participantes e trade-offs
- Diagrama (Mermaid ou ASCII)
- Como compilar e executar (`mvn compile` + comando `java`)
- Link para este guia

## Validação local (mesmo critério do CI)

```bash
mvn -B compile
```

O CI **não** executa testes automatizados; a verificação comportamental é manual via `main`, conforme o README do padrão.

## Pedir ajuda

- Comente na issue ou no PR com contexto e o que você já tentou.
- Seja respeitoso; siga o [Código de Conduta](CODE_OF_CONDUCT.md).
