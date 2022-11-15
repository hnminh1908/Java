/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class initCause {
    public static void main(String[] args) throws Throwable{
        try{
            function1();
        }catch(Exception e){
            System.out.println("Cause: " + e.getCause());
        }
    }
    
    public static void function1() throws javaException{
        try{
            function2();
        }catch(newException n){
            javaException j1=new javaException();
            j1.initCause(n);
            throw j1;
        }
    }
    
    public static void function2() throws newException{
        throw new newException();
    }
}

class javaException extends Throwable{
    javaException(){
        super("This is new java Exception!!");
    }
}

class newException extends Throwable{
    newException(){
        super("This is another new exception!!");
    }
}
