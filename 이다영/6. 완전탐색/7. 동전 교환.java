package main.java.org.example.inflearn.sec06;

import java.io.*;
import java.util.*;

// 동전 교환
public class Inflearn6_7 {
    private static int n;
    private static Integer[] coin;
    private static int m;
    private static int res = Integer.MAX_VALUE;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] sCoin = br.readLine().split(" ");
        coin = new Integer[n];
        m = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            coin[i] = Integer.parseInt(sCoin[i]);
        }

        Arrays.sort(coin, Collections.reverseOrder());
        dfs(0, 0);
        System.out.println(res);
    }

    public static void dfs(int cnt, int val) {
        if (val > m || cnt > res) return;

        if (val == m) {
            res = Math.min(res, cnt);

        } else {
            for (int i = 0; i < n; i++) {
                dfs(cnt + 1, val + coin[i]);
            }
        }
    }
}
