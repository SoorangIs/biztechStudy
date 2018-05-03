package study1;

public class DataTypeStudy {

	public static void main(String[] args) {
		Student kim = new Student();
//		kim.name = "kim";
		
		System.out.println(kim.name);
	}
	
}


class Student {
	
	String name;
	
	public Student() {
		this.name = "ㄱ나다";
	}
	
	public Student(String i) {
		this.name = i;
	}
		
}