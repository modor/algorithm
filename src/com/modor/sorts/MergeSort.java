package com.modor.sorts;

public class MergeSort {
	public void mergeSort(int[] numArray, int arrayLeftBoder,
			int arrayRightBorder) {
		if (arrayLeftBoder >= arrayRightBorder) {
			return;
		}
		int divideNum = (arrayLeftBoder + arrayRightBorder) / 2;
		mergeSort(numArray, arrayLeftBoder, divideNum);
		mergeSort(numArray, divideNum + 1, arrayRightBorder);

		merge(numArray, arrayLeftBoder, divideNum, arrayRightBorder);
	}

	public void merge(int[] numArray, int arrayLeftBoder, int divideNum,
			int arrayRightBorder) {
		int[] temArray = new int[numArray.length];
		int midNum = divideNum + 1;
		int tmpNum = arrayLeftBoder;
		int tmpArraynum = arrayLeftBoder;

		while (arrayLeftBoder <= divideNum && midNum <= arrayRightBorder) {
			if (numArray[arrayLeftBoder] <= numArray[midNum]) {
				temArray[tmpArraynum++] = numArray[arrayLeftBoder++];
			} else {
				temArray[tmpArraynum++] = numArray[midNum++];
			}
		}
		while (midNum <= arrayRightBorder) {
			temArray[tmpArraynum++] = numArray[midNum++];
		}
		while (arrayLeftBoder <= divideNum) {
			temArray[tmpArraynum++] = numArray[arrayLeftBoder++];
		}
		while (tmpNum <= arrayRightBorder) {
			numArray[tmpNum] = temArray[tmpNum++];
		}
	}
}
