package com.calderon.arrays;

import java.util.Scanner;

public class AverageArray {
	final int MAX_ITEMS_ARRAY = 3;

	public void init() {
		Double[] doubleArray = this.getNewArrayOfDouble();
		
		this.setArrayOfDoubleToZero(doubleArray);
		
		this.setArrayOfDoubleFromUser(doubleArray);
		
		this.showAverageFromArrayOfDouble(doubleArray);
	}

	private void showAverageFromArrayOfDouble(Double[] doubleArray) {
		Double accumulator = 0.0;	
		Double average = 0.0;
		for (int i = 0; i < doubleArray.length; i++) {
			accumulator = accumulator + doubleArray[i];
		}
		average = accumulator / MAX_ITEMS_ARRAY;
		System.out.println("La media es: " + average);
	}

	private Double getDoubleNumberFromUserKeyboard() {
		Double numberFromUserKeyboard = 0.0;
	
		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número con decimales: ");
		numberFromUserKeyboard = scan.nextDouble();
		
		//scan.close();
		return numberFromUserKeyboard;
	}
	
	private void setArrayOfDoubleFromUser(Double[] doubleArray) {
		for (int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = this.getDoubleNumberFromUserKeyboard();
		}			
	}

	private void setArrayOfDoubleToZero(Double[] doubleArray) {
		for (int i = 0; i < doubleArray.length; i++) {
			doubleArray[i] = 0.0;
		}		
	}

	private void showArrayOfInteger(Integer[] integerArray) {
		for (int i = 0; i < integerArray.length; i++) {
			System.out.println("Item " + i + " valor "
					+ integerArray[i]);
		}
	}

	private Double[] getNewArrayOfDouble() {
		return new Double[MAX_ITEMS_ARRAY];
	}

}