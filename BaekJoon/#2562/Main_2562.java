package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 10. 31.
 * ���� ���� : �ִ�
 * ���� ��ȣ : 2562
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : 9���� ���� �ٸ� �ڿ����� �־��� ��, �̵� �� �ִ��� ã�� �� �ִ��� �� ��° �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ���� ���, ���� �ٸ� 9���� �ڿ���
 *          3, 29, 38, 12, 57, 74, 40, 85, 61
 *          �� �־�����, �̵� �� �ִ��� 85�̰�, �� ���� 8��° ���̴�.
 *
 * ��       �� : ù ° �ٺ��� ��ȩ ��° �ٱ��� �� �ٿ� �ϳ��� �ڿ����� �־�����. �־����� �ڿ����� 100 ���� �۴�
 *
 * ��       �� : ù° �ٿ� �ִ��� ����ϰ�, ��° �ٿ� �ִ��� �� ��° �������� ����Ѵ�.
 *
 * 
 **/
public class Main_2562 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []A = new int [9];
        
        for(int i = 0; i < A.length; i++) {
        	A[i] = sc.nextInt();
        }

        int max = A[0];
        int index = 0;				//���� ���� �� ������ �����ؾ���.
        
        for(int i = 0; i < A.length; i++) {
        	if(A[i] > max) {
        		max = A[i];
        		index = i + 1;
        	} 
        }

        System.out.println(max);
        System.out.println(index);
    }
}