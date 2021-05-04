package Materialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * �� �� �� : Kim Do Wan
 * ��    �� : 2021. 5. 4.
 * ���� ���� : ���ĺ�����
 * ���� ��ȣ : 10808
 * ���� ��ó : https://www.acmicpc.net/problem/10808
 *
 * ��    �� : ���ĺ� �ҹ��ڷθ� �̷���� �ܾ� S�� �־�����. �� ���ĺ��� �ܾ �� ���� ���ԵǾ� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��    �� : ù° �ٿ� �ܾ� S�� �־�����. �ܾ��� ���̴� 100�� ���� ������, ���ĺ� �ҹ��ڷθ� �̷���� �ִ�.
 *
 * ��    �� : �ܾ ���ԵǾ� �ִ� a�� ����, b�� ����, ..., z�� ������ �������� �����ؼ� ����Ѵ�.
 *
 *
 **/
public class Main_10808_���ĺ����� {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int []arr = new int[26];
        // a b c d e f g h i j k l m n o p q r s t u v w x y z

        for(int i = 0; i < S.length(); i++){
            int c = S.charAt(i);
            arr[c - 97]++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            if(i != arr.length - 1){
                System.out.println(" ");
            }
        }
    }
}
