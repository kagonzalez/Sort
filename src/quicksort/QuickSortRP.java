package quicksort;

import java.util.ArrayList;

public class QuickSortRP {
	public static ArrayList<Integer> quickSortRP(ArrayList<Integer> unsorted) {
		ArrayList<Integer> first = new ArrayList<Integer>();
		ArrayList<Integer> second = new ArrayList<Integer>();
		if (unsorted.size() > 0) {
			int pivot = unsorted.get(unsorted.size() - 1);
			unsorted.remove(unsorted.size() - 1);
			for (int i = 0; i < unsorted.size(); i++) 
				if (unsorted.get(i) <= pivot) 
					first.add(unsorted.get(i));
				else if (unsorted.get(i) > pivot) 
					second.add(unsorted.get(i));
			first = quickSortRP(first);
			second = quickSortRP(second);
			return combine(first, second, pivot);
		}
		else
			return unsorted;
	}
	private static ArrayList<Integer> combine(ArrayList<Integer> first, ArrayList<Integer> second, int pivot) {
		ArrayList<Integer> combined = new ArrayList<Integer>();
		combined.addAll(first);
		combined.add(pivot);
		combined.addAll(second);
		return combined;
	}
}
