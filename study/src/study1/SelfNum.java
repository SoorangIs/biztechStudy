package study1;


public class SelfNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for (int i = 1; i <= 10000; i++) {
			boolean selfCheck = true;
			for (int j = 1; j < i; j++) {
				int sumVal = j;
				int chekVal = j;
				while(chekVal > 0) {
					sumVal += (chekVal % 10);
					chekVal /= 10;
				}
				
				if(i == sumVal) {
					selfCheck = false;
					break;
				}
			}
			if(selfCheck) {
				System.out.println(i);
			}
		}
	}

}
