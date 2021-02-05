package com.company;

import java.util.Scanner;

public class snto {
    public static void main(String[] args) {
        int numbers, N = 2, count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập n");
        numbers = scanner.nextInt();
        while (N < numbers) {
            boolean flag = true;
            for (int i = 2; i < N; i++) {
                if (N % i == 0) {
                    flag = false;
                    break;
                }flag = true;
            }
            if (flag) {
                System.out.println(N);
            }
            N++;
        }
    }
}

