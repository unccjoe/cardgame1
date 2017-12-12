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
public class CarnifishMinion extends Minion{
    public CarnifishMinion(Card parent){
        this.parent = parent;
        this.owner = parent.getOwner();
        attack = 2;
        maxHealth = 3;
        health = maxHealth;
        tribe = Tribe.Fish;
        name = "Carnifish";
        sprite = SpriteHandler.carnifishMinion;
    }
    
    @Override
    public void onSummon(){
        for(Minion m : owner.minions.getOccupants()){
            if(m.name.equals("Baitfish")){
                Sticker s = new Sticker(SpriteHandler.bloodMedium,this,800);
                Main.wait(800);
                m.destroy();
            }
        }
    }
    
    @Override
    public void tick(){
        this.intrinsicValue = 0;
        for(Minion m : owner.minions.getOccupants()){
            if(m.name.equals("Baitfish")){
                this.intrinsicValue++;
            }
        }
    }
}
