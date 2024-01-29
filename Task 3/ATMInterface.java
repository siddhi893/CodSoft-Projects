package codsoft_pkg;
import java.util.*;

public class ATMInterface extends UserBankAccount{
	
	Scanner sc = new Scanner(System.in);

	void withdraw() {
		
		double amount;
		
		System.out.println("Enter amount to withdraw: ");
		
		amount = sc.nextDouble();
		
		if(amount <= super.AccountBalance) {
			System.out.println("Rs. " + amount + " debited...");
			super.AccountBalance -= amount;
		}
		else {
			System.out.println("Balance Amount insufficient...");
		}
	}
	
	
	void deposit() {
		double amount;
		
		System.out.println("Enter amount to deposit: ");
		
		amount = sc.nextDouble();
		
		System.out.println("Rs. " + amount + " credited...");
		super.AccountBalance += amount;
		
	}
	
	double checkBalance() {
		return super.AccountBalance;
	}
}
