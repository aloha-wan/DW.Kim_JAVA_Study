package Dynamic_Programming;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 7.
 * ���� ���� : 1�� �����
 * ���� ��ȣ : 1463
 * ���� ��ó : https://www.acmicpc.net/problem/1463
 * 
 * ��       �� : ���� X�� ����� �� �ִ� ������ ������ ���� �� ���� �̴�.
 *           1. X�� 3���� ������ ��������, 3���� ������.
 *           2. X�� 2�� ������ ��������, 2�� ������.
 *           3. 1�� ����.
 *          ���� N�� �־����� ��, ���� ���� ���� �� ���� ������ ����ؼ� 1�� ������� �Ѵ�. ������ ����ϴ� Ƚ���� �ּڰ��� ����Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� 1���� ũ�ų� ����, 10^6���� �۰ų� ���� ���� N�� �־�����.
 *
 * ��       �� : ù° �ٿ� ������ �ϴ� Ƚ���� �ּڰ��� ����Ѵ�.
 *
 * 
 **/
public class Main_1463_1�θ���� {

	//Bottom-up ���
	// 1���� ���� X���� �ּڰ�
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    
	    int x = sc.nextInt();	// ���� ���� X
	    int[] d = new int[x+1];
	    
	    d[1] = 0;
	    
	    for (int i = 2; i <= x; i++) {
	        d[i] = d[i-1] + 1;
	        
	        if (i % 2 == 0 && d[i] > d[i/2] + 1) {
	            d[i] = d[i/2] + 1;
	        }
	        if (i % 3 == 0 && d[i] > d[i/3] + 1) {
	            d[i] = d[i/3] + 1;
	        }
	    }
	    
	    System.out.println(d[x]);
	}
}

/*
public class Main_1463_1�θ���� {

	//Top-Down ���
    public static int[] d;
    
    public static int go(int n) {
        if (n == 1) {
            return 0;
        }
        
        if (d[n] > 0) {
            return d[n];	//�޸������̼� : �̹� ���� ���� �ִٸ� �ٽ� ������ �ʰ� ���� �ٷ� �����´�.
        }
        
        d[n] = go(n-1) + 1;
        
        if (n % 2 == 0) {
            int temp = go(n/2)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        
        if (n % 3 == 0) {
            int temp = go(n/3)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        return d[n];
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();	// ���� ���� N
        
        d = new int[n+1];
        System.out.println(go(n));
    }
}
*/
