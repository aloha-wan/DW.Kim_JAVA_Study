package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 10. 31.
 * 문제 제목 : 최댓값
 * 문제 번호 : 2562
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 *          예를 들어, 서로 다른 9개의 자연수
 *          3, 29, 38, 12, 57, 74, 40, 85, 61
 *          이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 *
 * 입       력 : 첫 째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다
 *
 * 출       력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.
 *
 * 
 **/
public class Main_2562 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []A = new int [9];
        
        for(int i = 0; i < A.length; i++) {
        	A[i] = sc.nextInt();
        }

        int max = A[0];
        int index = 0;				//변수 선언 한 이유를 수정해야함.
        
        for(int i = 0; i < A.length; i++) {
        	if(A[i] > max) {
        		max = A[i];
        		index = i + 1;
        	} 
        }

        System.out.println(max);
        System.out.println(index);
    }
}