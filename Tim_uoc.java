
package tim_uoc;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Tim_uoc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap so tim uoc: ");
        int n=scanner.nextInt();
        
        //tim uoc
        for(int i=1; i<=n; i++){
            if(n%i==0){
                System.out.print((i)+" ");
            }
        }
        
    }
    
}
