/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package game;

/**
 *
 * @author Admin
 */
public abstract class Game {

    /**
     * @param args the command line arguments
     */
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    
    //template method
    public final void play(){
        //initialize the game
        initialize();
        
        //start game
        startPlay();
        
        //end game
        endPlay();
    }
    
}
