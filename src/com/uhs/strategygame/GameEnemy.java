package com.uhs.strategygame;

import java.util.List;

public abstract class GameEnemy {
    abstract List<String> getAttacks(); //get possible attacks that the enemy can perform
    abstract void doAttack(String attack, int posx, int posy, List<GameEnemy> enemies); //perform an attack
    abstract boolean receivedDamage(float damage);//acquire damage
}
