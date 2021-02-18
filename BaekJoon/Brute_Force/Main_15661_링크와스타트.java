package Brute_Force;

import java.util.*;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 2. 17.
 * ���� ���� : ��ũ�ͽ�ŸƮ
 * ���� ��ȣ : 15661
 * ���� ��ó : https://www.acmicpc.net/problem/15661
 * 
 * ��       �� : ������ ��ŸƮ��ũ�� �ٴϴ� ������� �𿩼� �౸�� �غ����� �Ѵ�. �౸�� ���� ���Ŀ� �ϰ� �ǹ� ������ �ƴϴ�. �౸�� �ϱ� ���� ���� ����� �� N���̴�. ���� ��ŸƮ ���� ��ũ ������ ������� ������ �Ѵ�. 
 *         �� ���� �ο����� ���� �ʾƵ� ������, �� �� �̻��̾�� �Ѵ�.
 *         BOJ�� ��ϴ� ȸ�� ��� ������� ��ȣ�� 1���� N������ �����߰�, �Ʒ��� ���� �ɷ�ġ�� �����ߴ�. �ɷ�ġ Sij�� i�� ����� j�� ����� ���� ���� ������ ��, ���� �������� �ɷ�ġ�̴�. 
 *         ���� �ɷ�ġ�� ���� ���� ��� ���� �ɷ�ġ Sij�� ���̴�. Sij�� Sji�� �ٸ� ���� ������, i�� ����� j�� ����� ���� ���� ������ ��, ���� �������� �ɷ�ġ�� Sij�� Sji�̴�.
 *         
 *         N=4�̰�, S�� �Ʒ��� ���� ��츦 ���캸��.
 *               i\j	1	2	3	4
 *               1	 	1	2	3
 *               2	    4	 	5	6
 *               3	    7	1	 	2
 *               4	    3	4	5
 *         ���� ���, 1, 2���� ��ŸƮ ��, 3, 4���� ��ũ ���� ���� ��쿡 �� ���� �ɷ�ġ�� �Ʒ��� ����.
 *           ��ŸƮ ��: S12 + S21 = 1 + 4 = 5
 *           ��ũ ��: S34 + S43 = 2 + 5 = 7
 *         1, 3���� ��ŸƮ ��, 2, 4���� ��ũ ���� ���ϸ�, �� ���� �ɷ�ġ�� �Ʒ��� ����.
 *           ��ŸƮ ��: S13 + S31 = 2 + 7 = 9
 *           ��ũ ��: S24 + S42 = 6 + 4 = 10
 *         �౸�� ����ְ� �ϱ� ���ؼ� ��ŸƮ ���� �ɷ�ġ�� ��ũ ���� �ɷ�ġ�� ���̸� �ּҷ� �Ϸ��� �Ѵ�. 
 *         ���� ������ ���� ��쿡�� 1, 4���� ��ŸƮ ��, 2, 3�� ���� ��ũ ���� ���ϸ� ��ŸƮ ���� �ɷ�ġ�� 6, ��ũ ���� �ɷ�ġ�� 6�� �Ǿ ���̰� 0�� �ǰ� �� ���� �ּ��̴�.
 *
 * ��       �� : ù° �ٿ� N(4 �� N �� 20)�� �־�����. ��° �ٺ��� N���� �ٿ� S�� �־�����. 
 *          �� ���� N���� ���� �̷���� �ְ�, i�� ���� j��° ���� Sij �̴�. Sii�� �׻� 0�̰�, ������ Sij�� 1���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 *
 * ��       �� : ù° �ٿ� ��ŸƮ ���� ��ũ ���� �ɷ�ġ�� ������ �ּڰ��� ����Ѵ�.
 *
 * 
 **/
public class Main_15661_��ũ�ͽ�ŸƮ {

    static int[][] s;
    static int n;
    
    static int go(int index, ArrayList<Integer> first, ArrayList<Integer> second) {
    	// ������ ã�� ��� Ȯ���ϱ�.
        if (index == n) {
        	// ������ �Ѹ� �̻����� Ȯ���Ѵ�.
            if (first.size() == 0) return -1;
            if (second.size() == 0) return -1;
            
            int t1 = 0;
            int t2 = 0;
            
            // first ���� �ɷ�ġ
            for (int i = 0; i < first.size(); i++) {
                for (int j = 0; j < first.size(); j++) {
                    if (i == j) continue;
                    t1 += s[first.get(i)][first.get(j)];
                }
            }
            
            // second ���� �ɷ�ġ
            for (int i = 0; i < second.size(); i++) {
                for (int j = 0; j < second.size(); j++) {
                    if (i == j) continue;
                    t2 += s[second.get(i)][second.get(j)];
                }
            }
            
            // first���� second���� �ɷ�ġ ����
            int diff = Math.abs(t1-t2);
            return diff;
        }
        
        int ans = -1;
        
        // first������ �ּҰ��� ���ϰ� ���ش�.
        first.add(index);
        int t1 = go(index+1, first, second);
        if (ans == -1 || (t1 != -1 && ans > t1)) {
            ans = t1;
        }
        first.remove(first.size()-1);

        // second������ �ּҰ��� ���ϰ� ���ش�.
        second.add(index);
        int t2 = go(index+1, first, second);
        if (ans == -1 || (t2 != -1 && ans > t2)) {
            ans = t2;
        }
        second.remove(second.size()-1);
        return ans;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();	// ���� ��� ��
        s = new int[n][n];	// ���� ���� ������ ���� �ɷ�ġ �迭
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                s[i][j] = sc.nextInt();
            }
        }
        
        ArrayList<Integer> first = new ArrayList<>();
        ArrayList<Integer> second = new ArrayList<>();
        
        System.out.println(go(0, first, second));
    }
}