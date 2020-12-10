package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 6.
 * ���� ���� : 1, 2, 3 ���ϱ�
 * ���� ��ȣ : 9095
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ���� 4�� 1, 2, 3�� ������ ��Ÿ���� ����� �� 7������ �ִ�. ���� ��Ÿ�� ���� ���� 1�� �̻� ����ؾ� �Ѵ�.
 *           1+1+1+1
 *           1+1+2
 *           1+2+1
 *           2+1+1
 *           2+2
 *           1+3
 *           3+1
 *          ���� n�� �־����� ��, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� n�� �־�����. n�� ����̸� 11���� �۴�.
 *
 * ��       �� : �� �׽�Ʈ ���̽�����, n�� 1, 2, 3�� ������ ��Ÿ���� ����� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] d = new int[11];
		int n = sc.nextInt();	//�׽�Ʈ ���̽��� ����
		
        d[0] = 1;
        
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i-j >= 0) {
                    d[i] += d[i-j];
                }
            }
        }
        
        while (n-- > 0) {
            int t = sc.nextInt();
            System.out.println(d[t]);
        }
	}
}