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
public class Main_1463_1 {

	//Top-Down ���
    public static int[] d;
    public static int go(int n) {
        if (n == 1) {
            return 0;
        }
        if (d[n] > 0) {
            return d[n];
        }
        d[n] = go(n-1) + 1;
        if (n%2 == 0) {
            int temp = go(n/2)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        if (n%3 == 0) {
            int temp = go(n/3)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        return d[n];
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        d = new int[n+1];
        System.out.println(go(n));
    }
}
