# PvZ em Java - Padrões de Projeto em Java

Projeto do desafio de Padrões de Projeto (DIO). Um mini jogo de plantas defendendo o jardim contra zumbis.

## Padrões usados

- **Singleton** (`CofreDeSol`): existe um único cofre de sol em todo o jogo.
- **Strategy** (`Ataque`, `TiroDeErvilha`, `TiroDuploDeErvilha`, `ExplosaoDePimenta`): cada planta ataca de um jeito, e dá para trocar o ataque sem mexer no resto.
- **Facade** (`DefesaFacade`): o método `plantarEAtacar()` esconde os passos (pagar, atacar, mostrar resultado).

## Como rodar

```bash
cd src
javac *.java
java Main
```

## Ideias para evoluir

- Observer: avisar quando um zumbi for derrotado
- Factory: criar plantas a partir do nome
- Versão com Spring
