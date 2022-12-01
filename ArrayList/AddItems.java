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

public class AddItems {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        
        //get() index of input array 
        System.out.println(cars.get(0));
        
        //set() change item of index
        cars.set(0, "Opel");
        System.out.println(cars.get(0));
        
        //number of items in array
        System.out.println(cars.size());
        
        //remove(index) delete item of index
        cars.remove(0);
        System.out.println(cars.get(0));
        
        //clear() delete all items
        cars.clear();
    }
}
