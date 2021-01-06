package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 12.
 * ���� ���� : ������
 * ���� ��ȣ : 1406
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �� �ٷ� �� ������ �����͸� �����Ϸ��� �Ѵ�. �� ������� ���� �ҹ��ڸ��� ����� �� �ִ� �������, �ִ� 600,000���ڱ��� �Է��� �� �ִ�.
 *          �� �����⿡�� 'Ŀ��'��� ���� �ִµ�, Ŀ���� ������ �� ��(ù ��° ������ ����), ������ �� ��(������ ������ ������), �Ǵ� ���� �߰� ������ ��(��� ���ӵ� �� ���� ����)�� ��ġ�� �� �ִ�.
 *          �� ���̰� L�� ���ڿ��� ���� �����⿡ �ԷµǾ� ������, Ŀ���� ��ġ�� �� �ִ� ���� L+1���� ��찡 �ִ�.
 *          
 *          �� �����Ⱑ �����ϴ� ��ɾ�� ������ ����.
 *          L	= Ŀ���� �������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
 *          D	= Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
 *          B	= Ŀ�� ���ʿ� �ִ� ���ڸ� ������ (Ŀ���� ������ �� ���̸� ���õ�)
 *          	= ������ ���� Ŀ���� �� ĭ �������� �̵��� ��ó�� ��Ÿ������, ������ Ŀ���� �����ʿ� �ִ� ���ڴ� �״����
 *          P $	= $��� ���ڸ� Ŀ�� ���ʿ� �߰���
 *          �ʱ⿡ �����⿡ �ԷµǾ� �ִ� ���ڿ��� �־�����, �� ���� �Է��� ��ɾ ���ʷ� �־����� ��, ��� ��ɾ �����ϰ� �� �� �����⿡ �ԷµǾ� �ִ� ���ڿ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ��, ��ɾ ����Ǳ� ���� Ŀ���� ������ �� �ڿ� ��ġ�ϰ� �ִٰ� �Ѵ�.
 *
 * ��       �� : ù° �ٿ��� �ʱ⿡ �����⿡ �ԷµǾ� �ִ� ���ڿ��� �־�����. 
 *          �� ���ڿ��� ���̰� N�̰�, ���� �ҹ��ڷθ� �̷���� ������, ���̴� 100,000�� ���� �ʴ´�. 
 *          ��° �ٿ��� �Է��� ��ɾ��� ������ ��Ÿ���� ���� M(1 �� M �� 500,000)�� �־�����. 
 *          ��° �ٺ��� M���� �ٿ� ���� �Է��� ��ɾ ������� �־�����.
 *          ��ɾ�� ���� �� ���� �� �ϳ��� ���·θ� �־�����.
 *
 * ��       �� : ù° �ٿ� ��� ��ɾ �����ϰ� �� �� �����⿡ �ԷµǾ� �ִ� ���ڿ��� ����Ѵ�.
 *
 * 
 **/
public class Main_1406 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputAlpabet = br.readLine();

		Stack<Character> leftStk = new Stack<Character>();
		Stack<Character> rightStk = new Stack<Character>();
		
		for(int i = 0; i < inputAlpabet.length(); i++) {
			leftStk.push(inputAlpabet.charAt(i));
		}
		
		int testCase = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String testString = br.readLine();
			char testChar = testString.charAt(0);
			
			switch(testChar) {
			case 'L':{
				if(!leftStk.isEmpty()) {
					rightStk.push(leftStk.pop());
				}
				break;
			}
			case 'D':{
				if(!rightStk.isEmpty()) {
					leftStk.push(rightStk.pop());
				}
				break;
			}
			case 'B':{
				if(!leftStk.isEmpty()) {
					leftStk.pop();
				}
				break;
			}
			case 'P':{
				char addChar = testString.charAt(2);
				leftStk.push(addChar);
				break;
				}
			}
		}

		while(!leftStk.isEmpty()) {
			rightStk.push(leftStk.pop());
		}
		while(!rightStk.isEmpty()) {
			bw.write(rightStk.pop());
		}
		
		bw.flush();
		bw.close();
	}

}
