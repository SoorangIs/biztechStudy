package study1;

public class Superthis {

	public static void main(String[] args) {
		
		
		D dd = new D(4);
		System.out.println(dd.d);
		System.out.println(dd.a);
				
		E ee = new E(99);
		System.out.println(ee.d);
		System.out.println(ee.a);
		System.out.println(ee.h);
	}

}

class D {
	int a,b,c,d,e,f;
	public D() {
		a = 3; b=4; c=5; d=1; e=2; f=6;
	}
	public D(int c) {
		this();
		this.d = c;
	}
}

class E extends D {
	public int g,h,i;
	public E(int tet) {
		super(tet);
		g = 7; h=8; i=9;
	}
}

