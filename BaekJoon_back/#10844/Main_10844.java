package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 10.
 * 문제 제목 : 쉬운 계단 수
 * 문제 번호 : 10844
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 45656이란 수를 보자.
 *          이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
 *          세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
 *          N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
 *
 * 입       력 : 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 *
 * 출       력 : 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
 *
 * 
 **/
public class Main_10844 {

    public static long mod = 1000000000L;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[][] d = new long[n+1][10];
        
        for (int i = 1; i <= 9; i++) {
            d[1][i] = 1;
        }
        
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j <= 9; j++) {
                d[i][j] = 0;
                if (j-1 >= 0) {
                    d[i][j] += d[i-1][j-1];
                }
                if (j+1 <= 9) {
                    d[i][j] += d[i-1][j+1];
                }
                d[i][j] %= mod;
            }
        }
        
        long ans = 0;
        
        for (int i = 0; i <= 9; i++) {
            ans += d[n][i];
        }
        
        ans %= mod;
        System.out.println(ans);
    }
}
