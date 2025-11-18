# Laboratório 8 - Padrão State

[English version](README_en.md)

**State** é um *padrão de design comportamental* que permite que um objeto mude
o seu comportamento dependendo do seu estado interno.

Está intimamente relacionado com o conceito de *máquina de estados finitos* (FSM).

* *Recurso online*: [Padrão State (refactoring guru)](https://refactoring.guru/design-patterns/state)

## Aplicação

Este repositório implementa um `MusicPlayer` que fornece os seguintes comandos (métodos públicos):

* ⏯️ `play()`
* :rewind: `prev()`
* :fast_forward: `next()`
* ⏹️ `stop()`
* :question: `status()`

O comportamento para cada comando é definido através da utilização do padrão **State** (ver código) e “implementa” a seguinte FSM:

![](images/fsm_1.png)

<hr/>

O programa fornecido na classe `Main` dá-nos uma *interface de linha de comandos* para interagir com uma instância de `MusicPlayer`.
Execute o programa e verifique que, de facto, ele se comporta de acordo com o diagrama acima.

## Exercícios

1. Crie um novo *estado concreto* na classe `PausedState` e altere os existentes para obter a seguinte FSM:

   ![](images/fsm_2.png)

   :bulb: Não é necessário fazer alterações na classe `CLI`.

2. Adicione os métodos `turnOn()` e `turnOff()` a `MusicPlayer`. O comportamento destes
   métodos deve ser delegado para o *estado* atual. Note que isto requer alterar a
   *interface* `MusicPlayerState`. Crie um novo `OffState` e faça as alterações necessárias
   para implementar a seguinte FSM:

   ![](images/fsm_3.png)

    * :warning: Tenha em atenção:

        * As *regras de transição* anteriores entre os estados existentes mantêm-se; foram omitidas do diagrama acima;

        * O estado inicial é `Off`;

        * Só é possível fazer a transição a partir de `Off` com o comando `TURNON`; todos os outros são silenciosamente ignorados.

        * Todos os outros estados ignoram silenciosamente o comando `TURNON`.

        * Ao fazer a transição do estado `Off` para `Stopped`, o player deve sempre carregar a primeira música da *playlist*;

        * Sempre que é feita uma transição para o estado `Stopped`, a *reprodução* deve parar e os recursos devem ser libertados.
