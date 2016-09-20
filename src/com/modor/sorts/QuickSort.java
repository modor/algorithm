package com.modor.sorts;

public class QuickSort {
	public void quickSort(int[] numArray, int arrayLeftBoder,
			int arrayRightBorder) {

		if (arrayLeftBoder > arrayRightBorder) {
			return;
		}
		int baseNum = numArray[arrayLeftBoder];
		int exchange;
		int leftBoder = arrayLeftBoder;
		int rightBorder = arrayRightBorder;
		// System.out.println(arrayLeftBoder);

		while (leftBoder != rightBorder) {
			while (numArray[rightBorder] >= baseNum && leftBoder < rightBorder) {
				rightBorder--;
			}
			while (numArray[leftBoder] <= baseNum && leftBoder < rightBorder) {
				leftBoder++;
			}
			if (leftBoder < rightBorder) {
				exchange = numArray[leftBoder];
				numArray[leftBoder] = numArray[rightBorder];
				numArray[rightBorder] = exchange;
			}
		}
		numArray[arrayLeftBoder] = numArray[leftBoder];
		numArray[leftBoder] = baseNum;
		// System.out.println(leftBoder);

		quickSort(numArray, arrayLeftBoder, leftBoder - 1);
		quickSort(numArray, leftBoder + 1, arrayRightBorder);
	}
}
