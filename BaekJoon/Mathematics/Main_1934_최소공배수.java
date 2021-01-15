package Mathematics;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 14.
 * ���� ���� : �ּҰ����
 * ���� ��ȣ : 1934
 * ���� ��ó : https://www.acmicpc.net/problem/1934
 * 
 * ��       �� : �� �ڿ��� A�� B�� ���ؼ�, A�� ����̸鼭 B�� ����� �ڿ����� A�� B�� �������� �Ѵ�. �̷� ����� �߿��� ���� ���� ���� �ּҰ������� �Ѵ�. 
 *          ���� ���, 6�� 15�� ������� 30, 60, 90���� ������, �ּ� ������� 30�̴�.
 *          �� �ڿ��� A�� B�� �־����� ��, A�� B�� �ּҰ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� T(1 �� T �� 1,000)�� �־�����. ��° �ٺ��� T���� �ٿ� ���ļ� A�� B�� �־�����. (1 �� A, B �� 45,000)
 *
 * ��       �� : ù° �ٺ��� T���� �ٿ� A�� B�� �ּҰ������ �Է¹��� ������� �� �ٿ� �ϳ��� ����Ѵ�.
 *
 * 
 **/
public class Main_1934_�ּҰ���� {
	
	// �ִ� ����� ���ϴ� ��
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();		// �׽�Ʈ ���̽� ����
        
        while (t-- > 0) {
            int a = sc.nextInt();	// �ڿ��� a �Է�
            int b = sc.nextInt();	// �ڿ��� b �Է�
            int g = gcd(a, b);		// �ִ����� ���Ѵ�.
            int l = a * b / g;		// �ּҰ���� ���Ѵ�.
            
            System.out.println(l);
        }
    }
}
