package Data_Structure;

import java.io.*;
import java.util.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 14.
 * ���� ���� : �似Ǫ�� ����
 * ���� ��ȣ : 1158
 * ���� ��ó : https://www.acmicpc.net/problem/1158
 * 
 * ��       �� : �似Ǫ�� ������ ������ ����. 1������ N������ N���� ����� ���� �̷�鼭 �ɾ��ְ�, ���� ���� K(�� N)�� �־�����.
 *          ���� ������� K��° ����� �����Ѵ�. �� ����� ���ŵǸ� ���� ������ �̷���� ���� ���� �� ������ ����� ������. 
 *          �� ������ N���� ����� ��� ���ŵ� ������ ��ӵȴ�. ������ ������� ���ŵǴ� ������ (N, K)-�似Ǫ�� �����̶�� �Ѵ�. 
 *          ���� ��� (7, 3)-�似Ǫ�� ������ <3, 6, 2, 7, 5, 1, 4>�̴�. 
 *          N�� K�� �־����� (N, K)-�似Ǫ�� ������ ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * ��       �� : ù° �ٿ� N�� K�� �� ĭ�� ���̿� �ΰ� ������� �־�����. (1 �� K �� N �� 5,000)
 *
 * ��       �� : ������ ���� �似Ǫ�� ������ ����Ѵ�.
 *
 * 
 **/
public class Main_1158_�似Ǫ������ {

	//StringBuilder�� String�� ���ڿ��� ���Ҷ� ���ο� ��ü�� �����ϴ� ���� �ƴ϶� ������ �����͸� 
	//                          ���ϴ� ����� ����ϱ� ������ �ӵ��� �������������� ���ϰ� ����.
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		
		/* input reader */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// �м��� ���ڿ��� �Է� �޴´�.
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());	// ��� �ο� ��
		int k = Integer.parseInt(st.nextToken());	// ������ k��°
		
		int cursor = k - 1;
		int size = 0;
		
		ArrayList<Integer> list = new ArrayList<>();
		
		// ��� �ο� �� ��ŭ list�� ���� �ֱ�
		for(int ii = 0; ii < n; ii++) {
			list.add(ii + 1);
		}
		
		k = k - 1;
		n = n - 1;
		size = list.size();
		
		for(int ii = 0; ii < n; ii++) {
			if(cursor < size) {
				if(list.isEmpty() == false) {
					sb.append(list.get(cursor) + ", ");
					list.remove(cursor);
				}
			} else {
				cursor = cursor - size;
				while(cursor >= size) {
					cursor = cursor - size;
				}
				if(list.isEmpty() == false) {
					sb.append(list.get(cursor) + ", ");
					list.remove(cursor);
				}
			}
			
			cursor += k;
			size = list.size();
		}
		
		sb.append(list.get(0) + ">");
		
		System.out.println(sb);
		
		br.close();
	}

}
