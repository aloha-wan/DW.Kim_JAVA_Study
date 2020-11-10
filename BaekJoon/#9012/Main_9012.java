package DW_Kim_JAVA_Study_BaekJoon;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 10.
 * ���� ���� : ��ȣ
 * ���� ��ȣ : 9012
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ��ȣ ���ڿ�(Parenthesis String, PS)�� �� ���� ��ȣ ��ȣ�� ��(�� �� ��)�� ������ �����Ǿ� �ִ� ���ڿ��̴�. 
 *          �� �߿��� ��ȣ�� ����� �ٸ��� ������ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(Valid PS, VPS)�̶�� �θ���. �� ���� ��ȣ ��ȣ�� �� ��( )�� ���ڿ��� �⺻ VPS �̶�� �θ���. 
 *          ���� x �� VPS ��� �̰��� �ϳ��� ��ȣ�� ���� ���ο� ���ڿ� ��(x)���� VPS �� �ȴ�.
 *          �׸��� �� VPS x �� y�� ����(concatenation)��Ų ���ο� ���ڿ� xy�� VPS �� �ȴ�.
 *          ���� ��� ��(())()���� ��((()))�� �� VPS ������ ��(()(��, ��(())()))�� , �׸��� ��(()�� �� ��� VPS �� �ƴ� ���ڿ��̴�. 
 *          �������� �Է����� �־��� ��ȣ ���ڿ��� VPS ���� �ƴ����� �Ǵ��ؼ� �� ����� YES �� NO �� ��Ÿ����� �Ѵ�. 
 *
 * ��       �� : �Է� �����ʹ� ǥ�� �Է��� ����Ѵ�. �Է��� T���� �׽�Ʈ �����ͷ� �־�����. �Է��� ù ��° �ٿ��� �Է� �������� ���� ��Ÿ���� ���� T�� �־�����. 
 *          �� �׽�Ʈ �������� ù° �ٿ��� ��ȣ ���ڿ��� �� �ٿ� �־�����. �ϳ��� ��ȣ ���ڿ��� ���̴� 2 �̻� 50 �����̴�. 
 *
 * ��       �� : ����� ǥ�� ����� ����Ѵ�. ���� �Է� ��ȣ ���ڿ��� �ùٸ� ��ȣ ���ڿ�(VPS)�̸� ��YES��, �ƴϸ� ��NO���� �� �ٿ� �ϳ��� ���ʴ�� ����ؾ� �Ѵ�. 
 *
 * 
 **/
public class Main_9012 {

	static String[] word;
	static Stack<String> stack; //'(' ���彺��
	static boolean check; // VPSȮ��

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		//�׽�Ʈ ������ ������ŭ �ݺ�
		for(int i = 0; i< num; i++) {
			word = sc.next().split("");//�ѱ��ھ� �ڸ���
			stack = new Stack<>();
			check = true;
			
			for(int j = 0; j < word.length; j++) {
				//��ȣ ������ ���� ����
				switch(word[j]) {
				case "(":
					stack.push("(");
					break;
				case ")":
					//������ ����ִٸ� ������ ���� �ʴ� ��.
					if(stack.empty()) {
						check = false;
					}else {
						stack.pop(); //'(' �ϳ�����
					}
					break;
					
				default:
					break;
				}
			}
			
			//'('�� ')'�� ������ ������ Ȯ��
			if(check == true && stack.empty()) {
				System.out.println("YES");
				
			}else {
				System.out.println("NO");
			}
			
		}
	}
}
