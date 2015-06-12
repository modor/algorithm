package com.modor.sort;

public class BubbleSort {
	public void bubbleSort(int[] numArray) {
		int tempVarOne, tempVarTwo, exchange;
		for (tempVarOne = 0; tempVarOne < numArray.length; tempVarOne++) {
			for (tempVarTwo = 0; tempVarTwo < numArray.length - tempVarOne - 1; tempVarTwo++) {
				if (numArray[tempVarTwo] > numArray[tempVarTwo + 1]) {
					exchange = numArray[tempVarTwo + 1];
					numArray[tempVarTwo + 1] = numArray[tempVarTwo];
					numArray[tempVarTwo] = exchange;
				}
			}
		}
	}
}
