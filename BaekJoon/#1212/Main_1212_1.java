package DW_Kim_JAVA_Study_BaekJoon;

import java.util.Scanner;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 12. 2.
 * 문제 제목 : 8진수 2진수
 * 문제 번호 : 1212
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 8진수가 주어졌을 때, 2진수로 변환하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 8진수가 주어진다. 주어지는 수의 길이는 333,334을 넘지 않는다.
 *
 * 출       력 : 첫째 줄에 주어진 수를 2진수로 변환하여 출력한다. 수가 0인 경우를 제외하고는 반드시 1로 시작해야 한다.
 *
 * 
 **/
public class Main_1212_1 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        String[] eight = {"000","001","010","011","100","101","110","111"};
        String s = sc.nextLine();
        boolean start = true;
        
        if (s.length() == 1 && s.charAt(0) == '0') {
            System.out.print(0);
        }
        
        for (int i=0; i<s.length(); i++) {
            int n = s.charAt(i) - '0';
            
            if (start == true && n < 4) {
                if (n == 0) {
                    continue;
                } else if (n == 1) {
                    System.out.print("1");
                } else if (n == 2) {
                    System.out.print("10");
                } else if (n == 3) {
                    System.out.print("11");
                }
                start = false;
            } else {
                System.out.print(eight[n]);
                start = false;
            }
        }
        
        System.out.println();
    }
}