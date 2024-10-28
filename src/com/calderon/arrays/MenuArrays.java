package com.calderon.arrays;

import java.text.BreakIterator;
import java.util.Scanner;

public class MenuArrays {

	public void init() {
		Integer opcion = 0;
		do {
			this.showMenuArrays();
			opcion = this.getIntegerNumberFromUserKeyboard();

			switch (opcion) {
			case 1:
				ShowArray showArray = new ShowArray();
				showArray.init();
				break;
			case 2:
				AverageArray averageArray = new AverageArray();
				averageArray.init();
				break;
			case 3:
				IncrementArray incrementArray = new IncrementArray();
				incrementArray.init();
				break;
			default:
				System.out.println("Hasta luego");
				break;

			}

		} while (opcion >= 1 && opcion <= 3);

		this.showMenuArrays();

//		ShowArray showArray = new ShowArray();
//		showArray.init();
//		
//		AverageArray averageArray = new AverageArray();
//		averageArray.init();
//
//		IncrementArray incrementArray = new IncrementArray();
//		incrementArray.init();		

	}

	private void showMenuArrays() {
		System.out.println();
		System.out.println();
		System.out.println("MENU DE OPERACIONES:");
		System.out.println("********************");
		System.out.println("1) Show Array");
		System.out.println("2) Average Array");
		System.out.println("3) Increment Array");
		System.out.println("4) Finalizar el programa");
		System.out.println("\t Introduce tu opción:");
	}

	private Integer getIntegerNumberFromUserKeyboard() {
		Integer numberFromUserKeyboard = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Introduce un número : ");
		numberFromUserKeyboard = scan.nextInt();

		// scan.close();
		return numberFromUserKeyboard;
	}

}