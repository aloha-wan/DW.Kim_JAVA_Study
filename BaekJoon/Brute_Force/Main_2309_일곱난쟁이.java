package Brute_Force;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 11.
 * 문제 제목 : 일곱난쟁이
 * 문제 번호 : 2309
 * 문제 출처 : https://www.acmicpc.net/problem/2309
 *
 * 문    제 : 왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
 *           아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다.
 *           뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
 *           아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.
 *
 * 입    력 : 아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다.
 *           주어지는 키는 100을 넘지 않는 자연수이며, 아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.
 *
 * 출    력 : 일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다.
 *
 *
 **/
public class Main_2309_일곱난쟁이 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int [9];
        int sum = 0;                // 난쟁이 9명 키의 합

        // 난쟁이 9명의 키 입력
        for(int i = 0; i < 9; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        // 오름차순으로 출력해야하므로 미리 정렬한다.
        Arrays.sort(arr);

        // 키 합이 100인 7명을 제외한 2명을 i, j라 하고 찾는다.
        for(int i = 0; i < 8; i++){
            for(int j = i+1; j < 9; j++){
                // 2명이 arr[i], arr[j]임이 확인이 되면 출력한다.
                if(sum - arr[i] - arr[j] == 100){
                    for(int z = 0; z < 9; z++){
                        if(i == z || j == z){
                            continue;
                        }
                        System.out.println(arr[z]);
                    }
                    // java 프로그램 정상종료 : System.exit(0);
                    // java 프로그램 비정상종료 : System.exit(1);
                    System.exit(0);
                }
            }
        }
    }
}
