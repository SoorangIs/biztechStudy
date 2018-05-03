package study1;


public class NumSum {
	
	class Solution {

	    public int solution(int n) {
	        return getAnswer(n);
	    }

	    public int getAnswer(int n) {
	        int answer = 0;
	        while (n > 0) {
	            answer += (n % 10);
	            n /= 10;
	        }
	        return answer;
	    }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * �ڿ��� N�� �־�����, N�� �� �ڸ����� ���� ���ؼ� return �ϴ� solution �Լ��� ����� �ּ���.
		 * ������� N = 123�̸� 1 + 2 + 3 = 6�� return �ϸ� �˴ϴ�.
		 */
		NumSum numSum = new NumSum();
		NumSum.Solution sol = numSum.new Solution(); 
		
		System.out.println(sol.solution(272));
		

	}
	
	

}
