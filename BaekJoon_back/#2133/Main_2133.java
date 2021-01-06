package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 4.
 * 문제 제목 : 타일 채우기
 * 문제 번호 : 2133
 * 문제 출처 : https://www.acmicpc.net/problem/2133
 * 
 * 문       제 : 3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.
 *
 * 입       력 : 첫째 줄에 N(1 ≤ N ≤ 30)이 주어진다.
 *
 * 출       력 : 첫째 줄에 경우의 수를 출력한다.
 *
 * 
 **/
public class Main_2133 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] d = new long[n+1];
        
        d[0] = 1;
        
        for (int i = 2; i <= n; i += 2) {
            d[i] = d[i-2]*3;
            for (int j = i-4; j >= 0; j -= 2) {
                d[i] += d[j]*2;
            }
        }
        
        System.out.println(d[n]);
    }
}
