package org.example.inflearn.sec07;

import java.io.*;

// 동전 바꿔주기
public class Inflearn7_4 {
    private static int t;
    private static int k;
    private static int[] p;
    private static int[] n;
    private static int cnt;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        t = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());

        p = new int[k];
        n = new int[k];
        for (int i = 0; i < k; i++) {
            String[] tmp = br.readLine().split(" ");
            p[i] = Integer.parseInt(tmp[0]);
            n[i] = Integer.parseInt(tmp[1]);
        }

        change(0, 0);
        System.out.println(cnt);
    }

    public static void change(int idx, int val) {
        if (idx == k) {
            if (val == t) cnt ++;
        } else {
            for (int i = 0; i <= n[idx]; i++) {
                change(idx + 1, val + (p[idx] * i));
            }
        }
    }
}
