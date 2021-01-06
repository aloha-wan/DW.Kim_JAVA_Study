package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2020. 11. 8.
 * ���� ���� : �Ӹ���Ҽ�
 * ���� ��ȣ : 1259
 * ���� ��ó : https://www.acmicpc.net/
 * 
 * ��       �� : � �ܾ �ڿ������� �о �Ȱ��ٸ� �� �ܾ �Ӹ�����̶�� �Ѵ�. 'radar', 'sees'�� �Ӹ�����̴�.
 *          ���� �Ӹ�������� ����� �� �ִ�. ���� ���ڵ��� �ڿ������� �о ���ٸ� �� ���� �Ӹ���Ҽ���.
 *          121, 12421 ���� �Ӹ���Ҽ���. 123, 1231�� �ڿ������� ������ �ٸ��Ƿ� �Ӹ���Ҽ��� �ƴϴ�. 
 *          ���� 10�� �Ӹ���Ҽ��� �ƴѵ�, �տ� ���ǹ��� 0�� �� �� �ִٸ� 010�� �Ǿ� �Ӹ���Ҽ��� ����� ���� ������, Ư���� �̹� ���������� ���ǹ��� 0�� �տ� �� �� ���ٰ� ����.
 *
 * ��       �� : �Է��� ���� ���� �׽�Ʈ ���̽��� �̷���� ������, �� �ٸ��� 1 �̻� 99999 ������ ������ �־�����. �Է��� ������ �ٿ��� 0�� �־�����, �� ���� ������ ���Ե��� �ʴ´�.
 *
 * ��       �� : �� �ٸ��� �־��� ���� �Ӹ���Ҽ��� 'yes', �ƴϸ� 'no'�� ����Ѵ�.
 *
 * 
 **/
public class Main_1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str;
		StringBuilder sb = new StringBuilder();
		
		while((str = br.readLine()) != null){
			if(str.equals("0")) {
				break;
			}
			
			int len		= str.length();
			int start	= 0;
			int end 	= len - 1;
			
			boolean isPal = true;
			
			//�� Ž�� �ε����� ������ �� ���� ���� Ž��
			
			while(start <= end) {
				if(str.charAt(start) != str.charAt(end)) {
					isPal = false;
					break;
				}
				
				start++;
				end--;
			}
			
			if(isPal) {
				sb.append("yes");
			}else {
				sb.append("no");
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());

	}

}
