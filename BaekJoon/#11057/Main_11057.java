package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 21.
 * 문제 제목 : 오르막 수
 * 문제 번호 : 11057
 * 문제 출처 : https://www.acmicpc.net/problem/
 * 
 * 문       제 : 오르막 수는 수의 자리가 오름차순을 이루는 수를 말한다. 이때, 인접한 수가 같아도 오름차순으로 친다.
 *          예를 들어, 2234와 3678, 11119는 오르막 수이지만, 2232, 3676, 91111은 오르막 수가 아니다.
 *          수의 길이 N이 주어졌을 때, 오르막 수의 개수를 구하는 프로그램을 작성하시오. 수는 0으로 시작할 수 있다.
 *
 * 입       력 : 첫째 줄에 N (1 ≤ N ≤ 1,000)이 주어진다.
 *
 * 출       력 : 첫째 줄에 길이가 N인 오르막 수의 개수를 10,007로 나눈 나머지를 출력한다.
 *
 * 
 **/
public class Main_11057 {

    public static long mod = 10007;
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        long[][] d = new long[n+1][10];
        
        for (int i=0; i<=9; i++) {
            d[1][i] = 1;
        }
        
        for (int i=2; i<=n; i++) {
            for (int j=0; j<=9; j++) {
                for (int k = 0; k <= j; k++) {
                    d[i][j] += d[i-1][k];
                    d[i][j] %= mod;
                }
            }
        }
        
        long ans = 0;
        
        for (int i = 0; i < 10; i++) {
            ans += d[n][i];
        }
        
        ans %= mod;
        
        System.out.println(ans);
    }
}