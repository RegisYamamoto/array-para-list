package com.regis;

public class Array {
	int[] array = {1, 2, 3, 4, 5};
	
	private int soma;
	
	public void list() {
		for (int i=0; i<array.length; i++) {
			soma += array[i];
		}
	}
	
}