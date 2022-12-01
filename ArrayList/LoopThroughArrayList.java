/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arraylist;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
public class LoopThroughArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        for(int i = 0; i < cars.size(); i++){
            System.out.println(cars.get(i));
        }
        
        //for-each loop
        for(String i : cars){
            System.out.println(i);
        }
    }
}
