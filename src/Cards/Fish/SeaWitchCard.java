/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cards.Fish;

import Cards.Card;
import Cards.CardPurpose;
import Cards.CardType;
import CustomDecks.HeroClass;
import Minions.Fish.SeaWitchMinion;
import Minions.Minion;
import Minions.Tribe;
import cardgame1.SpriteHandler;

/**
 *
 * @author Joseph
 */
public class SeaWitchCard extends Card{
        public SeaWitchCard() {
        name = "Sea Witch";
        cardType = CardType.Minion;
        cardPurpose = CardPurpose.BattlecryMinionDraw;
        cardText = "On Summon: \n Put a Random Fish \n Related Card Into \n Your Hand";
        sprite = SpriteHandler.seaWitchCard;
        cost = 4;
        summon = new SeaWitchMinion(this);
        this.spellDamage = 1; //spell damage represents number of cards drawn for a battlecryminiondraw
        heroClass = HeroClass.Ocean;
    }
        
}
