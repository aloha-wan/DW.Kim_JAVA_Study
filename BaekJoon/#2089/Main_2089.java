package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 2.
 * ���� ���� : -2����
 * ���� ��ȣ : 2089
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : -2������ ��ȣ ���� 2������ ǥ���� �ȴ�. 2���������� 20, 21, 22, 23�� ǥ�� ������ -2���������� (-2)0 = 1, (-2)1 = -2, (-2)2 = 4, (-2)3 = -8�� ǥ���Ѵ�. 
 *          10������ 1���� ǥ�����ڸ� 1, 110, 111, 100, 101, 11010, 11011, 11000, 11001 ���̴�.
 *          10������ ���� �Է� �޾Ƽ� -2������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù �ٿ� 10�������� ǥ���� �� N(-2,000,000,000��N��2,000,000,000)�� �־�����.
 *
 * ��       �� : -2���� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_2089 {

    public static void go(int n) {
        if (n == 0) {
            return;
        }
        if (n%2 == 0) {
            go(-(n/2));
            System.out.print(0);
        } else {
            if (n > 0) {
                go(-(n/2));
            } else {
                go((-n+1)/2);
            }
            System.out.print(1);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        if (n == 0) {
            System.out.println(0);
        } else {
            go(n);
            System.out.println();
        }
    }
}