package program;

import java.util.Locale;
import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String accountHolder = sc.nextLine();
		
		System.out.print("Enter yes (y) for to do a initial deposity ou not (n) for don't: ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.println("Enter a initial deposit value: ");
			double initialValue = sc.nextDouble();
		}
		else {
			 
		}
		
		
		
		
		sc.close();

	}

}
