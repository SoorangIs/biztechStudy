package study1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringBufferStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb = new StringBuffer();
		sb.append( "abcdef" );
		System.out.println(sb.capacity());
		sb.append( sb );
		
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		sb.delete(1, 2);
		System.out.println(sb);
		
		sb.insert(4, "kk");
		System.out.println(sb);
		
		sb.reverse();
		System.out.println(sb);
		
//		sb.setLength(16);
//		System.out.println(sb);
		
		System.out.println(sb.length());
		
		
		sb.replace(1, 3, "nn");
		System.out.println(sb);
		
		int [] testArr = new int[] {3,23,234,1,64};
		Arrays.sort(testArr);
		
		for (int i = 0; i < testArr.length; i++) {
			System.out.println(testArr[i]);
		}
		
		List ds = new ArrayList();		
		

	}

}
