/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame1;

/**
 * controls meta gameplay and turn order
 * @author Joseph
 */
public class GameController {
    /*   FIELDS   */
    public Hero activeHero;
    public Hero inactiveHero;
    public Board board;

    public GameController(Board b) {
        board = b;
    }

    public void nextTurn() {
        activeHero.onTurnEnd();
        Hero temp = activeHero;
        activeHero = inactiveHero;
        inactiveHero = temp;
        activeHero.onTurnStart();
        if(activeHero.isAIControlled){
            
        }
    }

    public void startGame() {
        for (int i = 0; i < 4; i++) {
            Board.topHero.draw();
            Board.botHero.draw();
        }
        activeHero = Board.botHero;
        activeHero.turn = true;
        inactiveHero = Board.topHero;
        inactiveHero.turn = false;
    }

}
