package com.calderon.arrays;

import java.util.Scanner;

public class IncrementArray {

	public void init() {
		System.out.println("Dime cuantos items quieres en el array");
		Integer maxItemArray = this.getIntegerNumberFromUserKeyboard();
		Integer[] integerArray = this.getNewArrayOfInteger(maxItemArray);
		this.setArrayOfIntegerToZero(integerArray);
		System.out.println("Ahora te voy a pedir cada item del array");
		this.setArrayOfIntegerFromUser(integerArray);		
		this.setArrayOfIntegerToIncrementInOne(integerArray);
		this.showArrayOfInteger(integerArray);	
	}

	private void showArrayOfInteger(Integer[] integerArray) {
		for (int i = 0; i < integerArray.length; i++) {
			System.out.println("Item " + i + " valor "
					+ integerArray[i]);
		}
	}
	
	private void setArrayOfIntegerToIncrementInOne(Integer[] integerArray) {
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i]++;
		}		
	}

	private void setArrayOfIntegerFromUser(Integer[] integerArray) {
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = this.getIntegerNumberFromUserKeyboard();
		}			
	}

	private void setArrayOfIntegerToZero(Integer[] integerArray) {
		for (int i = 0; i < integerArray.length; i++) {
			integerArray[i] = 0;
		}		
	}
	
	private Integer[] getNewArrayOfInteger(Integer maxItemArray) {
		return new Integer[maxItemArray];
	}
	
	private Integer getIntegerNumberFromUserKeyboard() {
		Integer numberFromUserKeyboard = 0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número entero: ");
		numberFromUserKeyboard = scan.nextInt();
		
		//scan.close();
		return numberFromUserKeyboard;
	}
	
}