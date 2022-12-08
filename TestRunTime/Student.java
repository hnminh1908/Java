/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testruntime;

/**
 *
 * @author Admin
 */
import java.util.LinkedList;
import java.util.ArrayList;

public class Student {
    public int id;
    public String name;
    public int age;
    public double gpa;
    
    public Student(int id, String name, int age, double gpa){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    public void measurementLinkedList(){
        var start = System.nanoTime();
        var students = new LinkedList<Student>();
        for(int i = 0; i < 1000000; i++){
            students.add(createRandomStudent());
        }
        
        var elapse_mili = (System.nanoTime() - start) / 1000000;
        System.out.println(elapse_mili);
    }
    
    public void measurementArrayList(){
        var start = System.nanoTime();
        var students = new ArrayList<Student>();
        for(int i = 0; i < 1000000; i++){
            students.add(createRandomStudent());
        }
        
        var elapse_mili = (System.nanoTime() - start) / 1000000;
        System.out.println(elapse_mili);
    }
    
    private Student createRandomStudent(){
        return new Student(0, null, 0, 0);
    }
    
    public static void main(String[] args){
        Student stdnt = new Student(0, null, 0, 0);
        stdnt.measurementLinkedList();
        stdnt.measurementArrayList();
    }
}
