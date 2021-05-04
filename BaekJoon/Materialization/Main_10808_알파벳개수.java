package Materialization;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 4.
 * 문제 제목 : 알파벳개수
 * 문제 번호 : 10808
 * 문제 출처 : https://www.acmicpc.net/problem/10808
 *
 * 문    제 : 알파벳 소문자로만 이루어진 단어 S가 주어진다. 각 알파벳이 단어에 몇 개가 포함되어 구하는 프로그램을 작성하시오.
 *
 * 입    력 : 첫째 줄에 단어 S가 주어진다. 단어의 길이는 100을 넘지 않으면, 알파벳 소문자로만 이루어져 있다.
 *
 * 출    력 : 단어에 포함되어 있는 a의 개수, b의 개수, ..., z의 개수를 공백으로 구분해서 출력한다.
 *
 *
 **/
public class Main_10808_알파벳개수 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int []arr = new int[26];
        // a b c d e f g h i j k l m n o p q r s t u v w x y z

        for(int i = 0; i < S.length(); i++){
            int c = S.charAt(i);
            arr[c - 97]++;
        }

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
            if(i != arr.length - 1){
                System.out.println(" ");
            }
        }
    }
}
