package Mathematics;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 6.
 * ���� ���� : ������
 * ���� ��ȣ : 10430
 * ���� ��ó : https://www.acmicpc.net/problem/10430
 *
 * ��    �� : (A+B)%C�� ((A%C) + (B%C))%C �� ������?
 *           (A��B)%C�� ((A%C) �� (B%C))%C �� ������?
 *           �� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� A, B, C�� ������� �־�����. (2 �� A, B, C �� 10000)
 *
 * ��    �� : ù° �ٿ� (A+B)%C, ��° �ٿ� ((A%C) + (B%C))%C, ��° �ٿ� (A��B)%C, ��° �ٿ� ((A%C) �� (B%C))%C�� ����Ѵ�.
 *
 *
 **/
public class Main_10430_������ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println((a+b)%c);
        System.out.println((a%c + b%c)%c);
        System.out.println((a*b)%c);
        System.out.println((a%b * b%c) %c);
    }
}
