/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadedesignpattern;

/**
 *
 * @author Admin
 */
public class FacadeDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();
        
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
    
}
