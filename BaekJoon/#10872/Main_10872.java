package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 2.
 * ���� ���� : ���丮��
 * ���� ��ȣ : 10872
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 * 
 * ��    �� : ù° �ٿ� ���� N(0 �� N �� 12)�� �־�����.
 * 
 * ��    �� : ù° �ٿ� N!�� ����Ѵ�.
 * 
 * 
 **/
public class Main_10872 {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int N = sc.nextInt();
    	int fact = 1;
    	
    	for(int i = N; i > 0; i--) {
    		fact = fact * i;
    	}
        System.out.println(fact);
    }
}