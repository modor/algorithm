package com.modor.sorts;

public class SelectSort {

	public void selectSort(int[] numArray) {
		int tempVarOne, tempVarTwo, exchange;
		for (tempVarOne = 0; tempVarOne < numArray.length; tempVarOne++) {
			for (tempVarTwo = 0; tempVarTwo < numArray.length; tempVarTwo++) {
				if (numArray[tempVarOne] < numArray[tempVarTwo]) {
					exchange = numArray[tempVarOne];
					numArray[tempVarOne] = numArray[tempVarTwo];
					numArray[tempVarTwo] = exchange;
				}
			}
		}
	}
}
