package com.modor.sort;

public class InsertionSort {
	public void insertionSort(int[] numArray){
		int rightBorder, sortVar, exchange;
		for(rightBorder = 1;rightBorder < numArray.length;rightBorder++){
//			exchange = numArray[rightBorder];
			for(sortVar=rightBorder-1; sortVar>=0 && numArray[sortVar] > numArray[sortVar+1];sortVar--){
				exchange = numArray[sortVar];
				numArray[sortVar] = numArray[sortVar+1];
				numArray[sortVar+1] = exchange;
			}
		}
	}
}
