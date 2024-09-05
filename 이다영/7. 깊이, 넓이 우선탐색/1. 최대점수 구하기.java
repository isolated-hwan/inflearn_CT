package org.example.inflearn.sec07;

import java.io.*;

// 최대점수 구하기 (DFS)
public class Inflearn7_1 {
    private static int n;
    private static int m;
    private static int[][] arr;
    private static int res;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nm = br.readLine().split(" ");
        n = Integer.parseInt(nm[0]);
        m = Integer.parseInt(nm[1]);

        arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            String[] tmp = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(tmp[0]);
            arr[i][1] = Integer.parseInt(tmp[1]);
        }

        solution(0, 0, 0);
        System.out.println(res);
    }

    public static void solution(int idx, int val, int time) {
        if (time <= m) {
            if (idx == n && val > res) {
                res = val;
            } else {
                for (int i = idx; i < n; i++) {
                    solution(idx + 1 , val + arr[idx][0], time + arr[idx][1]);
                    solution(idx + 1, val, time);
                }
            }
        }
    }
}
