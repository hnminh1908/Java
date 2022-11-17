/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runtimeexception;

/**
 *
 * @author Admin
 */
public class TestRuntimeException {

    public void testRuntimeException() {
        throw new MyException();
    }
    
    public static void main(String[] args) {
        try{
            new TestRuntimeException().testRuntimeException();
        }catch (Exception e){
            System.out.println(e.getClass().getName());
        }
    }
    
}
class MyException extends RuntimeException {
        public MyException() {
            super();
        }
    }
