# 🥊 Simulador de Combate entre Campeões

Solução do desafio **“Combate”** do curso DevSuperior.
Este é um projeto em **Java** com objetivo de aplicar conceitos de **Programação Orientada a Objetos (POO)** que simula um combate entre dois campeões, com base em seus atributos de **ataque**, **armadura** e **vida**.  
Os campeões se atacam simultaneamente a cada turno, e o combate termina quando um deles morre ou quando o número de turnos definidos chega ao fim.

---

## 📜 Funcionalidades

- 🧑‍🤝‍🧑 Criação de dois campeões com dados fornecidos pelo usuário.  
- ⚔️ Cálculo de dano considerando ataque e armadura.  
- 🩸 Simulação de combate por turnos.  
- 📊 Exibição do status de vida de cada campeão após cada turno.  
- ☠️ Finalização automática do combate quando um dos campeões morre.  

---

## ⚔️ Regras do Combate

1. O dano causado por um campeão A em um campeão B é:

dano = ataqueA - armaduraB

- Se o dano calculado for menor que 1, considera-se **1** ponto de dano.
2. A vida do campeão atacado é reduzida pelo dano recebido.
3. A vida **nunca pode ser menor que 0**.
4. Se a vida chegar a 0, o campeão é declarado **morto** e o combate termina imediatamente.