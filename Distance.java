package company;

import java.util.*;

public Distances {
	// Function to calculate distance
	static double Distance(int x1, int y1, int x2, int y2) {
		// Calculating distance
		return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) * 1.0);
	}

	// Main method
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //input from user
		System.out.println("Enter value of X");
		int x2 = sc.nextInt();
		System.out.println("Enter value of Y");
		int y2 = sc.nextInt();
		System.out.println(Math.round(distance(0, 0, x2, y2) * 100000.0) / 100000.0);
	}
}
