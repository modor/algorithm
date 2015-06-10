package com.modor.main;

import com.modor.sort.*;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] testArray = {10,23,4,1,44,45,22,67,76,82,12,34,45};
		int i;
		Sort mySort = new Sort();
		mySort.selectSort(testArray);
		for(i = 0; i < testArray.length; i++){
			System.out.println(testArray[i]);
		}
	}

}
