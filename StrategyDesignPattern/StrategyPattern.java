/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strategypattern;

/**
 *
 * @author Admin
 */
public class StrategyPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
        
        context=new Context(new OperationSubtract());
        System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
        
        context = new Context(new OperationMultiply());
        System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
    }
    
}
