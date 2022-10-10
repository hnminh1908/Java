
package check_symmetry;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
import java.util.Stack;
public class Check_symmetry {

    /**
     * @param args the command line arguments
     */
    public static void compare_str(String str1, String str2){
        int count=0;
        int L1=str1.length();
        int L2=str2.length();
        int L_check=Math.min(L1, L2);
        
        for(int i=0; i<L_check; i++){
            int str1_check=str1.charAt(i);
            int str2_check=str2.charAt(i);
            if(str1_check==str2_check){
                count++;
            }else{
                count=0;
            }
        }
        if(count!=0){
            System.out.println("Day la chuoi doi xung.");
        }else{
            System.out.println("Day khong phai la chuoi doi xung.");
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Nhap day kiem tra: ");
        Scanner scanner=new Scanner(System.in);
        String in_str=scanner.nextLine();
        //check number of input is even or odd
        if(in_str.length() %2 != 0){
            System.out.println("Day khong phai la chuoi doi xung.");
            return;
        }
        
        String reverse_str="";
        Stack stack_str=new Stack();
        for(int i=0; i<in_str.length(); i++){
            stack_str.push(in_str.charAt(i));
        }
        while(!stack_str.isEmpty()){
            reverse_str += stack_str.pop();
        }
        
        //compare string
        compare_str(in_str, reverse_str);
    }
}
