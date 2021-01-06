package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 14.
 * ���� ���� : �ܾ� ������2
 * ���� ��ȣ : 17413
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : ���ڿ� S�� �־����� ��, �� ���ڿ����� �ܾ ���������� �Ѵ�.
 *          ����, ���ڿ� S�� �Ʒ��Ͱ� ���� ��Ģ�� ��Ų��.
 *               ���ĺ� �ҹ���('a'-'z'), ����('0'-'9'), ����(' '), Ư�� ����('<', '>')�θ� �̷���� �ִ�.
 *               ���ڿ��� ���۰� ���� ������ �ƴϴ�.
 *               '<'�� '>'�� ���ڿ��� �ִ� ��� �����ư��鼭 �����ϸ�, '<'�� ���� �����Ѵ�. ��, �� ������ ������ ����.
 *               �±״� '<'�� �����ؼ� '>'�� ������ ���̰� 3 �̻��� �κ� ���ڿ��̰�, '<'�� '>' ���̿��� ���ĺ� �ҹ��ڿ� ���鸸 �ִ�. 
 *               �ܾ�� ���ĺ� �ҹ��ڿ� ���ڷ� �̷���� �κ� ���ڿ��̰�, �����ϴ� �� �ܾ�� ���� �ϳ��� �����Ѵ�. �±״� �ܾ �ƴϸ�, �±׿� �ܾ� ���̿��� ������ ����.
 *
 * ��       �� : ù° �ٿ� ���ڿ� S�� �־�����. S�� ���̴� 100,000 �����̴�.
 *
 * ��       �� : ù° �ٿ� ���ڿ� S�� �ܾ ����� ����Ѵ�.
 *
 * 
 **/
public class Main_17413 {

    static void print(BufferedWriter bw, Stack<Character> s) throws IOException {
        while (!s.isEmpty()) {
            bw.write(s.pop());
        }
    }
    
    public static void main(String[] args) throws IOException {
    	
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = bf.readLine();
        boolean tag = false;
        Stack<Character> s = new Stack<>();
        
        for (char ch : str.toCharArray()) {
            if (ch == '<') {
                print(bw, s);
                tag = true;
                bw.write(ch);
            } else if (ch == '>') {
                tag = false;
                bw.write(ch);
            } else if (tag) {
                bw.write(ch);
            } else {
                if (ch == ' ') {
                    print(bw, s);
                    bw.write(ch);
                } else {
                    s.push(ch);
                }
            }
        }
        
        print(bw, s);
        bw.write("\n");
        bw.flush();
    }
}