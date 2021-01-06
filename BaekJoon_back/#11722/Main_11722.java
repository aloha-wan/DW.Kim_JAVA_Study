package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 31.
 * 문제 제목 : 가장 긴 감소하는 부분 수열
 * 문제 번호 : 11722
 * 문제 출처 : https://www.acmicpc.net/problem/
 * 
 * 문       제 : 수열 A가 주어졌을 때, 가장 긴 감소하는 부분 수열을 구하는 프로그램을 작성하시오.
 *         예를 들어, 수열 A = {10, 30, 10, 20, 20, 10} 인 경우에 가장 긴 감소하는 부분 수열은 A = {10, 30, 10, 20, 20, 10}  이고, 길이는 3이다.
 *
 * 입       력 : 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000)이 주어진다.
 *         둘째 줄에는 수열 A를 이루고 있는 Ai가 주어진다. (1 ≤ Ai ≤ 1,000)
 *
 * 출       력 : 첫째 줄에 수열 A의 가장 긴 감소하는 부분 수열의 길이를 출력한다.
 *
 * 
 **/
public class Main_11722 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] a = new int[n+1];
        int[] d = new int[n+1];
        
        for (int i=1; i<=n; i++) {
            a[i] = sc.nextInt();
        }
        
        for (int i = 1; i <= n; i++) {
            d[i] = 1;
            for (int j = 1; j <= i; j++) {
                if (a[j] > a[i] && d[i] < d[j]+1) {
                    d[i] = d[j]+1;
                }
            }
        }
        
        int ans = d[1];
        for (int i = 2; i <= n; i++) {
            if (ans < d[i]) {
                ans = d[i];
            }
        }
        
        System.out.println(ans);
    }
}
