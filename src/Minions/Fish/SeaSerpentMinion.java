/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minions.Fish;

import Cards.Card;
import Minions.Minion;
import Minions.Tribe;
import cardgame1.Main;
import cardgame1.SpriteHandler;
import cardgame1.Sticker;

/**
 *
 * @author Joseph
 */
public class SeaSerpentMinion extends Minion{
    public SeaSerpentMinion(Card parent){
        this.parent = parent;
        this.owner = parent.getOwner();
        attack = 5;
        tribe = Tribe.Fish;
        maxHealth = 5;
        health = maxHealth;
        name = "Sea Witch";
        sprite = SpriteHandler.seaSerphantMinion;
    }
    
    @Override
    public void onSummon() {
        for (Minion m : owner.minions.getOccupants()) {
            if (m.tribe != Tribe.Fish) {
                Sticker s = new Sticker(SpriteHandler.bloodMedium,m,AI.AI.speed/3);
                m.takeDamage(1);
            }
        }
        for (Minion m : owner.opponent.minions.getOccupants()) {
            if (m.tribe != Tribe.Fish) {
                m.takeDamage(1);
                Sticker s = new Sticker(SpriteHandler.bloodMedium,m,AI.AI.speed/3);
            }
        }
        Main.wait(AI.AI.speed/3);
    }
}