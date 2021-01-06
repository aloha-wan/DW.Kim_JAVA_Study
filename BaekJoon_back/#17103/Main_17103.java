package DW_Kim_JAVA_Study_BaekJoon;

import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 5.
 * ���� ���� : ������ ��Ƽ��
 * ���� ��ȣ : 17103
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �������� ����: 2���� ū ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִ�.
 *          ¦�� N�� �� �Ҽ��� ������ ��Ÿ���� ǥ���� ������ ��Ƽ���̶�� �Ѵ�. ¦�� N�� �־����� ��, ������ ��Ƽ���� ������ ���غ���. �� �Ҽ��� ������ �ٸ� ���� ���� ��Ƽ���̴�.
 *
 * ��       �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� T (1 �� T �� 100)�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� �ְ�, ���� N�� ¦���̰�, 2 < N �� 1,000,000�� �����Ѵ�.
 *
 * ��       �� : ������ �׽�Ʈ ���̽����� ������ ��Ƽ���� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_17103 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        ArrayList<Integer> primes = new ArrayList<>();
	        boolean[] check = new boolean[1000001];
	        
	        for (int i = 2; i <= 1000000; i++) {
	            if (check[i] == false) {
	                primes.add(i);
	                for (int j = i + i; j <= 1000000; j += i) {
	                    check[j] = true;
	                }
	            }
	        }
	        
	        int t = sc.nextInt();
	        
	        while (t-- > 0) {
	            int n = sc.nextInt();
	            int ans = 0;
	            
	            for (int p : primes) {
	                if (n-p >= 2 && p <= n-p) {
	                    if (check[n-p] == false) {
	                        ans += 1;
	                    }
	                } else {
	                    break;
	                }
	            }
	            
	            System.out.println(ans);
	        }
	    }
	}