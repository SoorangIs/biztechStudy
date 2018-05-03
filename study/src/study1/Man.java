package study1;

public class Man implements Comparable<Man> {

	private String name;

	private int age;

	public Man(String name, int age) {
		this.name = name;
		this.age = age;
	}

	
	//�������̵�� ����� ���·� �θ��� �ż��带 ���� ���� �Ͽ� ���
	//�������̵� �������ǹ̴� �����ϴ� ��ȿ�ϴ�.
	//�����ε��� ���� �ż��带 �����߰��� ���� �Լ� �� �������� ������ ��� �� ���ְ� �Ѵ�.
	//�����ε� �������ǹ̴� �״´�.
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
