package Mathematics;

import java.util.Scanner;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 8.
 * ���� ���� : �ִ������� �ּҰ����
 * ���� ��ȣ : 2609
 * ���� ��ó : https://www.acmicpc.net/problem/2609
 * 
 * ��       �� : �� ���� �ڿ����� �Է¹޾� �ִ� ������� �ּ� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ��� �� ���� �ڿ����� �־�����. �� ���� 10,000������ �ڿ����̸� ���̿� �� ĭ�� ������ �־�����.
 *
 * ��       �� : ù° �ٿ��� �Է����� �־��� �� ���� �ִ�������, ��° �ٿ��� �Է����� �־��� �� ���� �ּ� ������� ����Ѵ�.
 *
 * 
 **/
public class Main_2609_�ִ��������ּҰ���� {
	//��Ŭ���� ȣ������ �̿��ϴ� ���
	//a�� b�� ���� �������� r�̶�� ������ GCD(a,b) = GCD(b,r)�� ����.
	//r�� 0�̸� �� �� b�� �ִ� ����� �̴�.
	// �ּҰ����(LCM)�� a * b / �ִ�����(GCD) ������ ���� �� �ִ�.
    public static int gcd(int x, int y) {
        if (y == 0) {
            return x;
        } else {
            return gcd(y, x%y);
        }
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();	//�Է� ���� �ڿ��� 1
        int b = sc.nextInt();	//�Է� ���� �ڿ��� 2
        int g = gcd(a, b);		//�ִ����� ���ϱ�
        
        //LCM(�ּҰ����) = a * b / �ִ�����
        int l = a * b / g;		//�ּҰ���� ���ϱ�
        
        System.out.println(g);	//�ִ�����
        System.out.println(l);	//�ּҰ����
    }
}
