/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ExceptionPropagation {
    void m(){
        int i = 10/0;
    }
    
    void n(){
        m();
    }
    
    void p(){
        try{
            n();
        }catch(Exception e){
            System.out.println("Exception handled");
        }
    }
    
    public static void main(String[] args){
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.p();
        System.out.println("normal flow");
    }
}
