package com.uhs.strategygame;

import java.util.List;

public abstract class Character {
    abstract List<String> getAttacks();//get possible attacks that the character can perform
    abstract void doAttack(String attack, int posx, int posy, List<Character> characters);//perform an attack
    abstract boolean receivedDamage(float damage);//acquire damage
}
