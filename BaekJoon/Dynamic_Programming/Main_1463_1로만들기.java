package Dynamic_Programming;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2021. 1. 7.
 * 문제 제목 : 1로 만들기
 * 문제 번호 : 1463
 * 문제 출처 : https://www.acmicpc.net/problem/1463
 * 
 * 문       제 : 정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
 *           1. X가 3으로 나누어 떨어지면, 3으로 나눈다.
 *           2. X가 2로 나누어 떨어지면, 2로 나눈다.
 *           3. 1을 뺀다.
 *          정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.
 *
 * 입       력 : 첫째 줄에 1보다 크거나 같고, 10^6보다 작거나 같은 정수 N이 주어진다.
 *
 * 출       력 : 첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.
 *
 * 
 **/
public class Main_1463_1로만들기 {

	//Bottom-up 방식
	// 1부터 정수 X까지 최솟값
	public static void main(String args[]) {
	    Scanner sc = new Scanner(System.in);
	    
	    int x = sc.nextInt();	// 구할 정수 X
	    int[] d = new int[x+1];
	    
	    d[1] = 0;
	    
	    for (int i = 2; i <= x; i++) {
	        d[i] = d[i-1] + 1;
	        
	        if (i % 2 == 0 && d[i] > d[i/2] + 1) {
	            d[i] = d[i/2] + 1;
	        }
	        if (i % 3 == 0 && d[i] > d[i/3] + 1) {
	            d[i] = d[i/3] + 1;
	        }
	    }
	    
	    System.out.println(d[x]);
	}
}

/*
public class Main_1463_1로만들기 {

	//Top-Down 방식
    public static int[] d;
    
    public static int go(int n) {
        if (n == 1) {
            return 0;
        }
        
        if (d[n] > 0) {
            return d[n];	//메모이제이션 : 이미 구한 값이 있다면 다시 구하지 않고 값을 바로 가져온다.
        }
        
        d[n] = go(n-1) + 1;
        
        if (n % 2 == 0) {
            int temp = go(n/2)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        
        if (n % 3 == 0) {
            int temp = go(n/3)+1;
            if (d[n] > temp) {
                d[n] = temp;
            }
        }
        return d[n];
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();	// 구할 정수 N
        
        d = new int[n+1];
        System.out.println(go(n));
    }
}
*/
