package random;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
	public static void main1(String[] args) {
        Random rand = new Random();
        int[] numbers = new int[500];

        // Generate 500 random numbers
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(1000) + 1; // Range 1 to 1000
        }

        // Sort the array
        Arrays.sort(numbers);

        // Ask user for the nth smallest number
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 500: ");
        int n = scanner.nextInt();

        // Print the nth smallest number
        System.out.println("The " + n + "the smallest number is: " + numbers[n-1]);
    }
		

	}

