package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 20.
 * ���� ���� : ť - ���� ������ ����
 * ���� ��ȣ : 10845
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �����ϴ� ť�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 * 			����� �� ���� �����̴�. 
 * 			push X	: ���� X�� ť�� �ִ� �����̴�. 
 * 			pop		: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�. 
 * 			size	: ť�� ����ִ� ������ ������ ����Ѵ�.
 * 			empty	: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
 * 			front	: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�. 
 * 			back	: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *
 * ��       �� : ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����.
 * 			�־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 *
 * ��       �� : ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 *
 * 
 **/
public class Main_10845_1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] queue = new int[n];
        int begin = 0;
        int end = 0;
        
        while (n-- > 0) {
            String cmd = sc.next();
            
            if (cmd.equals("push")) {
                int num = Integer.parseInt(sc.next());
                queue[end++ ] = num;
            } else if (cmd.equals("front")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[begin]);
                }
            } else if (cmd.equals("size")) {
                System.out.println(end-begin);
            } else if (cmd.equals("empty")) {
                if (begin == end) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[begin]);
                    begin += 1;
                }
            } else if (cmd.equals("back")) {
                if (begin == end) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue[end-1]);
                }
            }
        }
    }
}