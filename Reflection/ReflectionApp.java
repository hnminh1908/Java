/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reflectionapp;

/**
 *
 * @author Admin
 */
import java.lang.reflect.Method;
import java.lang.reflect.Constructor;
public class ReflectionApp {
    public static void main(String[] args) throws Exception {
       try{
           Staff stf = new Staff(20);
           
           //Create Method Object
           Method privateMethod = Staff.class.getDeclaredMethod("getAge");
           
           //Set the accessibility as true
           privateMethod.setAccessible(true);
           
           int age = (int)privateMethod.invoke(stf);
           System.out.println("Call private method with age = " + age);
       }catch(Exception e){
           e.printStackTrace();
       }
    }
    
}
