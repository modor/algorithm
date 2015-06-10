package com.modor.sort;

public class Sort {
	public void bubbleSort(int[] numArray) {
		int tempVarOne, tempVarTwo, tempExchange;
		for (tempVarOne = 0; tempVarOne < numArray.length; tempVarOne++){
			for (tempVarTwo = 0; tempVarTwo < numArray.length-tempVarOne-1; tempVarTwo++){
				if (numArray[tempVarTwo] > numArray[tempVarTwo + 1]){
					tempExchange = numArray[tempVarTwo + 1];
					numArray[tempVarTwo + 1] = numArray[tempVarTwo];
					numArray[tempVarTwo] = tempExchange;
				}
			}
		}
	}
	public void selectSort(int[] numArray) {
		
	}
}
