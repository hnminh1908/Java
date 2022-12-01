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
import java.util.Collections;   //include sort()
public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        
        //sort items alphabetically or numerically
        Collections.sort(cars);
        
        for(String i : cars){
            System.out.println(i);
        }
    }
}
