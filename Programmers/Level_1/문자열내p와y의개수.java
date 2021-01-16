package Level_1;


/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 16.
 * ���� ���� : ���ڿ� �� p�� y�� ����
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12916
 * 
 * ��       �� : �빮�ڿ� �ҹ��ڰ� �����ִ� ���ڿ� s�� �־����ϴ�. s�� 'p'�� ������ 'y'�� ������ ���� ������ True, �ٸ��� False�� return �ϴ� solution�� �ϼ��ϼ���. 
 *          'p', 'y' ��� �ϳ��� ���� ���� �׻� True�� �����մϴ�. ��, ������ ���� �� �빮�ڿ� �ҹ��ڴ� �������� �ʽ��ϴ�.
 *          ���� ��� s�� "pPoooyY"�� true�� return�ϰ� "Pyy"��� false�� return�մϴ�.
 *
 * ���� ���� : ���ڿ� s�� ���� : 50 ������ �ڿ���
 *          ���ڿ� s�� ���ĺ����θ� �̷���� �ֽ��ϴ�.
 *
 * ����� �� : s			return
 *         "pPoooyY"	true
 *         "Pyy"		false
 *
 * 
 **/
public class ���ڿ���p��y�ǰ��� {
    boolean solution(String s) {
        boolean answer = true;
        
        int pcount = 0;
        int ycount = 0;
        
        char[] ch = s.toCharArray();

        for(int i = 0; i < s.length(); i++) {
        	if(ch[i] == 80 || ch[i] == 112) {
        		pcount++;
        	} else if(ch[i] == 89 || ch[i] == 121) {
        		ycount++;
        	}
        }
        
        if(pcount == ycount) {
        	answer = true;
        } else {
        	answer = false;
        }
        
        return answer;
    }
    
    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void  main(String[] args){
    	���ڿ���p��y�ǰ��� py = new ���ڿ���p��y�ǰ���();
        System.out.println("pPoooyY�� ��� : " + py.solution("pPoooyY"));
        System.out.println("Pyy�� ��� : " + py.solution("Pyy"));
    }
}
