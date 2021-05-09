package Mathematics;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 9.
 * 문제 제목 : 소수 찾기
 * 문제 번호 : 1978
 * 문제 출처 : https://www.acmicpc.net/problem/1978
 *
 * 문    제 : 주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫 줄에 수의 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.
 *
 * 출    력 : 주어진 수들 중 소수의 개수를 출력한다.
 *
 *
 **/
public class Main_1978_소수찾기 {

    /**
     * 참고
     * - 소수 : 약수가 1과 자기 자신 밖에 없는 수
     * - 거듭제곱(pow)
     *      Math.pow([대상숫자], [거듭제곱 횟수])
     * - 제곱근, 루트(sqrt)
     *      Math.sqrt([대상숫자])
     *
     */
    public static boolean is_prime(int x){
        if(x <= 1){
            return false;
        } else if( x == 2){
            return true;
        }

        // 1, 2를 제외한 수가 소수인지 확인
        // N = a * b( 루트 N > a and 루트 N < b)
        // 실수는 사용하지 않는 것이 좋음.
        for(int i = 2; i * i <= x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // 구할 수의 개수를 입력
        int ans = 0;

        while (n-- > 0) {
            //소수인지 판별
            if(is_prime(sc.nextInt())){
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
