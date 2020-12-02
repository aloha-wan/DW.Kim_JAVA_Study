package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 25.
 * ���� ���� : �Ҽ� ���ϱ�
 * ���� ��ȣ : 1929
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : M�̻� N������ �Ҽ��� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� �ڿ��� M�� N�� �� ĭ�� ���̿� �ΰ� �־�����. (1 �� M �� N �� 1,000,000) M�̻� N������ �Ҽ��� �ϳ� �̻� �ִ� �Է¸� �־�����.
 *
 * ��       �� : �� �ٿ� �ϳ���, �����ϴ� ������� �Ҽ��� ����Ѵ�.
 *
 * 
 **/
public class Main_1929 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();	//������
        int n = sc.nextInt();	//ū ��
        boolean[] check = new boolean[n+1];
        check[0] = check[1] = true;
        
        for (int i = 2; i * i <= n; i++) {
            if (check[i] == true) {
                continue;
            }
            for (int j = i + i; j <= n; j += i) {
                check[j] = true;
            }
        }
        
        for (int i = m; i <= n; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }
    }
}
