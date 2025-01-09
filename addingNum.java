package pack;

import java.util.Scanner;

public class addingNum {

	public static void main(String[] args) {
	
		
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter any number.");
		int a =sc.nextInt();
		if(a%4==0) {
			
			System.out.println(a+" "+"is Divisible by 4.");
		}
		
		else {
			System.out.println(a+" "+"is Not Divisible by 4.");
		}
		
	}
	
}
