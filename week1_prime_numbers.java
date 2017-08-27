import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter number: ");
		long input = scan.nextLong();

		long larger = findLargerPrime(input);
		long smaller = findSmallerPrime(input);

		System.out.println(smaller + "," + input + "," + larger);
	}

	public static long findLargerPrime(long input) {
		long i = input + 1, j;
		while(true) {
			if(isPrime(i)) {
				return i;
			}
			i++;
		}
	}

	public static long findSmallerPrime(long input) {
		long i = input - 1, j;
		while(true) {
			if(isPrime(i)) {
				return i;
			}
			i--;
		}
	}
	
	public static boolean isPrime(long input) {
		long i = 2;
		if(input < 2) {
			return false;
		}
		else if(input == 2) {
			return true;
		}
		else if(input % 2 == 0 || input % 3 == 0) {
			return false;
		}
		else {
			while(i < Math.sqrt(input)) {
				if(input % i == 0) {
					return false;
				}
				i++;
			}
			return true;
		}
	}
}
