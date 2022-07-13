package com.example.strings;

public class ReverseStringPreserveSpace {

	public static void main(String[] args) {
		String input = "I am learning java";
		// Expected out put : a va jgninrae lmaI
		char[] inputArray = input.toCharArray();
		int size = inputArray.length;
		char[] result = new char[size];
		for (int i = 0; i < size; i++) {
			if (inputArray[i] == ' ') {
				result[i] = ' ';
			}
		}

		int j = size - 1;
		for (int i = 0; i < size; i++) {
			if (inputArray[i] != ' ') {
				if (result[j] == ' ') {
					j--;
				}
				result[j] = inputArray[i];
				j--;
			}
		}
		String reversedString=String.valueOf(result);
		System.out.println(reversedString);
	}

}
