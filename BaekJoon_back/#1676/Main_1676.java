package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 27.
 * ���� ���� : ���丮�� 0�� ����
 * ���� ��ȣ : 1676
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : N!���� �ڿ������� ó�� 0�� �ƴ� ���ڰ� ���� ������ 0�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� N�� �־�����. (0 �� N �� 500)
 *
 * ��       �� : ù° �ٿ� ���� 0�� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_1676 {

	// 2���� 5�� ���� ���� ���� ������ 5�� ������ �����ָ� 0�� ������ ���� �� �ִ�.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ans = 0;
        
        for (int i = 5; i <= n; i *= 5) {
            ans += n / i;
        }
        
        System.out.println(ans);
    }
}