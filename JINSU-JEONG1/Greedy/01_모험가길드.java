import java.io.*;
import java.util.*;

public class Main {


    public static void main(String[] args) throws Exception {
        Main main = new Main();

        // Test case 1
        int n1 = 5;
        Integer[] fears1 = {2, 3, 1, 2, 2};
        int result1 = main.solution(n1, fears1);
        System.out.println("Test Case 1 - 최대 그룹 수: " + result1); // 예상 출력: 2

    }


    /**
     * 한 마을에 모험가가 N명이 있다. 모험가 길드에서는 n명의 모험가를 대상으로 '공포도'를 측정했는데
     * 공포도가 높은 모험가는 쉽게 공포를 느껴 대처능력이 떨어진다
     * 길드장은 모험가 그룹을 안전하게 구성하고자 공포도가 x인 모험가는 
     * 반드시 x명 이상으로 구성한 그룹에 참여해야 여행을 떠날 수 있도록 규정했다.
     * 동빈이는 최대 몇개의 모험가 그룹을 만들 수 있는지 궁금하다
     * 
     * 모험가 N , 모험가 N명의 공포도가 담긴 배열이 주어졌을때
     * 여행을 떠날 수 있는 그룹 수의 최댓값을 구하는 프로그램을 작성하세요
     * 
     * 단 모든 모험가를 그룹에 넣을 필요는 없다
     */
    public int solution(int n, Integer[] fears) {
        int result = 0;

        // 그룹이 많이 만들어 져야한다.
        // 공포도가 낮은 모험가를 우선적으로 배치해야 한다.

        // 오름차순 정렬
        Arrays.sort(fears);

        int cnt = 0;

        for(int fear : fears) {
            cnt++;
            // 현재 그룹
            if(cnt >= fear) {
                result++;
                cnt = 0;
            }
        }

        return result;
    }
}