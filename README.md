# Swiggy-github
This is an Swiggy interview task 


# Magical Arena

## Introduction
This is a simple implementation of a magical arena where two players fight until one of them dies. Each player has attributes for health, strength, and attack. The game uses dice rolls to determine the outcome of attacks and defenses.

## How to Run
1. Ensure you have Java installed on your machine.
2. Compile the code using `javac Main.java Player.java Arena.java`.
3. Run the game using `java Main`.

## Game Rules
- Each player has health, strength, and attack attributes.
- Players take turns attacking each other.
- The attacking player rolls an attack dice, and the defending player rolls a defense dice.
- The attack damage is calculated as `attack value * attack dice roll`.
- The defense strength is calculated as `strength value * defense dice roll`.
- The defender's health is reduced by the damage dealt (attack damage - defense strength).
- The game ends when one player's health reaches zero.
- Health cannot go below zero.
