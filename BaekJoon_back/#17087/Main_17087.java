package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 1.
 * ���� ���� : ���ٲ��� 6
 * ���� ��ȣ : 17087
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �����̴� ���� N��� ���ٲ����� �ϰ� �ִ�. �����̴� ���� �� S�� �ְ�, ������ A1, A2, ..., AN�� �ִ�.
 *          �����̴� �ɾ �̵��� �� �� �ִ�. �������� ��ġ�� X�϶� �ȴ´ٸ� 1�� �Ŀ� X+D�� X-D�� �̵��� �� �ִ�. �������� ��ġ�� ������ �ִ� ��ġ�� ������, ������ ã�Ҵٰ� �Ѵ�.
 *          ��� ������ ã������ D�� ���� ���Ϸ��� �Ѵ�. ������ D�� �ִ��� ���غ���.
 *
 * ��       �� : ù° �ٿ� N(1 �� N �� 105)�� S(1 �� S �� 109)�� �־�����. ��° �ٿ� ������ ��ġ Ai(1 �� Ai �� 109)�� �־�����. ������ ��ġ�� ��� �ٸ���, �������� ��ġ�� ���� �ʴ�.
 *
 * ��       �� : ������ D���� �ִ��� ����Ѵ�.
 *
 * 
 **/
public class Main_17087 {
	
    static int gcd(int x, int y) {
        if (y == 0) {
        	return x;
        } else {
        	return gcd(y, x % y);
        }
    }
    
    //�����̿� �� ������ �Ÿ������� �ִ������� ���Ͽ� ���� ã�� ����.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();			// ���� ��
        int s = sc.nextInt();			// �������� ���� ��
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();		// 
            int diff = Math.abs(x-s);
            
            a[i] = diff;
        }
        
        int ans = a[0];
        
        for (int i = 1; i < n; i++) {
            ans = gcd(ans, a[i]);
        }
        
        System.out.println(ans);
    }
}
