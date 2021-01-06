package DW_Kim_JAVA_Study_BaekJoon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 9.
 * ���� ���� : ����
 * ���� ��ȣ : 10828
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ����� �� �ټ� �����̴�.
 *          push X: ���� X�� ���ÿ� �ִ� �����̴�.
 *          pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *          size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
 *          empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
 *          top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *
 * ��       �� : ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. 
 *          �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 *
 * ��       �� : ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 *
 * 
 **/
public class Main_10828 {

	static int[] stack;
	static int current;
	
	public static void main(String[] args) throws IOException {

		//Stack ��ü ����
		Stack<Integer> s = new Stack<Integer>();
		
		//BufferReader, BufferedWriter ��ü����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//ù���� �ٿ� ����� �� N
		//readLine�� String ���·� �����ϹǷ� �� ��ȯ�� �ʼ�.
		int n = Integer.parseInt(br.readLine());
		
		//����� �� N��ŭ �ݺ�
		for(int i = 0; i < n; i++) {
			//����� push 14 �����̹Ƿ�, " "���� split
			// split(���а�) ���а� �������� �и��Ͽ� ����.
			String[] ord = br.readLine().split(" ");
			
			//����ġ������ ��ɹ� ���� ������ ����
			switch(ord[0]) {
			case "push" :
				//���� ord[1]�� ���ÿ� �ִ� ����
				s.push(Integer.parseInt(ord[1]));
				break;
				
			case "pop" :
				//���ÿ��� ���� ���� �ִ� ������ ���� �� ���� ���
				//��, ������ ����ִ� ��쿡�� -1�� ���
				if(s.empty()) {
					//BuffereaWriter�� write �Լ��� ���๮�� �������� �ʰ� �־� ������ �־��ְų�
					//bw.newLine(); �� �߰��� �ٹٲ� ����� �Ѵ�.
					bw.write("-1" + "\n");
				} else {
					bw.write(s.pop() + "\n");
				}
				break;
				
			case "size" :
				//���ÿ� ����ִ� ������ ���� ���
				bw.write(s.size() + "\n");
				
				break;
			case "empty" :
				//������ ��� ������ 1 ���
				if(s.empty()) {
					bw.write("1" + "\n");
				} else {
					bw.write("0" + "\n");
				}
				break;

			case "top" :
				//������ ���� ���� �ִ� ������ ���
				if(s.empty()){
					bw.write("-1" + "\n");
				} else {
					bw.write(s.peek() + "\n");
				}
				break;
			}
			
		}
		//���ۿ� ���� �ִ� ���ڿ��� ����ؼ� ���۸� ����
		bw.flush();
		//��Ʈ�� �ݾ��ֱ�
		bw.close();
		
	}

}
