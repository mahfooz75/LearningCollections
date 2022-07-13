package com.example.collections;

public class App {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		System.out.print("a"+ " "+a);
		System.out.print(" b"+ " "+b);
		System.out.print(" c"+ " "+c);
		
		if((a++ > 11) && c++==11) {
			b++;
			c--;
		} else {
			a++;
			c++;
			b--;
		}
		a++;	
		System.out.println();
		System.out.print("a"+ " "+a);
		System.out.print(" b"+ " "+b);
		System.out.print(" c"+ " "+c);
	}

}
