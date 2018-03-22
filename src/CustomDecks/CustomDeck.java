/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CustomDecks;

import Cards.Base.*;
import Cards.Card;
import Cards.Fish.*;
import Cards.Undead.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Joseph
 */
public class CustomDeck {
    public String deckName = "Unnamed";
    public ArrayList<Card> deck; //list of cards
    public HeroClass deckClass; //what class we are
    ///////////
    public static final int MAX_NUM_COPIES = 3;  //how many copies of a single card we allow in a deck
    public static final int MIN_NUM_CARDS = 20;
    public CustomDeck(String name, ArrayList<Card> cards, HeroClass hc){
        
    }
    //used for importing
    public CustomDeck(File file) throws FileNotFoundException, IOException, CorruptFileException {
        ArrayList<String> lines = new ArrayList<>(); //output is where we store all the lines from the given file
        InputStream ips = new FileInputStream(file);
        InputStreamReader ipsr = new InputStreamReader(ips);
        BufferedReader br = new BufferedReader(ipsr);
        String line;
        while ((line = br.readLine()) != null) {
            lines.add(line);
        }
        this.deckName = lines.get(0);
        for(int i = 1; i < lines.size();i++){
            try {
                deck.add(getCard(lines.get(i)));
            } catch (NoSuchCardException ex) {
                throw new CorruptFileException(ex.getMessage());
            }
        }
        deckName = file.getName().split(".")[0]; //sets name of new deck to name of the file without the file extension
    }
    /*
    creates a file representation of this deck
    format of the file is 
    HeroClass
    card1
    card2
    card3
    ...
    */
    public File export(){
        File output = new File("Decks"+File.separator+deckName+".deck");
        ArrayList<String> lines = new ArrayList<>();
        lines.add(deckClass.name());
        for(Card c : deck){
            lines.add(c.name);
        }
        try {
            FileWriter fw = new FileWriter(output, false);
            BufferedWriter bw = new BufferedWriter(fw);
            for (String s : lines) {
                bw.write(s);
                System.out.println("writing... " + s);
                bw.newLine();
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return output;
    }
    /**
     * determines if this deck is legal
     * @return 
     */
    public boolean isValid(){
        Map<String,Integer> numCards = new HashMap<>(); //stores the naame of card with hte num of them in the deck
        for(Card c : deck){
            if(c==null) return false;
            if(c.heroClass != HeroClass.Neutral && c.heroClass != deckClass){
                return false;
            }
            if(numCards.get(c.name)==null) numCards.put(c.name, 1);
            else{
                numCards.put(c.name, numCards.get(c.name)+1);
                if(numCards.get(c.name) > MAX_NUM_COPIES){
                    return false;
                }
            }
        }
        if(deck.size()<MIN_NUM_CARDS) return false;
        return true;
    }
    
    /**
     * returns a list of problems with the deck.
     * used to figure out why a deck is illegal
     * @return list of string explanations of what went wrong. empty if legal deck
     */
    public ArrayList<String> diagnose(){
        ArrayList<String> output = new ArrayList<>();
        Map<String, Integer> numCards = new HashMap<>(); //stores the naame of card with hte num of them in the deck
        for (Card c : deck) {
            if(c==null){
                output.add("Null card in deck");
                continue;
            }
            if (c.heroClass != HeroClass.Neutral && c.heroClass != deckClass) {
                output.add(c.name + " is of class " + c.heroClass + " but deck is of class " + deckClass);
            }
            if (numCards.get(c.name) == null) {
                numCards.put(c.name, 1);
            } else {
                numCards.put(c.name, numCards.get(c.name) + 1);
                if (numCards.get(c.name) > MAX_NUM_COPIES) {
                    output.add("too many copies of " + c.name + ". Max Copies: " + MAX_NUM_COPIES); 
                }
            }
        }
        if(deck.size()<MIN_NUM_CARDS) output.add("deck must have at least " + MIN_NUM_CARDS + " cards; currently has " + deck.size());
        return output;
    }
    /**
     * returns a card cooresponding to the name given
     */
    private Card getCard(String s) throws NoSuchCardException{
        switch(s){
            //neutral
            case "Arrakoa": return new ArakkoaCard();
            case "Archer": return new ArcherCard();
            case "FireBolt": return new FireBoltCard();
            case "Holy Spear": return new FireSpearCard();
            case "Frost Bear": return new FrostBearCard();
            case "Frost Dragon": return new FrostDragonCard();
            case "Kelpie": return new KelpieCard();
            case "Knight": return new KnightCard();
            case "Paladin": return new PaladinCard();
            case "Spell Book": return new SpellBookCard();
            case "Vengefull Knight": return new VengefullKnightCard();
            case "Volcano": return new VolcanoCard();
            //fish
            case "Baitfish": return new BaitfishCard();
            case "Carnifish": return new CarnifishCard();
            case "Frenzy": return new FrenzyCard();
            case "Jellyfish": return new JellyfishCard();
            case "Pirrana": return new PirranahCard();
            case "Predation": return new PredationCard();
            case "SeaSerpent": return new SeaSerpentCard();
            case "Sea Serpent Trap": return new SeaSerpentTrapCard();
            case "Sea Witch": return new SeaWitchCard();
            case "Swollow Trap": return new SwollowCard();
            case "Thrasher": return new ThrasherCard();
            //undead
            case "Skelemancer ": return new SkelemancerCard();
            case "Skeleton Army": return new SkeletonArmySpell();
            case "Skeleton King": return new SkullKingCard();
            case "Zombie Bite": return new ZombieBiteSpell();
            case "Zomebie": return new ZombieCard();
            case "Zombify": return new ZombieTrapCard();
            default: throw new NoSuchCardException("No card found matching name: " + s);   
        }
    }
}