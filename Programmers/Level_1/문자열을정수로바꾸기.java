package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 8.
 * ���� ���� : ���ڿ��� ������ �ٲٱ�
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12925
 * 
 * ��       �� : ���ڿ� s�� ���ڷ� ��ȯ�� ����� ��ȯ�ϴ� �Լ�, solution�� �ϼ��ϼ���.
 *
 * ���� ���� : s�� ���̴� 1 �̻� 5�����Դϴ�.
 *          s�� �Ǿտ��� ��ȣ(+, -)�� �� �� �ֽ��ϴ�.
 *          s�� ��ȣ�� ���ڷθ� �̷�����ֽ��ϴ�.
 *          s�� 0���� �������� �ʽ��ϴ�.
 *
 * ����� �� : ������� str�� 1234�̸� 1234�� ��ȯ�ϰ�, -1234�̸� -1234�� ��ȯ�ϸ� �˴ϴ�.
 *          str�� ��ȣ(+,-)�� ���ڷθ� �����Ǿ� �ְ�, �߸��� ���� �ԷµǴ� ���� �����ϴ�.
 *
 * 
 **/
public class ���ڿ��������ιٲٱ� {
    public int solution(String s) {
        int answer = 0;
        
        answer = Integer.valueOf(s);
        return answer;
	}

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
    	String str1 = "1234";
    	String str2 = "-1234";
    	
    	���ڿ��������ιٲٱ� str = new ���ڿ��������ιٲٱ�();
        System.out.println(str.solution(str1));
        System.out.println(str.solution(str2));
    }
}
