package codsoft_pkg;

import java.util.*;

public class Task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int random, user_ip, attempts, rounds = 0, sum_scores = 0;
		boolean flag;
		char option;
		
		
		System.out.println("\n**\n");
		System.out.println("\t------NUMBER GAME------");
		
		
		do {
			random = (int)(Math.random()*100 + 1);
			attempts = 10;
			flag = false;
			
			do {
				System.out.print("\n**\n");
				System.out.println("Please enter a number between 1 to 100: ");
				user_ip = sc.nextInt();
				
				if(user_ip == random) {
					System.out.println("Correct guess!!!");
					flag = true;
					break;
				}
				else if(user_ip > random) 
					System.out.println("Try Again :( Go for a SMALLER number...");
				else
					System.out.println("Try Again :( Go for a LARGER number...");
				
				System.out.println("You have " + --attempts + " attempts left!");
				
			}while(user_ip != random  &&  attempts>0);
			
			System.out.println("Your Score is: " + attempts);
			sum_scores += attempts;
			rounds++;
			
			if(flag)
				System.out.println("YOU WIN!!! :) ");
			else
				System.out.println("YOU LOSE... :') ");
			
			System.out.print("\n**\n");
			
			System.out.println("Do you want to play again? (y/n)");
			option = sc.next().charAt(0);
		
		}while(option != 'n');
		
		System.out.println("\nYour FINAL SCORE IS: " + ((float)sum_scores/(float)rounds));
		System.out.print("\n**\n");
		System.out.println("Thank you for playing the game!");
		System.out.print("\n\t\t---X---\n");
	
		sc.close();
	}

}