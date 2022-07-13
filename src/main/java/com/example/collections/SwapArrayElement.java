package com.example.collections;

public class SwapArrayElement {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8 };
		swap(a);
	}

	private static void swap(int[] a) {
		int size = a.length;
		int j = 1;
		for (int i = 0; i < size; i = i + 2) {
			int temp=a[i];
			a[i] = a[j];
			a[j] = temp;
			j = j + 2;
		}
		
		for(int i=0;i<size;i++) {
			System.out.print(a[i]+" ");
		}
	}
}
