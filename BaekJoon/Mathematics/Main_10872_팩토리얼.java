package Mathematics;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 6.
 * ���� ���� : ���丮��
 * ���� ��ȣ : 10872
 * ���� ��ó : https://www.acmicpc.net/problem/10872
 *
 * ��    �� : 0���� ũ�ų� ���� ���� N�� �־�����. �̶�, N!�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� ���� N(0 <= N <= 12)�� �־�����.
 *
 * ��    �� : ù° �ٿ� N!�� ����Ѵ�.
 *
 *
 **/
public class Main_10872_���丮�� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int fact = 1;

        for(int i = N; i > 0; i--){
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
