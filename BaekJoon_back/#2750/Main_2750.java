package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * author : Kim Do Wan
 * 일      자 : 2020. 10. 24.
 * 문제 제목 : 수 정렬하기 
 * 문제 번호 : 2750
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문      제 : N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.
 *
 * 입      력 : 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
 *           이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
 *           
 * 출      력 : 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
 *
 * 
 **/
public class Main_2750 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();	//N개의 수를 입력받는다.
        int []A = new int [N];
        
        for(int i = 0; i < A.length; i++) {
        	A[i] = sc.nextInt();
        }
        
        //오름차순으로 정렬한다.
        int temp = 0;

        for(int i = 0; i < A.length-1; i++) {
	        for(int j = i+1; j < A.length; j++) {
	        	if(A[i] > A[j]) {
	        		temp = A[i];
	        		A[i] = A[j];
	        		A[j] = temp;
	        	}
	        }
        }

        for(int i = 0; i < A.length; i++) {
	        System.out.println(A[i]);
        }
	}
}