package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 8.
 * ���� ���� : ���ڼ��ڼ��ڼ��ڼ��ڼ�?
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12922
 * 
 * ��       �� : ���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. ������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
 *
 * ���� ���� : n�� ���� 10,000������ �ڿ����Դϴ�.
 *
 * ����� �� : n	return
 *         3	"���ڼ�"
 *         4	"���ڼ���"
 *
 * 
 **/
public class ���ڼ��ڼ��ڼ��ڼ��ڼ� {
    public String solution(int n) {
        String answer = "";
        
    	if(n % 2 == 1) {
    		for(int i = 0; i < n/2; i++) {
    			answer += "����";
    		}
			answer += "��";
    	}else {
    		for(int i = 0; i < n/2; i++) {
    			answer += "����";
    		}
    	}
        return answer;
    }

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
    	���ڼ��ڼ��ڼ��ڼ��ڼ� wm = new ���ڼ��ڼ��ڼ��ڼ��ڼ�();
        System.out.println("n�� 3�� ��� : " + wm.solution(3));
        System.out.println("n�� 4�� ��� : " + wm.solution(4));
    }
}
