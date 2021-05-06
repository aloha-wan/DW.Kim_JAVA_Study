package Mathematics;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 6.
 * 문제 제목 : 나머지
 * 문제 번호 : 10430
 * 문제 출처 : https://www.acmicpc.net/problem/10430
 *
 * 문    제 : (A+B)%C는 ((A%C) + (B%C))%C 와 같을까?
 *           (A×B)%C는 ((A%C) × (B%C))%C 와 같을까?
 *           세 수 A, B, C가 주어졌을 때, 위의 네 가지 값을 구하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 A, B, C가 순서대로 주어진다. (2 ≤ A, B, C ≤ 10000)
 *
 * 출    력 : 첫째 줄에 (A+B)%C, 둘째 줄에 ((A%C) + (B%C))%C, 셋째 줄에 (A×B)%C, 넷째 줄에 ((A%C) × (B%C))%C를 출력한다.
 *
 *
 **/
public class Main_10430_나머지 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%b * b%c) %c);
    }
}
