package merge;

public class MergeSort {
	public static int[] mergeSort(int[] unsorted) {
		int[] firstHalf = new int[unsorted.length/2];
		int[] secondHalf = new int[(int) Math.ceil(unsorted.length/2.)];
		System.out.println("First Half Length: " + firstHalf.length + "\n" + 
						   "Second Half Length: " + secondHalf.length);
		String firHalfStr = "";
		String secHalfStr = "";
		System.out.print("Unsorted Array equals: ");
		for (int k = 0; k < unsorted.length; k++)
			System.out.print(unsorted[k] + ", ");
		System.out.println("");
		if (unsorted.length == 1) {
			System.out.println("Recurssing");
			return unsorted;
		}
		else {
			int j = 0;
			for (int i = 0; i < unsorted.length; i++) {			// Splits the unsorted array into two equal parts where is the second is larger in the event of an array of uneven size
				if (i < firstHalf.length)
					firstHalf[i] = unsorted[i];
				else {
					secondHalf[j] = unsorted[i];
					j++;
				}
			}
			System.out.print("First Array equals: ");
			for (int k = 0; k < firstHalf.length; k++)
				System.out.print(firstHalf[k] + ", ");
			System.out.println("");
			firstHalf = mergeSort(firstHalf);
			for (int i = 0; i < firstHalf.length; i++)
				firHalfStr = firHalfStr + firstHalf[i] + ", ";
			System.out.print("Second Array equals: ");
			for (int k = 0; k < secondHalf.length; k++)
				System.out.print(secondHalf[k] + ", ");
			System.out.println("");
			secondHalf = mergeSort(secondHalf);
			for (int i = 0; i < secondHalf.length; i++)
				secHalfStr = secHalfStr + secondHalf[i] + ", ";
			System.out.println("Combining: " + firHalfStr + "and " + secHalfStr);
			return merge(firstHalf, secondHalf);
		}
	}

	/**
	 * Combines and sorts split arrays
	 * @param firstHalf
	 * @param secondHalf
	 * @return sorted array
	 */
	private static int[] merge(int[] firstHalf, int[] secondHalf) {
		int[] combined;
		if (firstHalf.length != secondHalf.length) 
			combined = new int[firstHalf.length*2 + 1];
		else
			combined = new int[firstHalf.length*2];
		int j = 0;
		for (int i = 0; i < secondHalf.length; i++) {
			if (i < firstHalf.length) {
				if (firstHalf[i] < secondHalf[i]) {
					combined[j] = firstHalf[i];
					j++;
					combined[j] = secondHalf[i];
				}
				else {
					combined[j] = secondHalf[i];
					j++;
					combined[j] = firstHalf[i];
				}
			}
			else {
				if (firstHalf[i-1] < secondHalf[i])
					combined[j] = secondHalf[i];
			}
			j++;
		}
		j = 1;
		for (int i = 0; i < combined.length; i++) {
			if (j < combined.length)
				if (combined[i] > combined[j]) {
					int temp;
					temp = combined[i];
					combined[i] = combined[j];
					combined[j] = temp;
				}
			j++;
		}
		System.out.print("Combined Array equals: ");
		for (int k = 0; k < combined.length; k++)
			System.out.print(combined[k] + ", ");
		System.out.println("");
		return combined;
	}
}
