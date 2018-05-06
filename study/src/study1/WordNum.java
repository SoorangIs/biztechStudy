package study1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WordNum {

	public static void main(String[] args) throws IOException {
		
		//영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오.
        BufferedReader inputVal = new BufferedReader(new InputStreamReader(System.in));
        String readLine = inputVal.readLine();
        StringTokenizer tokenVal = new StringTokenizer(readLine, " ");
        int countVal = tokenVal.countTokens();
        System.out.println(countVal);
	}
}

