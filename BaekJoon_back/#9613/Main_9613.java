package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 30.
 * ���� ���� : GCD ��
 * ���� ��ȣ : 9613
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ���� ���� n���� �־����� ��, ������ ��� ���� GCD�� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� t (1 �� t �� 100)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ִ�.
 *          �� �׽�Ʈ ���̽��� ���� ���� n (1 < n �� 100)�� �־�����, �������� n���� ���� �־�����. �Է����� �־����� ���� 1,000,000�� ���� �ʴ´�.
 *
 * ��       �� : �� �׽�Ʈ ���̽����� ������ ��� ���� GCD�� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_9613 {
	
	//�ִ� �����
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();			// ��� �׽�Ʈ �� �� �� �Է�
        
        while (t-- > 0) {
            int n = sc.nextInt();		// �׽�Ʈ �� ���� ���� �Է�
            int[] a = new int[n];
            
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();	// �׽�Ʈ �� �� �Է�
            }
            
            long ans = 0;
            
            for (int i = 0; i < n-1; i++) {
                for (int j = i+1; j < n; j++) {
                    ans += gcd(a[i], a[j]);
                }
            }
            
            System.out.println(ans);
        }
    }
}