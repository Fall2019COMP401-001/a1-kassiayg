package a1;

import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int count = scan.nextInt();
		String[] items = new String[count];
		double[] cost = new double[count];
		for (int i=0; i < count; i++) {
			items[i] = scan.next();
			cost[i] = scan.nextDouble();
		}
		// for loop creating the arrays of items and their cost
		
		int numberOfCustomers = scan.nextInt();
		double[] allTotals = new double[numberOfCustomers];
		String[] allCustomers = new String[numberOfCustomers];
		
		for (int i = 0; i < numberOfCustomers; i++) {
			double total = 0;
			String nameOfCustomer = scan.next();
			nameOfCustomer = nameOfCustomer + " " + scan.next();
			allCustomers[i] = nameOfCustomer;
			int numOfItems = scan.nextInt();
			
			for (int j = 0; j < numOfItems; j++) {
				int perItem = scan.nextInt();
				String itemSearch = scan.next();
				double totalPerItem = 0;
				double z = totalPerItem;

				for (int k = 0; k < items.length; k++) {
					if (itemSearch.equals(items[k])) {
						totalPerItem = cost[k];
						z = totalPerItem;
						
						for (int h=1; h <perItem; h++) {
							z = z + totalPerItem;
						}
						
						k = items.length;
					}
				}
				total = total + z;
				
			}
			allTotals[i] = total;
		}

		
		String biggest = new String();
		String smallest = new String();
		String average = new String();
		double max = 0;
		double min = 0;
		double avg = 0;
		String maxStr = new String();
		String minStr = new String();
		
		for (int l=0; l < numberOfCustomers; l++) {
			avg = allTotals[l] + avg; 
		}
		avg = avg / numberOfCustomers;
		average = String.format("%.2f", avg);

		max = allTotals[0];
		biggest = allCustomers[0];
		for (int g = 1; g <numberOfCustomers; g++) {
			if (allTotals[g] > max) {
				max = allTotals[g];
				biggest = allCustomers[g];
			}
		}
		maxStr = String.format("%.2f", max);
		
		min = allTotals[0];
		smallest = allCustomers[0];
		for (int g = 1; g <numberOfCustomers; g++) {
			if (allTotals[g] < min) {
				min = allTotals[g];
				smallest = allCustomers[g];
			}
		}
		minStr = String.format("%.2f", min);
				
		
		System.out.println("Biggest: " + biggest + " (" + maxStr + ")");
		System.out.println("Smallest: " + smallest + " (" + minStr + ")");		
		System.out.println("Average: " + average);
		scan.close();
	}
}

