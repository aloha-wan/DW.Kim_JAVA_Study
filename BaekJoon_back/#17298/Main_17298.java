package DW_Kim_JAVA_Study_BaekJoon;

import java.io.*;
import java.util.*;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 16.
 * 문제 제목 : 오큰수
 * 문제 번호 : 17298
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 크기가 N인 수열 A = A1, A2, ..., AN이 있다. 수열의 각 원소 Ai에 대해서 오큰수 NGE(i)를 구하려고 한다. 
 *          Ai의 오큰수는 오른쪽에 있으면서 Ai보다 큰 수 중에서 가장 왼쪽에 있는 수를 의미한다. 그러한 수가 없는 경우에 오큰수는 -1이다.
 *          예를 들어, A = [3, 5, 2, 7]인 경우 NGE(1) = 5, NGE(2) = 7, NGE(3) = 7, NGE(4) = -1이다. 
 *          A = [9, 5, 4, 8]인 경우에는 NGE(1) = -1, NGE(2) = 8, NGE(3) = 8, NGE(4) = -1이다.
 *
 * 입       력 : 첫째 줄에 수열 A의 크기 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째에 수열 A의 원소 A1, A2, ..., AN (1 ≤ Ai ≤ 1,000,000)이 주어진다.
 *
 * 출       력 : 총 N개의 수 NGE(1), NGE(2), ..., NGE(N)을 공백으로 구분해 출력한다.
 *
 * 
 **/
public class Main_17298 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bf.readLine());
        int[] a = new int[n];
        int[] ans = new int[n];
        String[] temp = bf.readLine().split(" ");
        
        for (int i=0; i<n; i++) {
            a[i] = Integer.parseInt(temp[i]);
        }
        
        Stack<Integer> s = new Stack<>();
        s.push(0);
        
        for (int i=1; i<n; i++) {
            if (s.isEmpty()) {
                s.push(i);
            }
            while (!s.isEmpty() && a[s.peek()] < a[i]) {
                ans[s.pop()] = a[i];
            }
            s.push(i);
        }
        
        while (!s.empty()) {
            ans[s.pop()] = -1;
        }
        
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        for (int i=0; i<n; i++) {
            bw.write(ans[i] + " ");
        }
        bw.write("\n");
        bw.flush();
    }
}
