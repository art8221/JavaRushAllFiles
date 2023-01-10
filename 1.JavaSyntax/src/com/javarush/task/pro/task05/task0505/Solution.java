package com.javarush.task.pro.task05.task0505;

import java.util.Scanner;

/*
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int[] array = new int[a];
        for (int i = 0; i < a; i++) {
            array[i] = console.nextInt();
        }
        if (a % 2 == 0) {
            for (int i = a - 1; i >= 0; i--) {
                System.out.println(array[i]);
            }
        } else for (int y = 0; y < a; y++) {
            System.out.println(array[y]);
        }
    }
}
/*
Java Rush решение
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            data[i] = scanner.nextInt();
        }

        if (n % 2 == 0) {
            for (int i = data.length - 1; i >= 0; i--) {
                System.out.println(data[i]);
            }
        } else {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
            }
        }
    }
}

 */