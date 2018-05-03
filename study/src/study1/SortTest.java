package study1;

import java.util.Arrays;
import study1.Man;

public class SortTest {

	public static void main(String[] args) {
		Man[] mans = {
				new Man("Sunny", 20)
				, new Man("Tom", 8)
				, new Man("Joy", 12)
				, new Man("Jack", 40)
				, new Man("Love", 10)
		};
		
		System.out.println("��");
		print(mans);
		
		Arrays.sort(mans);
		System.out.println("��");
		print(mans);
	}
	
	public static void print(Man[] mans) {

		for (int i = 0; i < mans.length; i++) {
			System.out.println(mans[i]);
		}

	}

}

