package org.example.inflearn.sec07;

import java.io.*;

// 휴가
public class Inflearn7_2 {
    private static int n;
    private static int[] dt;
    private static int[] dp;
    private static int res = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        dt = new int[n + 1];
        dp = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            String[] tmp = br.readLine().split(" ");
            dt[i] = Integer.parseInt(tmp[0]);
            dp[i] = Integer.parseInt(tmp[1]);
        }

        sol(1, 0);
        System.out.println(res);

    }

    public static void sol(int day, int val) {
        if (day == n + 1) {
            if (val > res) {
                res = val;
            }

        } else {
            if (day + dt[day] <= n + 1) {
                sol(day + dt[day], val + dp[day]);
            }
            sol(day + 1, val);
        }
    }
}
