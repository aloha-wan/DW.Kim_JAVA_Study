package Materialization;

import java.util.Scanner;

/**
 * 작 성 자 : Kim Do Wan
 * 일    자 : 2021. 5. 5.
 * 문제 제목 : 초콜릭식사
 * 문제 번호 : 2885
 * 문제 출처 : https://www.acmicpc.net/problem/2885
 *
 * 문    제 : 학교 근처 편의점에 새 초콜릿이 들어왔다. 이 초콜릿은 막대 모양이고, 각 막대는 정사각형 N개로 이루어져 있다.
 *           초콜릿의 크기(정사각형의 개수)는 항상 2의 제곱 형태이다. 즉, 1, 2, 4, 8, 16, ...개의 정사각형으로 이루어져 있다.
 *           상근이는 점심식사로 초콜릿을 먹는다. 이때, 적어도 K개 정사각형을 먹어야 남은 수업을 졸지 않고 버틸 수 있다.
 *           상근이의 친구 선영이도 초콜릿을 좋아한다. 선영이는 초콜릿은 돈을 주고 사기 아깝다고 생각하기 때문에, 상근이가 주는 초콜릿만 먹는다.
 *           상근이는 막대 초콜릿를 하나 산 다음에, 정확하게 K개 정사각형이 되도록 초콜릿을 쪼갠다. K개는 자신이 먹고 남는 것은 선영이에게 준다.
 *           막대 초콜릿은 나누기 조금 어렵게 되어 있어서, 항상 가운데로만 쪼개진다. 즉, 정사각형이 D개 있는 막대는 D/2개 막대 두 조각으로 쪼개진다.
 *
 *           K개 정사각형을 만들기 위해서, 최소 몇 번 초콜릿을 쪼개야 하는지와 사야하는 가장 작은 초콜릿의 크기를 구하는 프로그램을 작성하시오.
 *           상근이는 초콜릿을 하나만 살 수 있다. 꼭 한 조각이 K개일 필요는 없고, 여러 조각에 있는 정사각형을 합쳤을 때 K개이면 된다.
 *
 * 입    력 : 첫째 줄에 K가 주어진다. (1 ≤ K ≤ 1,000,000)
 *
 * 출    력 : 첫째 줄에는 상근이가 구매해야하는 가장 작은 초콜릿의 크기와 최소 몇 번 쪼개야 하는지를 출력한다.
 *
 *
 **/
public class Main_2885_초콜릿식사 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int size = 1;   // 초콜릿 크기
        int count = 0;  // 자른 횟수
        int size2 = 1;  // 초콜릿 크기 임시저장

        // 최소 초콜릿 필요한 갯수
        while(size < K){
            size *= 2;
            size2 = size;
        }

        while(K > 0){
            if(K >= size2){
                K -= size2;
            } else {
                size2 /= 2;
                count++;
            }
        }

        System.out.println(size + " " + count);
    }
}
