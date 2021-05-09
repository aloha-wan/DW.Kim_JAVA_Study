package Mathematics;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 9.
 * ���� ���� : ���ٲ��� 6
 * ���� ��ȣ : 17087
 * ���� ��ó : https://www.acmicpc.net/problem/17087
 *
 * ��    �� : �����̴� ���� N��� ���ٲ����� �ϰ� �ִ�. �����̴� ���� �� S�� �ְ�, ������ A1, A2, ..., AN�� �ִ�.
 *           �����̴� �ɾ �̵��� �� �� �ִ�. �������� ��ġ�� X�϶� �ȴ´ٸ� 1�� �Ŀ� X+D�� X-D�� �̵��� �� �ִ�.
 *           �������� ��ġ�� ������ �ִ� ��ġ�� ������, ������ ã�Ҵٰ� �Ѵ�.
 *           ��� ������ ã������ D�� ���� ���Ϸ��� �Ѵ�. ������ D�� �ִ��� ���غ���.
 *
 * ��    �� : ù° �ٿ� N(1 �� N �� 105)�� S(1 �� S �� 109)�� �־�����. ��° �ٿ� ������ ��ġ Ai(1 �� Ai �� 109)�� �־�����.
 *           ������ ��ġ�� ��� �ٸ���, �������� ��ġ�� ���� �ʴ�.
 *
 * ��    �� : ������ D���� �ִ밪�� ����Ѵ�.
 *
 *
 **/
public class Main_17087_���ٲ���6 {

    //�ִ� �����
    public static int GCD(int x, int y){
        if(y == 0){
            return x;
        } else {
            return GCD(y, x % y);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // N���� ����
        int S = sc.nextInt();   // �������� ���� ���� S
        int[] a = new int[N];   // �������� ����

        for(int i = 0; i < N; i++){
            int x = sc.nextInt();       // ���� ���� �Է�
            int diff = Math.abs(x-S);   // �����̿� ���� �Ÿ��� ���� ���밪

            a[i] = diff;
        }

        // �����̿� ������ �Ÿ��� ���� �ִ� ������� �Ѹ� ���ϸ� �ȴ�.
        int ans = a[0];
        for(int i = 1; i < N; i++){
            ans = GCD(ans, a[i]);
        }

        System.out.println(ans);

    }
}
