package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 6.
 * ���� ���� : 1�� ����� 
 * ���� ��ȣ : 1463
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
 *           1. X�� 3���� ������ ��������, 3���� ������.
 *           2. X�� 2�� ������ ��������, 2�� ������.
 *           3. 1�� ����.
 *          ���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� 1���� ũ�ų� ����, 106���� �۰ų� ���� ���� N�� �־�����.
 *
 * ��       �� : ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
 *
 * 
 **/
public class Main_1463_2 {

	//Bottom-up ���
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] d = new int[n+1];
        
        d[1] = 0;
        
        for (int i=2; i<=n; i++) {
            d[i] = d[i-1] + 1;
            
            if (i%2 == 0 && d[i] > d[i/2] + 1) {
                d[i] = d[i/2] + 1;
            }
            if (i%3 == 0 && d[i] > d[i/3] + 1) {
                d[i] = d[i/3] + 1;
            }
        }
        
        System.out.println(d[n]);
    }
}