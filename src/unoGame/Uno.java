/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unoGame;

/**
 *
 * @author QQ | Vipers Team
 */
public class Uno extends Game {

 GroupOfCards grpCard = new GroupOfCards(7);
private String Game;


    public Uno(String givenName) {
        super(givenName);
    }

       
            
            
    @Override
   public void play(){
   
   }
   
   @Override
   public void declareWinner(){
   
   }

    /**
     * @return the Game
     */
    public String getGame() {
        return Game;
    }

    /**
     * @param Game the Game to set
     */
    public void setGame(String Game) {
        this.Game = Game;
    }
}
