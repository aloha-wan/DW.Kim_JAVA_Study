package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 1.
 * 문제 제목 : 숨바꼭질 6
 * 문제 번호 : 17087
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 수빈이는 동생 N명과 숨바꼭질을 하고 있다. 수빈이는 현재 점 S에 있고, 동생은 A1, A2, ..., AN에 있다.
 *          수빈이는 걸어서 이동을 할 수 있다. 수빈이의 위치가 X일때 걷는다면 1초 후에 X+D나 X-D로 이동할 수 있다. 수빈이의 위치가 동생이 있는 위치와 같으면, 동생을 찾았다고 한다.
 *          모든 동생을 찾기위해 D의 값을 정하려고 한다. 가능한 D의 최댓값을 구해보자.
 *
 * 입       력 : 첫째 줄에 N(1 ≤ N ≤ 105)과 S(1 ≤ S ≤ 109)가 주어진다. 둘째 줄에 동생의 위치 Ai(1 ≤ Ai ≤ 109)가 주어진다. 동생의 위치는 모두 다르며, 수빈이의 위치와 같지 않다.
 *
 * 출       력 : 가능한 D값의 최댓값을 출력한다.
 *
 * 
 **/
public class Main_17087 {
	
    static int gcd(int x, int y) {
        if (y == 0) {
        	return x;
        } else {
        	return gcd(y, x % y);
        }
    }
    
    //수빈이와 각 동생과 거리차이의 최대공약수를 구하여 답을 찾아 낸다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();			// 동생 수
        int s = sc.nextInt();			// 수빈이의 현재 점
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();		// 
            int diff = Math.abs(x-s);
            
            a[i] = diff;
        }
        
        int ans = a[0];
        
        for (int i = 1; i < n; i++) {
            ans = gcd(ans, a[i]);
        }
        
        System.out.println(ans);
    }
}
