package bubble;

import java.util.ArrayList;

public class Bubble {
	public static int[] bubbleSort(int[] unsorted) {
		for (int i = 0; i < unsorted.length; i++) {
			for (int j = 0; j < unsorted.length; j++) {
				if (i > j) {
					int temp = unsorted[i];
					unsorted[i] = unsorted[j];
					unsorted[j] = temp;
				}
			}
		}
		return unsorted;
	}
	public static ArrayList<Integer> bubbleSort(ArrayList<Integer> unsorted) {
		for (int i = 0; i < unsorted.size(); i++) {
			for (int j = 0; j < unsorted.size(); j++) {
				if (i > j) {
					int temp = unsorted.get(i);
					unsorted.set(i, unsorted.get(j));
					unsorted.set(j, temp);;
				}
			}
		}
		return unsorted;
	}
}