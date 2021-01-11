package Data_Structure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 11.
 * ���� ���� : �ܾ������
 * ���� ��ȣ : 9093
 * ���� ��ó : https://www.acmicpc.net/problem/9093
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
public class Main_9093_�ܾ������ {

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		// �׽�Ʈ ���̽��� ���� T �Է�
		int T = sc.nextInt();
		
		String[] arr = new String[T];
		
		// �׽�Ʈ ���̽� ������ŭ �ܾ� �Է�
		for(int i = 0; i < T; i++) {
			arr[i] = sc.nextLine();
		}
		
		for(int i = 0; i < T; i++) {
			// " "���� ���ڸ� �߶� tmp[]�� �Է��Ѵ�.
			String[] tmp = arr[i].split(" ");
			
			for(int j = 0; j < tmp.length; j++) {
				
				int size = tmp[j].length() - 1;	// �ڸ� ������ ����
				String s2 = "";
				
				// �ڸ� ���ڸ� ����� s2�� �Է�
				while(size >= 0) {
					s2 = s2 + tmp[j].charAt(size--);
				}
				System.out.print(s2 + " ");
			}
			System.out.println();
		}
	}
	
}


/*
 * ���� Ǯ�� ����
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
 */