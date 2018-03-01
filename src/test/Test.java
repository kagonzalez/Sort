package test;

import merge.*;
import quicksort.*;
import bubble.*;
import java.util.ArrayList;

public class Test {
	private static int[] arr = new int[] {1,21,1,5,1,2,1,6,3,16,2,15,13,2,1,1,3,52,16,513,1,25,1,32,6,12,3,532,13,513,213,513,33,13,1,23,1,21,35,2,35,3,213,135,1321,351,3213,51213,3,13,21351,321,31,321,351,321,35,321,5,31,351,313,5132,1351,351,351,31,351,31,3513,1,3513,513,51,351,351,313,51,313,153,513,51,31,351,351,351,35,1351,35,135,13,513,513,13213,513,2168,1,2169,984651,8,976,165198,791652,1654,954};
	public static void main(String[] arg) {
		ArrayList<Integer> testArr = arrayToArrayList(arr);
		long startTime = System.currentTimeMillis();
		ArrayList<Integer> testArr2 = Bubble.bubbleSort(testArr);
		long stopTime = System.currentTimeMillis();
		long elapsedTime = stopTime - startTime;
		System.out.println("QuickSort: " + elapsedTime);
		for (int i = 0; i < testArr.size(); i++)
			System.out.print(testArr.get(i) + ", ");
		System.out.print("\n");
		for (int i = 0; i < testArr2.size(); i++)
			System.out.print(testArr2.get(i) + ", ");
	}
	private static ArrayList<Integer> arrayToArrayList(int[] array) {
		ArrayList<Integer> arrLi = new ArrayList<Integer>();
		for (int i = 0; i < array.length; i++)
			arrLi.add(array[i]);
		return arrLi;
	}
}

// 1,6,8,4,9,65,1,26,3,21,8,65,1651,65,2
// 21,651,32165,13521,51,3213,5132,135,165,19846,216,849,846,216,849,516,219,846,216,54965,432,168,495,162,16854,621,654,984,621,54,9,14,51,6219,6321,654,15621,654,621,1654,62146,1654,612
// 12,1,21,1,5,1,2,1,6,3,16,2,15,13,2,1,1,3,52,16,513,1,25,1,32,6,12,3,532,13,513,213,513,33,13,1,23,1,21,35,2,35,3,213,135,1321,351,3213,51213,3,13,21351,321,31,321,351,321,35,321,5,31,351,313,5132,1351,351,351,31,351,31,3513,1,3513,513,51,351,351,313,51,313,153,513,51,31,351,351,351,35,1351,35,135,13,513,513,13213,513,2168,1,2169,984651,8,976,165198,791652,1654,954