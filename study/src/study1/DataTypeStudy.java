package study1;

public class DataTypeStudy {

	public static void main(String[] args) {
		Student kim = new Student("����");
//		kim.name = "�輱��";
	
		
		System.out.println(kim.name);
	}
	
}


class Student {
	
	String name;
	
	public Student() {
		this.name = "����";
	}
	
	public Student(String i) {
		this.name = i;
	}
		
}