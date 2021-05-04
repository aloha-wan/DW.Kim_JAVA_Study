package Materialization;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 5.
 * ���� ���� : ���輺��
 * ���� ��ȣ : 9498
 * ���� ��ó : https://www.acmicpc.net/problem/9498
 *
 * ��    �� : ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 *
 * ��    �� : ���� ������ ����Ѵ�.
 *
 *
 **/
public class Main_9498_���輺�� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grade = sc.nextInt();

        if(90 <= grade && grade <= 100){
            System.out.println("A");
        } else if(80 <= grade && grade < 90){
            System.out.println("B");
        } else if(70 <= grade && grade < 80){
            System.out.println("C");
        } else if(60 <= grade && grade < 70){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
