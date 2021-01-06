package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 2.
 * ���� ���� : �Ǻ���ġ �� 5
 * ���� ��ȣ : 10870
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
 *        �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�. n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
 *         0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 *         n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 
 * ��    �� : ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 * 
 * ��    �� : ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
 *
 * 
 **/
public class Main_10870 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.print(fibo(N));
	}

    public static int fibo(int num)
    {
        if(num == 0) return 0;
        if(num == 1) return 1;
        return fibo(num-1) + fibo(num-2);
    }
}