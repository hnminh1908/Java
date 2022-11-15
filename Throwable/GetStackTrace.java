/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class GetStackTrace {
    public static void main(String[] args) {
        try{
            int i = 10/0;
        }catch(Exception e){
            StackTraceElement[] trace = e.getStackTrace();
            System.err.println(trace[0].toString());
            System.out.println(trace[0].getClass());
            System.out.println(trace[0].getMethodName());
            System.out.println(trace[0].getFileName());
            System.out.println(trace[0].getLineNumber());
        }
    }
}
