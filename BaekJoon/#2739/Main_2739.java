package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 10. 31.
 * ���� ���� : ������
 * ���� ��ȣ : 2739
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
 *
 * ��       �� : ù° �ٿ� N�� �־�����. N�� 1���� ũ�ų� ����, 9���� �۰ų� ����.
 *
 * ��       �� : ������İ� ���� N*1���� N*9���� ����Ѵ�.
 *
 * 
 **/
public class Main_2739 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        
        for(int i = 1; i < 10; i++) {
	        System.out.println(N + " * " + i + " = " + N*i);
        }
    }
}