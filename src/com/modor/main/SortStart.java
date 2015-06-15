package com.modor.main;

import com.modor.sort.*;

public class SortStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = { 10, 23, 4, 1, 44, 45, 22, 67, 76, 82, 12, 34, 45, 32,98,65 };
		int i = 0;
//		Integer in = new Integer(i);
		InsertionSort mySort = new InsertionSort();
		mySort.insertionSort(testArray);
//		System.out.println(in.getClass().getName());
		for (i = 0; i < testArray.length; i++) {
		System.out.println(testArray[i]);
		}
	}
}
