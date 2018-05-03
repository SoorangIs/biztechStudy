package study1;

public class DataTypeStudy {

	public static void main(String[] args) {
		Student kim = new Student("¤¿¤¿");
//		kim.name = "±è¼±´Þ";
	
		
		System.out.println(kim.name);
	}
	
}


class Student {
	
	String name;
	
	public Student() {
		this.name = "¾ø³×";
	}
	
	public Student(String i) {
		this.name = i;
	}
		
}