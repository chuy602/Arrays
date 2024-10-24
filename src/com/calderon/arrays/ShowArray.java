package com.calderon.arrays;

public class ShowArray {

	public void init() {
		
		Integer [] integerArray =this.getNewArrayOfInteger();
		this.showArrayOfInteger(integerArray);
	}

	private void showArrayOfInteger(Integer[] integerArray) {
		for (int i = 0; i < integerArray.length; i ++) {
		 System.out.println("Item " +i + " valor " + integerArray [i]);
		}
		
	}

	private Integer[] getNewArrayOfInteger() {
		
		return new Integer [10] ;
		
	}

	
	
}
