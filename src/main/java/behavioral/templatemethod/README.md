# Template Method

## Intenção

Definir o esqueleto de um algoritmo na classe base, deixando subclasses sobrescreverem **etapas específicas** sem mudar a estrutura.

## Problema

O cálculo de salário segue sempre as mesmas etapas (base, descontos), mas os descontos variam conforme o tipo de contrato (CLT).

## Analogia

Receita de bolo: os passos (misturar, assar) são fixos; o recheio varia por versão.

## Quando usar

1. Fluxo fixo com pontos de variação (importação, pipeline ETL).
2. Evitar duplicar a ordem das etapas em várias classes.
3. Frameworks que chamam hooks (`onStart`, `onFinish`).

## Quando evitar

- Só uma variação — herança pode ser excesso; composição com estratégias pode ser melhor.
- Subclasses precisam alterar a ordem dos passos (o template fica rígido).

## Participantes

- `Employee` — classe abstrata com template `calcSalary()`
- `EmployeeCLT` — implementa descontos específicos
- `TemplateMethod` — `main`

## Trade-offs

| Prós | Contras |
|------|---------|
| Reuso da estrutura do algoritmo | Herança acopla subclasses à base |
| Controle invertido (Hollywood) | Difícil mudar ordem sem refatorar base |

## Diagrama

```ascii
Employee.calcSalary()
  base = 1500
  - calcDiscountSocialSecurity()  <-- hook
  - calcDiscountSHealthPlan()     <-- hook
  return resultado
```

## Executar

```bash
mvn compile
java -cp target/classes behavioral.templatemethod.TemplateMethod
```

**Saída esperada:**

```
1475.0
```

## Como contribuir

Veja [CONTRIBUTING.md](../../../../../CONTRIBUTING.md) na raiz do repositório.
