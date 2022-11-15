/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
import java.lang.Throwable;
public class GetCause {
    public static void main(String[] args) throws Throwable{
        try{
            int i = 10/0;
        }catch(Throwable t){
            t.printStackTrace();
            System.err.println("Cause: " + t.getCause());
        }
    }
}