package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 19.
 * ���� ���� : �Ҽ� ã��
 * ���� ��ȣ : 1978
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �־��� �� N�� �߿��� �Ҽ��� �� ������ ã�Ƽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù �ٿ� ���� ���� N�� �־�����. N�� 100�����̴�. �������� N���� ���� �־����µ� ���� 1,000 ������ �ڿ����̴�.
 *
 * ��       �� : �־��� ���� �� �Ҽ��� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_1978 {

    public static boolean is_prime(int x) {
        if (x <= 1) {
            return false;
        } else if (x == 2) {
            return true;
        }
        
        for (int i=2; i*i <= x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ans = 0;
        
        while (n-- > 0) {
            if (is_prime(sc.nextInt())) {
                ans += 1;
            }
        }
        
        System.out.println(ans);
    }
}
