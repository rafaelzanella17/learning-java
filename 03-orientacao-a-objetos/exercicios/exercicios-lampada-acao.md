# Exercícios – Classe Lampada

A seguir estão três exercícios para você praticar conceitos de orientação a objetos utilizando a classe `Lampada`.

---

## Exercício 1 — Criar Novas Propriedades e Métodos

Adicione novas propriedades na classe `Lampada`, como:

- `int nivelBrilho` (0 a 100)
- `boolean queimada`

Depois crie métodos:

- `aumentarBrilho()` → aumenta 10 pontos por vez (máximo 100)
- `diminuirBrilho()` → diminui 10 pontos por vez (mínimo 0)
- `mostrarInformacoes()` → imprime todas as propriedades da lâmpada

No `main`, teste tudo isso.

---

## Exercício 2 — Criar Uma Lista de Lâmpadas

Crie um array ou `ArrayList<Lampada>` com **5 lâmpadas**.

Faça:

1. Ligar apenas as lâmpadas de índice par.  
2. Desligar as lâmpadas de índice ímpar.  
3. Mostrar o estado de todas as lâmpadas usando um loop `for`.

*Dica:* crie um método `imprimirEstadoCompleto()` dentro da classe.

---

## Exercício 3 — Simular Interruptor

Crie uma nova classe chamada `Interruptor` que recebe uma `Lampada` no construtor.

Exemplo:

```java
Interruptor interruptor = new Interruptor(lampada);
