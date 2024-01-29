package codsoft_pkg;
import java.util.*;

public class MainATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ATMInterface atm = new ATMInterface();
		double balance;
		int option;
		char option2;
		
		System.out.println("\n**\n");
		System.out.println("-----ATM Interface-----");
		System.out.println("\n**\n");
		
		do {
			System.out.println("Enter operation to perform: \n1. Withdraw Money\n2. Deposit Money\n3. Check Balance\n");
			option = sc.nextInt();
			
			switch(option){
				case 1:
					atm.withdraw();
					System.out.println("\n**\n");
					break;
				case 2:
					atm.deposit();
					System.out.println("\n**\n");
					break;
				case 3:
					balance = atm.checkBalance();
					System.out.println("Account Balance is: Rs. " + balance);
					System.out.println("\n**\n");
					break;
				default:
					System.out.println("Invalid Option...");
					System.out.println("\n**\n");
			}
			
			System.out.println("Do you want to exit?(y/n)");
			option2 = sc.next().charAt(0);
			
			System.out.println("\n**\n");
		}while(option2 == 'n'  ||  option2 == 'N');
		
		System.out.println("Thank You for using the ATM!");
		System.out.println("\n**\n");
		
		sc.close();
	}
}


