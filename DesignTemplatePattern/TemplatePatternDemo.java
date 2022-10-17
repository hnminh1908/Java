/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

/**
 *
 * @author Admin
 */
public class TemplatePatternDemo {    
    public static void main(String[] args){
        
        Game game = new Cricket();
        game.play();
        System.out.println();
        game= new Football();
        game.play();
        System.out.print("Finish");
    }
}
