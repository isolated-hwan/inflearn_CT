package main.java.org.example.inflearn;

import java.util.*;

// K번째 약수
public class Inflearn2_1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        List<Integer> num = new ArrayList<>();
        for (int i = 1; i < Math.sqrt(n+1); i++) {
            if (n % i == 0) {
                num.add(i);
                num.add(n/i);
            }
        }

        if (num.size() > k) {
            System.out.println(num.get(k));
        } else {
            System.out.println(-1);
        }

    }
}
