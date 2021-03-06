/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minions.Undead;

import Cards.Card;
import Cards.Undead.ZombieCard;
import Minions.Minion;
import Minions.Tribe;
import cardgame1.Hero;
import cardgame1.SpriteHandler;

/**
 *
 * @author Joseph
 */
public class ZombieMinion extends Minion {

    public ZombieMinion(Card parent) {
        this.parent = parent;
        this.owner = parent.getOwner();
        attack = 3;
        originalAttack = attack;
        maxHealth = 1;
        health = maxHealth;
        tribe = Tribe.Undead;
        name = "Zombie";
        sprite = SpriteHandler.swampZombieMinion;
    }
    
    /**
     * supports alternate consturctor in which you may specify the attack and health of the minion rather than using the default 3/3 stats
     * @param Owner the hero this minion will be owned by
     * @param atk attack
     * @param hp initial health
     */
    public ZombieMinion(Hero owner, int atk, int hp){
        this.parent = new ZombieCard();
        parent.setHero(owner);
        this.owner = owner;
        attack = atk;
        originalAttack = attack;
        maxHealth = hp;
        health = maxHealth;
        tribe = Tribe.Undead;
        name = "Zombie";
        sprite = SpriteHandler.swampZombieMinion;
        this.turnUndead();
    }
    
   @Override
    public void attack(Minion target) {
        if(canAttack())target.turnUndead();
        System.out.println("done");
        super.attack(target);

    }

    @Override
    public void onAttacked(Minion attacker) {
        if(attacker.canAttack())return;
        attacker.turnUndead();
        System.out.println("done");
        super.onAttacked(attacker);
    }
}
