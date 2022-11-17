/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package regexstringnonumber;

/**
 *
 * @author Admin
 */
import java.util.regex.Pattern; 
import java.util.Scanner;
class StringValidator { 
    private Pattern pattern; 
    private static final String INSTR_PATTERN = "^[a-zA-Z._-]{0,1000}$"; 
    
    public StringValidator() { 
        pattern = Pattern.compile(INSTR_PATTERN); 
    } 
    
    public boolean validate(final String username) { 
        return pattern.matcher(username).matches(); 
    } 
}

public class RegexStringNoNumber { 
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap day ky tu: ");
         String inStr= scanner.nextLine();
        StringValidator validator = new StringValidator(); 
        if(validator.validate(inStr)==true){
            System.out.println("Hop le");
        }else{
            System.out.println("Co chu so, khong hop le");
        }  
    } 
}
