package Level_1;

import java.util.Arrays;
import java.util.Collections;

/**
 * ��  ��  �� : Kim Do Wan
 * ��       �� : 2021. 1. 16.
 * ���� ���� : ���ڿ� ������������ ��ġ�ϱ�
 * ���� ��ó : https://programmers.co.kr/learn/courses/30/lessons/12917
 * 
 * ��       �� : ���ڿ� s�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ����ּ���.
 *          s�� ���� ��ҹ��ڷθ� �����Ǿ� ������, �빮�ڴ� �ҹ��ں��� ���� ������ �����մϴ�.
 *
 * ���� ���� : str�� ���� 1 �̻��� ���ڿ��Դϴ�.
 *
 * ����� �� : s			return
 *         "Zbcdefg"	"gfedcbZ"
 *
 * 
 **/
public class ���ڿ������������ι�ġ�ϱ� {
    public String solution(String s) {
        String answer = "";
        String[] str = s.split("");
        
        Arrays.sort(str, Collections.reverseOrder());
        
        answer = String.join("", str);
        
        return answer;
    }
}
