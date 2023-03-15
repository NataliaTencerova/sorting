package Sorting;

import java.util.Arrays;
import java.util.Random;

public class SortingNumbers {
	public static final int LENGTH = 10;
	public static final int MIN = -9;
	public static final int MAX = 9;
	
	public static int[] generateSequence() {
		int[] sequence = new int[LENGTH];
		Random rnd = new Random();
		
		for(int i = 0; i < sequence.length; i++) {
			sequence[i] = rnd.nextInt(MIN, MAX+1);
		}
		
		return sequence;
	}
	
	public static void insertionSort(int[] sequence) {
		for(int i = 1; i < sequence.length; i++) {
			int pom = sequence[i];
			int j = i-1;
			while(j >= 0 && sequence[j] > pom) {
				sequence[j+1] = sequence[j];
				j--;
			}
			sequence[j+1] = pom;
		}
	}
	public static void main(String[] args) {
		int[] sequence = generateSequence();
		int[] sequence2 = Arrays.copyOf(sequence, sequence.length);
		System.out.println("Sequence to sort: "+Arrays.toString(sequence));
		insertionSort(sequence);
		System.out.println("Insertion sort: "+Arrays.toString(sequence));
		Arrays.sort(sequence2);
		System.out.println("Library sorting method: "+Arrays.toString(sequence2));
	}
}