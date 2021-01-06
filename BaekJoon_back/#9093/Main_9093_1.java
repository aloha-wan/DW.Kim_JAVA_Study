package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 17.
 * ���� ���� : �ܾ������
 * ���� ��ȣ : 9093
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ������ �־����� ��, �ܾ ��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��, �ܾ��� ������ �ٲ� �� ����. �ܾ�� ���� ���ĺ����θ� �̷���� �ִ�.
 *
 * ��       �� : ù° �ٿ� �׽�Ʈ ���̽��� ���� T�� �־�����. �� �׽�Ʈ ���̽��� �� �ٷ� �̷���� ������, ������ �ϳ� �־�����. 
 *          �ܾ��� ���̴� �ִ� 20, ������ ���̴� �ִ� 1000�̴�. �ܾ�� �ܾ� ���̿��� ������ �ϳ� �ִ�.
 *
 * ��       �� : �� �׽�Ʈ ���̽��� ���ؼ�, �Է����� �־��� ������ �ܾ ��� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_9093_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int t = Integer.parseInt(bf.readLine());
        
        while (t-- > 0) {
            String str = bf.readLine() + "\n";
            Stack<Character> s = new Stack<>();
            
            for (char ch : str.toCharArray()) {
                if (ch == '\n' || ch == ' ') {
                    while (!s.isEmpty()) {
                        bw.write(s.pop());
                    }
                    bw.write(ch);
                } else {
                    s.push(ch);
                }
            }
        }
        bw.flush();
    }
}
