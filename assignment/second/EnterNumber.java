package com.capgemini.assignment.second;
import java.util.Scanner;
public class EnterNumber {
	private static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
	do {
		System.out.println();
		System.out.println("aenetr the choice from the following option");
		System.out.println("1 2 3 4 5");
		
		int choice=sc.nextInt();
		System.out.println("your choice is"+choice);
		
		switch(choice) {
		case 1:
			System.out.println("enter your name");
		String name=sc.next();
		System.out.println("your name is "+name);
		break;
		case 2:
			System.out.println("enter your age");
		Byte age=sc.nextByte();
		System.out.println("your age is"+age);
		break;
		case 3:
			System.out.println("enter your address");
		String address=sc.next();
		System.out.println("your address is"+address);
		break;
		case 4:
			System.out.println("enter your phonenumber");
		long phonenumber=sc.nextLong();
		System.out.println("your phones is"+phonenumber);
		break;
		case 5:
			System.out.println("you dont have anything to display,thank u");
		return;
		default:
			System.out.println("enter the correct input within 5");
			
		}
	}while(true);
	
	}
	}



