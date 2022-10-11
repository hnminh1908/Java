/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package check_symmetry_advanced;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Check_symmetry_advanced {

    /**
     * @param args the command line arguments
     */
    
    static int i, j, k, count=0, w;
    
    //check lan lap cac ky tu
    public static void check_repeat(String str){
        //luu tru input vao in_char
        char[] in_char=new char[str.length()];
        for(w=0;w<str.length();w++){
            in_char[w]=str.charAt(w);
        }
        //duyet in_char
        for(i=0;i<w;i++)
        {
            //luu tru ky tu tai [i] vao char ch
            char ch=in_char[i];
            for(j=i+1;j<w;j++)
            {
                /*if ch == ky tu con lai trong in_char
                *=>chuyen in_char[j+1] sang in_char[j] va giam do dai in_char w--
                *xet tiep tai j=i
                */
                if(in_char[j]==ch)
                {
                    for(k=j;k<(w-1);k++){
                        in_char[k]=in_char[k+1];
                        w--;
                        j=i;
                    }
                }
            }
        }
        //tao mang int t luu tru tong so lan xuat hien cua tung ky tu
        int[] t=new int[w];
        for(i=0;i<w;i++){
            for(j=0,count=0;j<str.length();j++){
                //dem so lan lap tung ky tu trong String
                if(in_char[i]==str.charAt(j)){
                    count++;
                }
            }
            //luu tong so lan lap cua tung ky tu
            t[i]=count;
        }
        for(i=0;i<w;i++){
            if(t[i]%2!=0){
                System.out.print("Day khong co kha nang tao chuoi doi xung.");
                return;
            }
        }
        System.out.print("Day co kha nang tao chuoi doi xung.");
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap day kiem tra: ");
        String in_str= scanner.nextLine();
        
//        if(in_str.length() %2 != 0){
//            System.out.print("Day khong co kha nang tao chuoi doi xung.");
//        }
        
        check_repeat(in_str);
    }
    
}
