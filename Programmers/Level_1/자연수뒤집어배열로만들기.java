package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 21.
 * ���� ���� : �ڿ��� ������ �迭�� �����
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12932
 * 
 * ��       �� : �ڿ��� n�� ������ �� �ڸ� ���ڸ� ���ҷ� ������ �迭 ���·� �������ּ���. ������� n�� 12345�̸� [5,4,3,2,1]�� �����մϴ�.
 *
 * ���� ���� : n�� 10,000,000,000������ �ڿ����Դϴ�.
 *
 * ����� �� : n		return
 *         12345	[5,4,3,2,1]
 *
 * 
 **/
public class �ڿ���������迭�θ���� {
    public int[] solution(long n) {
        int[] answer = {};

        // long ������ n�̹Ƿ� StringBuilder�� Ȱ���Ͽ� ���ڿ��� ����
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        
        answer = new int[sb.toString().length()];
        
        int idx = 0;
        for(int i = sb.toString().length()-1; i >= 0; i--) {
        	answer[idx] = sb.toString().charAt(i) - '0';
        	idx++;
        }
        return answer;
    }
}
