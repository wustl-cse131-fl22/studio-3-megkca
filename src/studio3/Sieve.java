package studio3;

import java.util.Scanner;

public class Sieve {

public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	
	System.out.println("What is your n value?");
	int number = in.nextInt();
	
	boolean [] primes = new boolean [number + 1];
	
	primes [0] = false;
	primes [1] = false;
			
	for (int i = 2; i<= number; i++) {
		
		primes [i] = true;
		
	}
		
	for (int i = 2; i<= number; i++) {
		
		if (primes [i] == true) {
		int currentPrime = i; 	
		
		for (int j = 2; currentPrime * j<= number; j++) {
		primes [currentPrime * j] = false;	
			
		}
			
		}
		
	}
		for (int i = 2; i<= number; i++) {
		
			if (primes [i] == true) {
				
			System.out.println(i);
			
			}
		}	
}
}