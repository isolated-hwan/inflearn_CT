package main.java.org.example.inflearn.sec06;

import java.io.*;

// 바둑이 승차
public class Inflearn6_5 {
    private static int c;
    private static int n;
    private static int[] weight;
    private static int val = 0;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cn = br.readLine().split(" ");
        c = Integer.parseInt(cn[0]);
        n = Integer.parseInt(cn[1]);
        weight = new int[n];
        for (int i = 0; i < n; i++) {
            int w = Integer.parseInt(br.readLine());
            weight[i] = w;
        }

        dfs(0, 0);
        System.out.println(val);
    }

    public static void dfs(int idx, int tot) {
        if(idx == n) {
            if (tot <= c) {
                val = Math.max(val, tot);
            }

        } else {
            dfs(idx + 1, tot + weight[idx]);
            dfs(idx + 1, tot);
        }
    }
}
