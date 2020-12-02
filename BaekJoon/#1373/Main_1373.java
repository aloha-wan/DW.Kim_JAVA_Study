package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 12. 2.
 * ���� ���� : 2���� 8����
 * ���� ��ȣ : 1373
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : 2������ �־����� ��, 8������ ��ȯ�ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� 2������ �־�����. �־����� ���� ���̴� 1,000,000�� ���� �ʴ´�.
 *
 * ��       �� : ù° �ٿ� �־��� ���� 8������ ��ȯ�Ͽ� ����Ѵ�.
 *
 * 
 **/
public class Main_1373 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String s = sc.nextLine();
        int n = s.length();
        
        if (n%3 == 1) {
            System.out.print(s.charAt(0));
        } else if (n%3 == 2) {
            System.out.print((s.charAt(0)-'0')*2 + (s.charAt(1)-'0'));
        }
        
        for (int i=n%3; i<n; i+=3) {
            System.out.print((s.charAt(i)-'0')*4 + (s.charAt(i+1)-'0')*2 + (s.charAt(i+2)-'0'));
        }
        
        System.out.println();
    }
}