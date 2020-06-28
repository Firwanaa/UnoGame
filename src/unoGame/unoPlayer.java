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
public class unoPlayer extends Player {
    private String playerID;
    
    public unoPlayer(String name) {
        super(name);
    }
    
    
    
    
    /**
     * @return the playerID
     */
    @Override
    public String getPlayerID() {
        return playerID;
    }

    /**
     * @param playerID the playerID to set
     */
    @Override
    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }
    
    
    @Override
      public void play(){
      
      }

    
}
