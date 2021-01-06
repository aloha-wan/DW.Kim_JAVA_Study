package DW_Kim_JAVA_Study_BaekJoon;

import java.util.*;

//**���ؿ��� �ð� �ʰ� ����**//
/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 13.
 * ���� ���� : ��
 * ���� ��ȣ : 10866
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �����ϴ� ��(Deque)�� ������ ����, �Է����� �־����� ����� ó���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *          ����� �� ���� �����̴�.
 *          	push_front X : ���� X�� ���� �տ� �ִ´�.
 *          	push_back X  : ���� X�� ���� �ڿ� �ִ´�.
 *          	pop_front	 : ���� ���� �տ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *          	pop_back	 : ���� ���� �ڿ� �ִ� ���� ����, �� ���� ����Ѵ�. ����, ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *              size		 : ���� ����ִ� ������ ������ ����Ѵ�.
 *              empty		 : ���� ��������� 1��, �ƴϸ� 0�� ����Ѵ�.
 *              front		 : ���� ���� �տ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *              back		 : ���� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ���� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
 *          
 * ��       �� : ù° �ٿ� �־����� ����� �� N (1 �� N �� 10,000)�� �־�����. 
 *          ��° �ٺ��� N���� �ٿ��� ����� �ϳ��� �־�����. �־����� ������ 1���� ũ�ų� ����, 100,000���� �۰ų� ����. ������ �������� ���� ����� �־����� ���� ����.
 *
 * ��       �� : ����ؾ��ϴ� ����� �־��� ������, �� �ٿ� �ϳ��� ����Ѵ�.
 *
 * 
 **/
public class Main_10866 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        sc.nextLine();
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        
        for (int k=0; k<n; k++) {
            String line = sc.nextLine();
            String[] s = line.split(" ");
            String cmd = s[0];
            
            if (cmd.equals("push_front")) {
                int num = Integer.parseInt(s[1]);
                queue.offerFirst(num);
            } else if (cmd.equals("push_back")) {
                int num = Integer.parseInt(s[1]);
                queue.offerLast(num);
            }  else if (cmd.equals("front")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peekFirst());
                }
            } else if (cmd.equals("size")) {
                System.out.println(queue.size());
            } else if (cmd.equals("empty")) {
                if (queue.isEmpty()) {
                    System.out.println("1");
                } else {
                    System.out.println("0");
                }
            } else if (cmd.equals("pop_front")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.pollFirst());
                }
            } else if (cmd.equals("pop_back")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.pollLast());
                }
            } else if (cmd.equals("back")) {
                if (queue.isEmpty()) {
                    System.out.println("-1");
                } else {
                    System.out.println(queue.peekLast());
                }
            }
        }
    }
}