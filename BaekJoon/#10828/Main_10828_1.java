package DW_Kim_JAVA_Study_BaekJoon;

import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 17.
 * ���� ���� : ����_�����ҽ�
 * ���� ��ȣ : 10828
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �����ϴ� ������ ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ����� �� �ټ� �����̴�.
 *          push X: ���� X�� ���ÿ� �ִ� �����̴�.
 *          pop: ���ÿ��� ���� ���� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *          size: ���ÿ� ����ִ� ������ ������ ����Ѵ�.
 *          empty: ������ ��������� 1, �ƴϸ� 0�� ����Ѵ�.
 *          top: ������ ���� ���� �ִ� ������ ����Ѵ�. ���� ���ÿ� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *
 * ��       �� : ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. 
 *          �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 *
 * ��       �� : ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 *
 * 
 **/
public class Main_10828_1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] stack = new int[n];
        int size = 0;
        
        while (n-- > 0) {
            String cmd = sc.next();
            if (cmd.equals("push")) {
                int num = Integer.parseInt(sc.next());
                stack[size++] = num;
            } else if (cmd.equals("top")) {
                if (size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size-1]);
                }
            } else if (cmd.equals("size")) {
                System.out.println(size);
            } else if (cmd.equals("empty")) {
                if (size == 0) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop")) {
                if (size == 0) {
                    System.out.println("-1");
                } else {
                    System.out.println(stack[size-1]);
                    size -= 1;
                }
            }
        }
    }
}