package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 19.
 * 문제 제목 : RGB거리
 * 문제 번호 : 1149
 * 문제 출처 : https://www.acmicpc.net/problem/
 * 
 * 문       제 : RGB거리에는 집이 N개 있다. 거리는 선분으로 나타낼 수 있고, 1번 집부터 N번 집이 순서대로 있다.
 *          집은 빨강, 초록, 파랑 중 하나의 색으로 칠해야 한다. 각각의 집을 빨강, 초록, 파랑으로 칠하는 비용이 주어졌을 때, 아래 규칙을 만족하면서 모든 집을 칠하는 비용의 최솟값을 구해보자.
 *           1.1번 집의 색은 2번 집의 색과 같지 않아야 한다.
 *           2.번 집의 색은 N-1번 집의 색과 같지 않아야 한다.
 *           3.i(2 ≤ i ≤ N-1)번 집의 색은 i-1번, i+1번 집의 색과 같지 않아야 한다.
 *
 * 입       력 : 첫째 줄에 집의 수 N(2 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 각 집을 빨강, 초록, 파랑으로 칠하는 비용이 1번 집부터 한 줄에 하나씩 주어진다.
 *          집을 칠하는 비용은 1,000보다 작거나 같은 자연수이다.
 *
 * 출       력 : 첫째 줄에 모든 집을 칠하는 비용의 최솟값을 출력한다.
 *
 * 
 **/
public class Main_1149 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[][] a = new int[n+1][3];
        int[][] d = new int[n+1][3];
        
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        
        for (int i = 1; i <= n; i++) {
            d[i][0] = Math.min(d[i-1][1], d[i-1][2]) + a[i][0];
            d[i][1] = Math.min(d[i-1][0], d[i-1][2]) + a[i][1];
            d[i][2] = Math.min(d[i-1][0], d[i-1][1]) + a[i][2];
        }
        
        System.out.println(Math.min(Math.min(d[n][0], d[n][1]),d[n][2]));
    }
}
