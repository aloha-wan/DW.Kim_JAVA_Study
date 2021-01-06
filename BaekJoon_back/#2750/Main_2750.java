package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * author : Kim Do Wan
 * ��      �� : 2020. 10. 24.
 * ���� ���� : �� �����ϱ� 
 * ���� ��ȣ : 2750
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��      �� : N���� ���� �־����� ��, �̸� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��      �� : ù° �ٿ� ���� ���� N(1 �� N �� 1,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ���ڰ� �־�����. 
 *           �� ���� ������ 1,000���� �۰ų� ���� �����̴�. ���� �ߺ����� �ʴ´�.
 *           
 * ��      �� : ù° �ٺ��� N���� �ٿ� ������������ ������ ����� �� �ٿ� �ϳ��� ����Ѵ�.
 *
 * 
 **/
public class Main_2750 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();	//N���� ���� �Է¹޴´�.
        int []A = new int [N];
        
        for(int i = 0; i < A.length; i++) {
        	A[i] = sc.nextInt();
        }
        
        //������������ �����Ѵ�.
        int temp = 0;

        for(int i = 0; i < A.length-1; i++) {
	        for(int j = i+1; j < A.length; j++) {
	        	if(A[i] > A[j]) {
	        		temp = A[i];
	        		A[i] = A[j];
	        		A[j] = temp;
	        	}
	        }
        }

        for(int i = 0; i < A.length; i++) {
	        System.out.println(A[i]);
        }
	}
}