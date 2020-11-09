package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 9.
 * ���� ���� : �׷� �ܾ� üĿ
 * ���� ��ȣ : 1316
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : �׷� �ܾ�� �ܾ �����ϴ� ��� ���ڿ� ���ؼ�, �� ���ڰ� �����ؼ� ��Ÿ���� ��츸�� ���Ѵ�.
 *          ���� ���, ccazzzzbb�� c, a, z, b�� ��� �����ؼ� ��Ÿ����, kin�� k, i, n�� �����ؼ� ��Ÿ���� ������ �׷� �ܾ�������
 *          , aabbbccb�� b�� �������� ��Ÿ���� ������ �׷� �ܾ �ƴϴ�.
 *          �ܾ� N���� �Է����� �޾� �׷� �ܾ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� �ܾ��� ���� N�� ���´�. N�� 100���� �۰ų� ���� �ڿ����̴�. 
 *          ��° �ٺ��� N���� �ٿ� �ܾ ���´�. �ܾ�� ���ĺ� �ҹ��ڷθ� �Ǿ��ְ� �ߺ����� ������, ���̴� �ִ� 100�̴�.
 *
 * ��       �� : ù° �ٿ� �׷� �ܾ��� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_1316 {
	//�ѱ��ھ� �迭/����Ʈ�� �����Ͽ� �������ڰ� �迭/����Ʈ�� ���ԵǾ� �ִ��� Ȯ���Ѵ�
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int chk = num; //�ܾ��
		
		//�ܾ����ŭ �ݺ�
		for(int i = 0; i < num; i++) {
			String word = br.readLine();
			String []str = word.split("");	//�ѱ��ھ� ����
			
			ArrayList<String> words = new ArrayList<String>();	//Ȯ�ο� ����Ʈ
			
			//����Ʈ�� ������ �Ǿ� ������ ���������� �߰��� ���ڰ� �ƴ϶�� �׷�ܾ �ƴ�
			for(int j= 0; j < str.length; j++) {
				if(words.contains(str[j])) {
					if(!words.get(words.size()-1).equals(str[j])) {
						chk--;
						break;
					}
				}else {
					words.add(str[j]);
				}
			}
		}
		System.out.print(chk);
	}
}