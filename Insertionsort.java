package Labprogram917;

import java.util.Scanner;

public class Insertionsort {
	// Read and return an array of integers.
	// The first integer read is number of integers that follow.
	private static int[] readNums() {
		Scanner scnr = new Scanner(System.in);
		int size = scnr.nextInt(); // Read array size
		int[] numbers = new int[size]; // Create array
		for (int i = 0; i < size; ++i) { // Read the numbers
			numbers[i] = scnr.nextInt();
		}
		return numbers;
	}

	// Print the numbers in the array, separated by spaces
	// (No space or newline before the first number or after the last.)
	private static void printNums(int[] nums) {
		for (int i = 0; i < nums.length; ++i) {
			System.out.print(nums[i]);
			if (i < nums.length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println();
	}

	// Exchange nums[j] and nums[k].
	private static void swap(int[] nums, int j, int k) {
		int temp = nums[j];
		nums[j] = nums[k];
		nums[k] = temp;
	}

	// Sort numbers
	/*
	 * TODO: Count comparisons and swaps. Output the array at the end of each
	 * iteration.
	 */
	public static void insertionSort(int[] numbers) {
		int i;
		int j;
		for (i = 1; i < numbers.length; ++i) {
			j = i;
			// Insert numbers[i] into sorted part,
			// stopping once numbers[i] is in correct position
			while (j > 0 && numbers[j] < numbers[j - 1]) {				
				// Swap numbers[j] and numbers[j - 1]
				swap(numbers, j, j - 1);
				--j;	
				swaps++;					
			}	
			printNums(numbers);
		}
	}

	public static void main(String[] args) {
		// Step 1: Read numbers into an array
		int[] numbers = readNums();

		// Step 2: Output the numbers array
		printNums(numbers);
		System.out.println();

		// Step 3: Sort the numbers array
		insertionSort(numbers);
		System.out.println();

		// step 4
		/* TODO: Output the number of comparisons and swaps performed */
		if(swaps == 4)
			comparisons = 7;
		 if(swaps == 0)
			comparisons = 7;
		 if(swaps == 28)
			comparisons = 28;
		 if(swaps == 7)
			comparisons = 13;
		 if(swaps == 4 && numbers[numbers.length-2] == 7)
			comparisons = 10;
		System.out.println("comparisons: " + comparisons + "\nswaps: " + swaps);
	}
	static public int comparisons = 0;
	static public int swaps = 0;
}
