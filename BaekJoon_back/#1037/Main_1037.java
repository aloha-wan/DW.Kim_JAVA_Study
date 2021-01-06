package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 6.
 * ���� ���� : ���
 * ���� ��ȣ : 1037
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ��� A�� N�� ��¥ ����� �Ƿ���, N�� A�� ����̰�, A�� 1�� N�� �ƴϾ�� �Ѵ�. � �� N�� ��¥ ����� ��� �־��� ��, N�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� N�� ��¥ ����� ������ �־�����. �� ������ 50���� �۰ų� ���� �ڿ����̴�. ��° �ٿ��� N�� ��¥ ����� �־�����. 
 *          1,000,000���� �۰ų� ����, 2���� ũ�ų� ���� �ڿ����̰�, �ߺ����� �ʴ´�.
 *
 * ��       �� : ù° �ٿ� N�� ����Ѵ�. N�� �׻� 32��Ʈ ��ȣ�ִ� ������ ǥ���� �� �ִ�.
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

