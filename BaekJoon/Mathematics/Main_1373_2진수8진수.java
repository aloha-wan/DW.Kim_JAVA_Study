package Mathematics;

import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 21.
 * ���� ���� : 2����8����
 * ���� ��ȣ : 1373
 * ���� ��ó : https://www.acmicpc.net/problem/1373
 * 
 * ��       �� : 2������ �־����� ��, 8������ ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� 2������ �־�����. �־����� ���� ���̴� 1,000,000�� ���� �ʴ´�.
 *
 * ��       �� : ù° �ٿ� �־��� ���� 8������ ��ȯ�Ͽ� ����Ѵ�.
 *
 * 
 **/
public class Main_1373_2����8���� {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String n = sc.nextLine();	// 2���� �Է�
		int s = n.length();			// �Է��� ����
		
		// 2�������� 8���� ��ȯ�� 2�������� 3���� ��� ����ؾ��ϴµ� 
		// �������� ���� ���� 1�̳� 10 11�� ��찡 ���� �� �����Ƿ� ����ؼ� ����Ѵ�.
        if (s % 3 == 1) {
            System.out.print(n.charAt(0));
        } else if (s % 3 == 2) {
            System.out.print((n.charAt(0)-'0') * 2 + (n.charAt(1)-'0'));
        }
        
        for (int i = s % 3; i < s; i+=3) {
            System.out.print((n.charAt(i)-'0') * 4 + (n.charAt(i+1)-'0') * 2 + (n.charAt(i+2)-'0'));
        }
        
        System.out.println();
		
	}

}
