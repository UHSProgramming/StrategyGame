package com.uhs.strategygame;

import java.util.List;

public abstract class Enemy {
    abstract List<String> getAttacks(); //get possible attacks that the enemy can perform
    abstract void doAttack(String attack, int posx, int posy, List<Enemy> enemies); //perform an attack
    abstract boolean recievedDamage(float damage);//acquire damage
}
