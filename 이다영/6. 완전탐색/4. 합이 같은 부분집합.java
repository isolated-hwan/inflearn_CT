package main.java.org.example.inflearn.sec06;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// 합이 같은 부분집합
public class Inflearn6_4 {
    private static int n;
    private static int[] arr;
    private static int total;
    private static boolean flag = false;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        String[] sData = br.readLine().split(" ");
        arr = new int[n];
        total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(sData[i]);
            total += arr[i];
        }

        dfs(0, 0);
        if (!flag) System.out.println("NO");
    }

    public static void dfs(int idx, int sum) {
        if (flag || sum > total / 2) return;

        if (idx == n) {
            if (sum == total - sum) {
                System.out.println("YES");
                flag = true;
            }
        } else {
            dfs(idx + 1, sum + arr[idx]);
            dfs(idx + 1, sum);
        }
    }
}