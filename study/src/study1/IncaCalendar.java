package study1;

import java.util.Scanner;

public class IncaCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println(scan);
	}
	
	//최대 공약수
	int gcd(int a, int b) {
		
		while ( b != 0 ) {
			int r = a%b;
			a = b;
			b = r;
		}
		
		return a;
	}
	
	// 최소 공배수
	int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}
