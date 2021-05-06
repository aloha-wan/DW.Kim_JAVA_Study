package Mathematics;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 6.
 * ���� ���� : �ּ��ִ�
 * ���� ��ȣ : 10818
 * ���� ��ó : https://www.acmicpc.net/problem/10818
 *
 * ��    �� : N���� ������ �־�����. �̶�, �ּڰ��� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� ������ ���� N(1 <= N <= 1,000,000)�� �־�����. ��° �ٿ��� N���� ������ �������� �����ؼ� �־�����.
 *           ��� ������ -1,000,000���� ũ�ų� ����, 1,000,000���� �۰ų� ���� �����̴�.
 *
 * ��    �� : ù° �ٿ� �־��� ���� N���� �ּڰ��� �ִ��� �������� ������ ����Ѵ�.
 *
 *
 **/
public class Main_10818_�ּ��ִ� {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int []A = new int[N];

        for(int i = 0; i < A.length; i++){
            A[i] = sc.nextInt();
        }

        int min = A[0];
        int max = A[0];

        for(int i = 0; i < A.length; i++){
            if(min > A[i]){
                min = A[i];
            } else if(max < A[i]){
                max = A[i];
            }
        }

        System.out.println(min + " " + + max);
    }
}
