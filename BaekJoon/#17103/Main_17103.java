package DW_Kim_JAVA_Study_BaekJoon;

import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 5.
 * 문제 제목 : 골드바흐 파티션
 * 문제 번호 : 17103
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 골드바흐의 추측: 2보다 큰 짝수는 두 소수의 합으로 나타낼 수 있다.
 *          짝수 N을 두 소수의 합으로 나타내는 표현을 골드바흐 파티션이라고 한다. 짝수 N이 주어졌을 때, 골드바흐 파티션의 개수를 구해보자. 두 소수의 순서만 다른 것은 같은 파티션이다.
 *
 * 입       력 : 첫째 줄에 테스트 케이스의 개수 T (1 ≤ T ≤ 100)가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 N은 짝수이고, 2 < N ≤ 1,000,000을 만족한다.
 *
 * 출       력 : 각각의 테스트 케이스마다 골드바흐 파티션의 수를 출력한다.
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