package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 25.
 * 문제 제목 : 소수 구하기
 * 문제 번호 : 1929
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.
 *
 * 출       력 : 한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 *
 * 
 **/
public class Main_1929 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();	//작은수
        int n = sc.nextInt();	//큰 수
        boolean[] check = new boolean[n+1];
        check[0] = check[1] = true;
        
        for (int i = 2; i * i <= n; i++) {
            if (check[i] == true) {
                continue;
            }
            for (int j = i + i; j <= n; j += i) {
                check[j] = true;
            }
        }
        
        for (int i = m; i <= n; i++) {
            if (check[i] == false) {
                System.out.println(i);
            }
        }
    }
}
