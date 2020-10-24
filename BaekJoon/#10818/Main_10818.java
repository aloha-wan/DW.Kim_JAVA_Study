package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * author : Kim Do Wan
 * ��      �� : 2020. 10. 24.
 * ���� ���� : �ּ�, �ִ�
 * ���� ��ȣ : 10818
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��      �� : N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��      �� : ù° �ٿ� ������ ���� N (1 �� N �� 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����. 
 *           ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
 *
 * ��      �� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_10818 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();	//N���� ���� �Է¹޴´�.
        int []A = new int [N];
        
        for(int i = 0; i < A.length; i++) {
        	A[i] = sc.nextInt();
        }

        int max = A[0];			//�ִ� ���� ����.
        int min = A[0];			//�ּڰ� ���� ����.
        
        //�ִ� �ּҸ� ���Ѵ�.
        for(int i = 0; i < A.length; i++) {
        	if(A[i] < min) {
        		min = A[i];
        	} else if(A[i] > max) {
        		max = A[i];
        	}
        }
        
        System.out.print(min + " ");
        System.out.print(max);
    }
}
