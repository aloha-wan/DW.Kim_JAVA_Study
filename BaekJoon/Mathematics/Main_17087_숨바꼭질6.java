package Mathematics;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 9.
 * 문제 제목 : 숨바꼭질 6
 * 문제 번호 : 17087
 * 문제 출처 : https://www.acmicpc.net/problem/17087
 *
 * 문    제 : 수빈이는 동생 N명과 숨바꼭질을 하고 있다. 수빈이는 현재 점 S에 있고, 동생은 A1, A2, ..., AN에 있다.
 *           수빈이는 걸어서 이동을 할 수 있다. 수빈이의 위치가 X일때 걷는다면 1초 후에 X+D나 X-D로 이동할 수 있다.
 *           수빈이의 위치가 동생이 있는 위치와 같으면, 동생을 찾았다고 한다.
 *           모든 동생을 찾기위해 D의 값을 정하려고 한다. 가능한 D의 최댓값을 구해보자.
 *
 * 입    력 : 첫째 줄에 N(1 ≤ N ≤ 105)과 S(1 ≤ S ≤ 109)가 주어진다. 둘째 줄에 동생의 위치 Ai(1 ≤ Ai ≤ 109)가 주어진다.
 *           동생의 위치는 모두 다르며, 수빈이의 위치와 같지 않다.
 *
 * 출    력 : 가능한 D값의 최대값을 출력한다.
 *
 *
 **/
public class Main_17087_숨바꼭질6 {

    //최대 공약수
    public static int GCD(int x, int y){
        if(y == 0){
            return x;
        } else {
            return GCD(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // N명의 동생
        int S = sc.nextInt();   // 수빈이의 현재 지점 S
        int[] a = new int[N];   // 동생들의 지점

        for(int i = 0; i < N; i++){
            int x = sc.nextInt();       // 동생 지점 입력
            int diff = Math.abs(x-S);   // 수빈이와 동생 거리에 대한 절대값

            a[i] = diff;
        }

        // 수빈이와 동생을 거리에 대한 최대 공약수를 한명씩 구하면 된다.
        int ans = a[0];
        for(int i = 1; i < N; i++){
            ans = GCD(ans, a[i]);
        }

        System.out.println(ans);

    }
}
