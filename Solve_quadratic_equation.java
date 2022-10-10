/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package solve_quadratic_equation;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Solve_quadratic_equation {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap he so a: ");
        float a=scanner.nextFloat();
        System.out.print("Nhap he so b: ");
        float b=scanner.nextFloat();
        System.out.print("Nhap he so c: ");
        float c=scanner.nextFloat();
        Solve_quadratic_equation.Solve(a, b, c);
    }
    public static void Solve(float a, float b, float c){
        //check
        if(a==0 && b==0){
            System.out.println("Phuong trinh vo nghiem");
        }else if (a==0 && b!=0){
            System.out.println("Phuong trinh co 1 nghiem: x = "+(-c/b));
        }
        
        //delta
        float delta = b*b - 4*a*c;
        float x1, x2;
        
        //x1, x2
        if(delta>0){
            x1=(float)((-b+Math.sqrt(delta))/(2*a));
            x2=(float)((-b-Math.sqrt(delta))/(2*a));
            System.out.println("Phuong trinh co 2 nghiem: x1 = "+x1+", "+"x2 = "+x2);
        }else if(delta==0){
            x1=(float)(-b/(2*a));
            System.out.println("Phuong trinh co nghiem kep: x1 = x2 = "+x1);
        }else{
            System.out.println("Phuong trinh vo nghiem");
        }
    }
}
