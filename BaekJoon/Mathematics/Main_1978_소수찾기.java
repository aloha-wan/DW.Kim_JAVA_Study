package Mathematics;

import java.util.Scanner;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 9.
 * ���� ���� : �Ҽ� ã��
 * ���� ��ȣ : 1978
 * ���� ��ó : https://www.acmicpc.net/problem/1978
 *
 * ��    �� : �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù �ٿ� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
 *
 * ��    �� : �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
 *
 *
 **/
public class Main_1978_�Ҽ�ã�� {

    /**
     * ����
     * - �Ҽ� : ����� 1�� �ڱ� �ڽ� �ۿ� ���� ��
     * - �ŵ�����(pow)
     *      Math.pow([������], [�ŵ����� Ƚ��])
     * - ������, ��Ʈ(sqrt)
     *      Math.sqrt([������])
     *
     */
    public static boolean is_prime(int x){
        if(x <= 1){
            return false;
        } else if( x == 2){
            return true;
        }

        // 1, 2�� ������ ���� �Ҽ����� Ȯ��
        // N = a * b( ��Ʈ N > a and ��Ʈ N < b)
        // �Ǽ��� ������� �ʴ� ���� ����.
        for(int i = 2; i * i <= x; i++){
            if(x % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // ���� ���� ������ �Է�
        int ans = 0;

        while (n-- > 0) {
            //�Ҽ����� �Ǻ�
            if(is_prime(sc.nextInt())){
                ans += 1;
            }
        }

        System.out.println(ans);
    }
}
