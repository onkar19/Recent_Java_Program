package com.string;

public class Demo {
	/***
	 * SIMPLE METHODE TO COMPARE TWO STRING
	 **/
	public boolean compareString(String first, String second) {
		if (first.equalsIgnoreCase(second)) {
			return true;
		} else {
			return false;
		}
	}

	public String concatString(String first, String second) {
		return first.concat(second);

	}

	public int[] addOneToArray(int[] numbers) {
		int length = numbers.length;
		int output[] = new int[length];
		for (int i = 0; i < length; i++) {
			output[i] = numbers[i] + 1;
		}
		return output;
	}

	// TEST PERFORMANCE OF A METHOD
	public void performance() {
		
		for (int i = 0; i < 10000; i++) {

		}
		System.out.println(" FINISH ");
	}
   
	public void exception(int number) {
		int result = 10/number;
		System.out.println("Result =>" +result);
	}
}
