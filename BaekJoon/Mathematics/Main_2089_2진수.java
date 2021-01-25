package Mathematics;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 25.
 * ���� ���� : 2����
 * ���� ��ȣ : 2089
 * ���� ��ó : https://www.acmicpc.net/problem/2089
 * 
 * ��       �� : -2������ ��ȣ ���� 2������ ǥ���� �ȴ�. 2���������� 20, 21, 22, 23�� ǥ�� ������ -2���������� (-2)0 = 1, (-2)1 = -2, (-2)2 = 4, (-2)3 = -8�� ǥ���Ѵ�. 
 *         10������ 1���� ǥ�����ڸ� 1, 110, 111, 100, 101, 11010, 11011, 11000, 11001 ���̴�.
 *         10������ ���� �Է� �޾Ƽ� -2������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù �ٿ� 10�������� ǥ���� �� N�� �־�����.
 *
 * ��       �� : -2���� ���� ����Ѵ�.
 *
 * 
 **/
public class Main_2089_2���� {
    
    public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
    	StringBuilder sb = new StringBuilder();
    	
    	int input = sc.nextInt();
    	
    	if(input == 0) {
    		System.out.println(0);
    	} else {
    		while(input != 1) {
    			sb.append(Math.abs(input % -2));
    			input = (int)Math.ceil((double) input / (-2));
    		}
    		
    		sb.append(input);
    		
    		System.out.println(sb.reverse());
    	}
    }
}
