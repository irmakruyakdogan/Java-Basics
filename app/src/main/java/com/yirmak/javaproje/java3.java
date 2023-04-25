package com.yirmak.javaproje;

public class java3 {
    public static void main(String[] args) {
        int[] numbers = {12, 15, 18, 21, 24};
        //System.out.println(x);

        for (int i = 0; i < numbers.length; i++) {

            int x = numbers[i] / 3 * 5;
            System.out.println(x);
        }
        for (int number : numbers) {
            //System.out.println(number / 3 * 5);
        }

        for (int a = 0; a < 10; a++) {
            int b = a * 10;
            //System.out.println(b);
        }

        int j = 0;
        while (j < 10) {
            System.out.println("ANKARA");
            j++;
        }





    }
}
