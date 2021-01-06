package DW_Kim_JAVA_Study_BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * 작  성  자 : Kim Do Wan
 * 일       자 : 2020. 11. 5.
 * 문제 제목 : DFS와 BFS
 * 문제 번호 : 1260
 * 문제 출처 : https://www.acmicpc.net/
 * 
 * 문       제 : 그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
 *         단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.
 * 
 * 입       력 : 첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
 *         어떤 두 정점 사이에 여러 개의 간선이 있을 수 있다. 입력으로 주어지는 간선은 양방향이다.
 * 
 * 출       력 : 첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. V부터 방문된 점을 순서대로 출력하면 된다.
 *
 * 
 **/
public class Main_1260 {

    static int N;
    static int M;
    static int V;
    static int[][] map;
    static boolean[] isVisit;

    public static void DFS(int node) {
        isVisit[node] = true;
        System.out.print(node + " ");

        // 현재 정점에서 방문하지 않은 정점이 있다면 해당 점으로 이동.
        // 재귀
        for (int i = 1; i <= N; i++) {
            if (map[node][i] == 1 && !isVisit[i]) {
                DFS(i);
            }
        }
    }

    public static void BFS(int node) {
        Queue<Integer> queue = new LinkedList<>();
        // 큐에 사작점을 추가.
        queue.add(node);
        isVisit[node] = true;

        while (!queue.isEmpty()) {
            int now = queue.poll();
            
            // 현재 정점과 연결된 정점을 조회해서 큐에 삽입.
            for (int i = 1; i <= N; i++) {
                if (map[now][i] == 1 && !isVisit[i]) {
                    queue.add(i);
                    isVisit[i] = true;
                }
            }

            System.out.print(now + " ");
        }
    }
    
	public static void main(String[] args) throws IOException {
        BufferedReader 	br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        map = new int[N + 1][N + 1];
        isVisit = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int destination = Integer.parseInt(st.nextToken());

            map[start][destination] = 1;
            map[destination][start] = 1;
        }

        DFS(V);
        System.out.println();
        // 방문 여부 초기화
        for (int i = 1; i <= N; i++) {
            isVisit[i] = false;
        }
        BFS(V);
	}
} 
