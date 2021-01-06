package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 9.
 * 문제 제목 : 그룹 단어 체커
 * 문제 번호 : 1316
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다.
 *          예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만
 *          , aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
 *          단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
 *
 * 입       력 : 첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
 *          둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
 *
 * 출       력 : 첫째 줄에 그룹 단어의 개수를 출력한다.
 *
 * 
 **/
public class Main_1316 {
	//한글자씩 배열/리스트에 저장하여 다음글자가 배열/리스트에 포함되어 있는지 확인한다
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int num = Integer.parseInt(br.readLine());
		int chk = num; //단어개수
		
		//단어개수만큼 반복
		for(int i = 0; i < num; i++) {
			String word = br.readLine();
			String []str = word.split("");	//한글자씩 저장
			
			ArrayList<String> words = new ArrayList<String>();	//확인용 리스트
			
			//리스트에 포함이 되어 있지만 마지막으로 추가된 글자가 아니라면 그룹단어가 아님
			for(int j= 0; j < str.length; j++) {
				if(words.contains(str[j])) {
					if(!words.get(words.size()-1).equals(str[j])) {
						chk--;
						break;
					}
				}else {
					words.add(str[j]);
				}
			}
		}
		System.out.print(chk);
	}
}