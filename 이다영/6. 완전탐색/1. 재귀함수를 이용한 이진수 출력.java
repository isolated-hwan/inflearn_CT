package main.java.org.example.inflearn.sec06;

import java.util.*;

// 재귀함수를 이용한 이진수 출력
public class Inflearn6_1 {

    static Deque<Integer> dq = new ArrayDeque<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toBinary(n);
    }

    public static void toBinary(int n) {
        if (n == 1) {
            dq.addFirst(1);
            while (!dq.isEmpty()) {
                System.out.print(dq.pollFirst());
            }
        } else {
            dq.addFirst(n % 2);
            toBinary(n / 2);
            }
        }
    }

