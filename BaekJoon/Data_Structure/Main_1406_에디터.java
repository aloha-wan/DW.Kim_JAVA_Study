package Data_Structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 12.
 * ���� ���� : ������
 * ���� ��ȣ : 1406
 * ���� ��ó : https://www.acmicpc.net/problem/1406
 * 
 * ��       �� : �� �ٷ� �� ������ �����͸� �����Ϸ��� �Ѵ�. �� ������� ���� �ҹ��ڸ��� ����� �� �ִ� �������, �ִ� 600,000���ڱ��� �Է��� �� �ִ�.
 *          �� �����⿡�� 'Ŀ��'��� ���� �ִµ�, Ŀ���� ������ �� ��(ù ��° ������ ����), ������ �� ��(������ ������ ������), �Ǵ� ���� �߰� ������ ��(��� ���ӵ� �� ���� ����)�� ��ġ�� �� �ִ�.
 *          �� ���̰� L�� ���ڿ��� ���� �����⿡ �ԷµǾ� ������, Ŀ���� ��ġ�� �� �ִ� ���� L+1���� ��찡 �ִ�.
 *          
 *          �� �����Ⱑ �����ϴ� ��ɾ�� ������ ����.
 *          L	= Ŀ���� �������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
 *          D	= Ŀ���� ���������� �� ĭ �ű� (Ŀ���� ������ �� ���̸� ���õ�)
 *          B	= Ŀ�� ���ʿ� �ִ� ���ڸ� ������ (Ŀ���� ������ �� ���̸� ���õ�)
 *          	    ������ ���� Ŀ���� �� ĭ �������� �̵��� ��ó�� ��Ÿ������, ������ Ŀ���� �����ʿ� �ִ� ���ڴ� �״����
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
public class Main_1406_������ {

	public static void main(String[] args) throws IOException {
		
		//�̰��� �Ẹ���� ����ϰ� ������ ����ϰ� �����..
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputAlpabet = br.readLine();
		
		//������ Ŀ���� �ű� �� �����Ƿ� ����, ������ ������ ����� Ŀ��ó�� �Ű��ֱ� ���� 2���� ������ ���� ����
		Stack<Character> leftStk = new Stack<Character>();		// Character ����, String ���ڿ�
		Stack<Character> rightStk = new Stack<Character>();
		
		//���� leftStk�� �ܾ �Է¹޴´�.
		for(int i = 0; i < inputAlpabet.length(); i++) {
			leftStk.push(inputAlpabet.charAt(i));
		}
		
		// ����� ��ɾ� ������ �Է�
		int testCase = Integer.valueOf(br.readLine());
		
		for(int i = 0; i < testCase; i++) {
			String testString = br.readLine();	// ��ɾ� �Է�
			char testChar = testString.charAt(0);
			
			//�Է��� ��ɾ� testChar�� ���� �����Ѵ�.
			switch(testChar) {
			case 'L':{
				// leftStk�� �����Ͱ� ������ �����ͼ� rightStk�� �ִ´�.
				if(!leftStk.isEmpty()) {
					rightStk.push(leftStk.pop());
				}
				break;
			}
			case 'D':{
				// rightStk�� �����Ͱ� ������ �����ͼ� leftStk�� �ִ´�.
				if(!rightStk.isEmpty()) {
					leftStk.push(rightStk.pop());
				}
				break;
			}
			case 'B':{
				// leftStk�� �����Ͱ� ������ �ϳ��� ����.
				if(!leftStk.isEmpty()) {
					leftStk.pop();
				}
				break;
			}
			case 'P':{
				// ��ɾ� P�� �Է��� ���ڸ� �������� ���� testString�� �����´�.
				char addChar = testString.charAt(2);
				leftStk.push(addChar);
				break;
				}
			}
			
			// ����� ������� �ϱ� ���� leftStk�� �Էµ� �ܾ ��� rightStk���� �ű��.
			while(!leftStk.isEmpty()) {
				rightStk.push(leftStk.pop());
			}
			// rightStk�� ����Ѵ�.
			while(!rightStk.isEmpty()) {
				bw.write(rightStk.pop());
			}
			
			bw.flush();
			bw.close();
		}
		
	}

}
