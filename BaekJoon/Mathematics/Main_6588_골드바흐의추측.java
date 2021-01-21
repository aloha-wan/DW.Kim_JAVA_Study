package Mathematics;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 21.
 * 문제 제목 : 골드바흐의 추측
 * 문제 번호 : 6588
 * 문제 출처 : https://www.acmicpc.net/problem/6588
 * 
 * 문       제 : 1742년, 독일의 아마추어 수학가 크리스티안 골드바흐는 레온하르트 오일러에게 다음과 같은 추측을 제안하는 편지를 보냈다.
 * 			  -- 4보다 큰 모든 짝수는 두 홀수 소수의 합으로 나타낼 수 있다.
 *         예를 들어 8은 3 + 5로 나타낼 수 있고, 3과 5는 모두 홀수인 소수이다. 또, 20 = 3 + 17 = 7 + 13, 42 = 5 + 37 = 11 + 31 = 13 + 29 = 19 + 23 이다.
 *         이 추측은 아직도 해결되지 않은 문제이다.
 *         백만 이하의 모든 짝수에 대해서, 이 추측을 검증하는 프로그램을 작성하시오.
 *
 * 입       력 : 입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다. 테스트 케이스의 개수는 100,000개를 넘지 않는다.
 *         각 테스트 케이스는 짝수 정수 n 하나로 이루어져 있다. (6 ≤ n ≤ 1000000)
 *         입력의 마지막 줄에는 0이 하나 주어진다.
 *
 * 출       력 : 각 테스트 케이스에 대해서, n = a + b 형태로 출력한다. 이때, a와 b는 홀수 소수이다. 숫자와 연산자는 공백 하나로 구분되어져 있다. 만약, n을 만들 수 있는 방법이 여러 가지라면, b-a가 가장 큰 것을 출력한다. 
 *         또, 두 홀수 소수의 합으로 n을 나타낼 수 없는 경우에는 "Goldbach's conjecture is wrong."을 출력한다.
 *
 * 
 **/
public class Main_6588_골드바흐의추측 {

	public static final int MAX = 1000000;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 에라스토테네스의 체를 사용한다.
		boolean[] check = new boolean[MAX+1];
		ArrayList<Integer> prime = new ArrayList<Integer>();
		
		// 소수가 아니면 true
		check[0] = check[1] = true;
		
		for(int i = 2; i * i <= MAX; i++) {
			// i가 이미 true로 되었다면 확인할 필요없기 때문에 continue
			if(check[i] == true) {
				continue;
			}
			prime.add(i);
			// 제곱이 되는 수는 소수가 아니므로 true로 변경한다.
			for(int j = i * i; j <= MAX; j+=i) {
				check[j] = true;
			}
		}
		
		while(true) {
			int n = sc.nextInt();
			//입력 값 n이 0 이면 종료
			if(n == 0) {
				break;
			}
			for(int i = 1; i < prime.size(); i++) {
				int a = prime.get(i);
				// n = a + b(n-a) 에서 b인 n-a도 소수라면 출력
				if(check[n-a] == false) {
					System.out.println(n + " = " + a + " + " + (n-a));
					break;
				}
			}		
		}
	}
}
