package main.java.org.example.inflearn.sec07;

import java.util.*;

// 송아지 찾기
public class Inflearn7_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int e = sc.nextInt();
        int[] jump = new int[]{1, -1, 5};

        boolean[] visited = new boolean[10001];
        int[] dis = new int[10001];
        visited[s] = true;
        dis[s] = 0;

        Deque<Integer> dq = new ArrayDeque<>();
        dq.addLast(s);
        while (!dq.isEmpty()) {
            int now = dq.pollFirst();
            if (now == e) {
                break;

            } else {
                for (int i = 0; i < 3; i++) {
                    int next = now + jump[i];
                    if (1 <= next && next <= 10000) {
                        if (!visited[next]) {
                            visited[next] = true;
                            dis[next] = dis[now] + 1;
                            dq.addLast(next);
                        }
                    }
                }
            }
        }

        System.out.println(dis[e]);
    }
}
