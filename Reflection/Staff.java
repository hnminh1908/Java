/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reflectionapp;

/**
 *
 * @author Admin
 */
public class Staff {

private int age = 0;

private void privateStaff() {

System.out.println("Call private method with age = " + age);

}

//Constructor
public Staff(int age){
    this.age = age;
}

private int getAge(){
    return age;
}

public void setAge(int age){
    this.age = age;
}
}
