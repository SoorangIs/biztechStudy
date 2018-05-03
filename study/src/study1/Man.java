package study1;

public class Man implements Comparable<Man> {

	private String name;

	private int age;

	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	//오버라이드는 상속한 상태로 부모의 매서드를 새로 정의 하여 사용
	//오버라이드 사전적의미는 무시하다 무효하다.
	//오버로딩은 같은 매서드를 변수추가로 같은 함수 명에 여러가지 변수를 사용 할 수있게 한다.
	//오버로딩 사전적의미는 쌓는다.
	public String toString() {
		return name + " (age : " + age + ")";
	}

	public int compareTo(Man man) {
		if (this.age < man.age) {
			return -1;
		} else if (this.age == man.age) {
			return 0;
		} else {
			return 1;
		}

	}

}
