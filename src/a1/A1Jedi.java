package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		String[] items = new String[count];
		double[] cost = new double[count];
		int[] itemCount = new int[count];
		int[] itemBought = new int[count];
		
		for (int i=0; i < count; i++) {
			items[i] = scan.next();
			cost[i] = scan.nextDouble();
			itemCount[i] = 0;
			itemBought[i] = 0;
		}
		
		int numberOfCustomers = scan.nextInt();
		for (int i =0; i <numberOfCustomers; i++) {
			String customerName = new String();
			customerName = scan.next();
			customerName = scan.next();
			int numberOfItems = scan.nextInt();
			
			for (int j=0; j < numberOfItems; j++) {
				int perItem = scan.nextInt();
				String itemSearch = new String();
				itemSearch = scan.next();
				
				for (int k=0; k < items.length; k++) {
					if (itemSearch.equals(items[k])) {
						itemCount[k] = perItem + itemCount[k];
						itemBought[k]++;
						k = items.length;
					}
				}
				
			}
			
		}
		
		for (int i=0; i <items.length; i++) {
			if (itemCount[i] ==0) {
				System.out.println("No customers bought " + items[i]);
			} else {
				System.out.println(itemBought[i] + " customers bought " + itemCount[i] + " " + items[i]);
			}
		}
		scan.close();
	}
}
