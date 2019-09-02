package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		
		
		
		int count = scan.nextInt();
		
		for (int j=0; j <count; j++) {

		String nameOfCustomer = scan.next();
		String letter = Character.toString(nameOfCustomer.charAt(0));
		nameOfCustomer = letter;
		nameOfCustomer = nameOfCustomer + ". "+ scan.next();
		
		int items = scan.nextInt();
		double total = 0;
		for (int i=0; i<items; i++) {
			double y = 0;
			int x = scan.nextInt();
			String itemName = scan.next();
			y = scan.nextDouble();
			double z = y;
			for (int k=1; k <x; k++) {
				z = z + y;
			}
			total = total + z;
		}		
				
		System.out.println(nameOfCustomer + ": " + total);

	}
		
		scan.close();
		
	}
}
