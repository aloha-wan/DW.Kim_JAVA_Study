package Materialization;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 4.
 * ���� ���� : ����
 * ���� ��ȣ : 10817
 * ���� ��ó : https://www.acmicpc.net/problem/10817
 *
 * ��    �� : �� ���� A, B, C�� �־�����. �̶�, �� ��°�� ū ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� �� ���� A, B, C�� �������� ���еǾ� �־�����. (1 <= A, B, C <= 100)
 *
 * ��    �� : �� ��°�� ū ������ ����Ѵ�.
 *
 *
 **/
public class Main_10817_���� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        // A�� ���� Ŭ ��
        if(B <= A && C <= A){
            if(B <= C){
                System.out.println(C);
            } else if(C <= B){
                System.out.println(B);
            }
        // B�� ���� Ŭ ��
        } else if(A <= B && C <= B){
            if(A <= C){
                System.out.println(C);
            } else if(C <= A){
                System.out.println(A);
            }
        // C�� ���� Ŭ ��
        } else if(A <= C && B <= C){
            if(A <= B) {
                System.out.println(B);
            } else if(B <= A) {
                System.out.println(A);
            }
        }
    }
}
