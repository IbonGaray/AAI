package kalaha;

public class MiniMax {
    
      
   //We declasre all the var's were are going to need.
    private GameState gamestate;
    
      public MiniMax(GameState game){
        this.gamestate = game.clone();
    }

    /**
     * @return the gamestate
     */
    public GameState getGamestate() {
        return gamestate;
    }

    /**
     * @param gamestate the gamestate to set
     */
    public void setGamestate(GameState gamestate) {
        this.gamestate = gamestate;
    }
    
    
    
    
    
    
    
}
