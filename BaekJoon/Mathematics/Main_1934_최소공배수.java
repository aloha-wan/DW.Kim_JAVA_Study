package Mathematics;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 14.
 * 문제 제목 : 최소공배수
 * 문제 번호 : 1934
 * 문제 출처 : https://www.acmicpc.net/problem/1934
 * 
 * 문       제 : 두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 
 *          예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
 *          두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)
 *
 * 출       력 : 첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다.
 *
 * 
 **/
public class Main_1934_최소공배수 {
	
	// 최대 공약수 구하는 식
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();		// 테스트 케이스 갯수
        
        while (t-- > 0) {
            int a = sc.nextInt();	// 자연수 a 입력
            int b = sc.nextInt();	// 자연수 b 입력
            int g = gcd(a, b);		// 최대공약수 구한다.
            int l = a * b / g;		// 최소공배수 구한다.
            
            System.out.println(l);
        }
    }
}
