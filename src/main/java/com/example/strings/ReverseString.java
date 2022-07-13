package com.example.strings;

public class ReverseString {
	public static void main(String[] args) {
		String input = "I am learning java";
		// Expected out put : avaj gninrael ma I
		char[] inputArray = input.toCharArray();
		int size = inputArray.length;
		char[] result = new char[size];
		int j = size - 1;
		for (int i = 0; i < size; i++) {
			result[j] = inputArray[i];
			j--;
		}
		String reversedString = String.valueOf(result);
		System.out.println(reversedString);

		String revStr = reverseUsingRecursion(input);
		System.out.println(revStr);
	}

	private static String reverseUsingRecursion(String input) {
		if (null == input || input.length() <= 1) {
			return input;
		}
		return reverseUsingRecursion(input.substring(1)) + input.charAt(0);
	}
}
