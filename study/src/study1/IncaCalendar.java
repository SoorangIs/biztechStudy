package study1;

import java.util.Scanner;

public class IncaCalendar {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println(scan);
		
		//이거 왜
		//1. 단순 비교를 생각 하면 40000 * 40000 가된다.		
		System.out.println(lcm(40000, 39999)); // 1599960000  1초안에 안될듯
	}

	
	
	//최대 공약수
	public static int gcd(int a, int b) {
		
		while ( b != 0 ) {
			int r = a%b;
			a = b;
			b = r;
		}
		
		return a;
	}
	
	// 최소 공배수
	public static int lcm(int a, int b) {
		return a * b / gcd(a, b);
	}

}
