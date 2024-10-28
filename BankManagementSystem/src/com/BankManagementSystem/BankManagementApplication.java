package com.BankManagementSystem;
import java.util.*;
class account{
	private String acno;
	private String acname;
	private double balance;
	account(String acno,String acname){
		this.acno=acno;
		this.acname=acname;
		this.balance=0.0;
		
	}
	public String getno() {
		return acno;
	}
	public String getname() {
		return acname;
	}
	public double balance() {
		return balance;
	}
	void deposit(double amt) {
		if(amt>0) {
			balance = balance + amt;
		}else {
			System.out.println("Invalid deposit amount");
		}
		
	}
	void withdraw(double amt) {
		if(amt<balance && amt>0) {
			balance = balance - amt;
		}else {
			System.out.println("Insufficient balance");
		}
		
	}

}


public class BankManagementApplication {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter account no");
		String acno=scan.nextLine();
		System.out.println("Enter account holder name");
		String acname = scan.nextLine();
		account ac = new account(acno,acname);
		int ch=0;
		while(true) {
			System.out.println("");
			System.out.println("Enter choices ");
			System.out.println("1.deposit");
			System.out.println("2.withdraw");
			System.out.println("3.checking balance");
			System.out.println("4.exit");
			ch=scan.nextInt();
			switch(ch) {
			case 1:
				System.out.println("enter amount to deposit");
				double da = scan.nextDouble();
				ac.deposit(da);
				break;
			case 2:
				System.out.println("enter amount to withdraw");
				double wi = scan.nextDouble();
				ac.withdraw(wi);
				break;
			case 3:
				System.out.println(ac.balance());
				break;
			case 4:
				System.out.println("existed");
				break;
			default:
				//System.out.println("invalid choice");
				scan.close();
				System.exit(0);
				break;
			}
			
			
		}
		
		
		

	}

}
