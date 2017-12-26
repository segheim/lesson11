package l1;
import java.util.Scanner;
public class task12 {

	public static void main(String[] args) {
		

		        
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter symbol: ");
		        char mySymb = sc.next().charAt(0);
		        sc.close();
		        
		        do{
		            System.out.print("Enter symbol: "); 
		        }while(mySymb =='q');
		   

	}

}
