package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * author : Kim Do Wan
 * ��      �� : 2020. 10. 24.
 * ���� ���� : A+B - 2
 * ���� ��ȣ : 2558
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��      �� : �� ���� A�� B�� �Է¹��� ����, A+B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��      �� : ù° �ٿ� A, ��° �ٿ� B�� �־�����. (0 < A, B < 10)
 *
 * ��      �� : ù° �ٿ� A+B�� ����Ѵ�.
 *
 * 
 **/
public class Main_2558 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(sum);
	}
}