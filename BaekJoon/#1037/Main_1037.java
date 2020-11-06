package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 6.
 * 문제 제목 : 약수
 * 문제 번호 : 1037
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 양수 A가 N의 진짜 약수가 되려면, N이 A의 배수이고, A가 1과 N이 아니어야 한다. 어떤 수 N의 진짜 약수가 모두 주어질 때, N을 구하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 N의 진짜 약수의 개수가 주어진다. 이 개수는 50보다 작거나 같은 자연수이다. 둘째 줄에는 N의 진짜 약수가 주어진다. 
 *          1,000,000보다 작거나 같고, 2보다 크거나 같은 자연수이고, 중복되지 않는다.
 *
 * 출       력 : 첫째 줄에 N을 출력한다. N은 항상 32비트 부호있는 정수로 표현할 수 있다.
 *
 * 
 **/
public class Main_1037 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt();
        int[] arr = new int[t];
		
        for(int i = 0; i < t; i++) {
        	arr[i] = sc.nextInt();
        }
		
        Arrays.sort(arr);
        
        if(t == 1)
        	System.out.println(arr[0] * arr[0]);
        else
        	System.out.println(arr[0] * arr[arr.length-1]);
	}
}

