package Mathematics;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 6.
 * 문제 제목 : 최소최대
 * 문제 번호 : 10818
 * 문제 출처 : https://www.acmicpc.net/problem/10818
 *
 * 문    제 : N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 정수의 개수 N(1 <= N <= 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 *           모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 *
 * 출    력 : 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
 *
 *
 **/
public class Main_10818_최소최대 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []A = new int[N];

        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

        int min = A[0];
        int max = A[0];

        for(int i = 0; i < A.length; i++){
            if(min > A[i]){
                min = A[i];
            } else if(max < A[i]){
                max = A[i];
            }
        }

        System.out.println(min + " " + + max);
    }
}
