package Mathematics;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 7.
 * 문제 제목 : 팩토리얼 0의 개수
 * 문제 번호 : 1676
 * 문제 출처 : https://www.acmicpc.net/problem/1676
 * 
 * 문       제 : N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)
 *
 * 출       력 : 첫째 줄에 구한 0의 개수를 출력한다.
 *
 * 
 **/
public class Main_1676_팩토리얼0의개수 {

	// 10!이 0이 2개인 이유는 10!을 소인수분해 해보면 알 수 있다.
	// 2보다 5가 많을 수는 없기 때문에 5의 개수를 구해주면 0의 개수를 구할 수 있다.
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();	// 0의 개수를 구할 팩토리얼 N 입력
        int ans = 0;			// 0의 개수
        
        //100!의 0의 개수를 찾을때 5가 두 개인 25, 50, 75, 100이 있다.
        //100!의 0의 개수는 24(20+4)개 이다.
        for (int i = 5; i <= n; i *= 5) {
            ans += n / i;
        }
        
        System.out.println(ans);
    }
}
