package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 6.
 * 문제 제목 : 1, 2, 3 더하기
 * 문제 번호 : 9095
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 정수 4를 1, 2, 3의 합으로 나타내는 방법은 총 7가지가 있다. 합을 나타낼 때는 수를 1개 이상 사용해야 한다.
 *           1+1+1+1
 *           1+1+2
 *           1+2+1
 *           2+1+1
 *           2+2
 *           1+3
 *           3+1
 *          정수 n이 주어졌을 때, n을 1, 2, 3의 합으로 나타내는 방법의 수를 구하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 정수 n이 주어진다. n은 양수이며 11보다 작다.
 *
 * 출       력 : 각 테스트 케이스마다, n을 1, 2, 3의 합으로 나타내는 방법의 수를 출력한다.
 *
 * 
 **/
public class Main_9095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int[] d = new int[11];	// n을 1, 2, 3의 합으로 나타내는 방법의 수
		int n = sc.nextInt();	//테스트 케이스의 개수
		
        d[0] = 1;
        
        for (int i = 1; i < 11; i++) {
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
