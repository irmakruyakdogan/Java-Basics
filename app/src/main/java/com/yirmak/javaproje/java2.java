package com.yirmak.javaproje;

public class java2 {
    public static void main(String[] args){
        int x = 5;
        System.out.println(x);
        x = x + 1;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x ++;
        System.out.println(x);
        x --;
        System.out.println(x);

        int y = 4;
        System.out.println(x>y);
        System.out.println(y>x);

        y = 7;
        System.out.println(x==y);
        System.out.println(x != y);

        x = 30;
        y = 30;
        int z = 5;
        System.out.println(x<y || z<y);

        if (x < y) {
            System.out.println("AFERİN!");
        } else if (y < x) {
            System.out.println("agagaga");
        } else {
            System.out.println("x = y");
        }

        int day = 4;
        String day1 = "";

        /*
        if (day == 1) {
            day1 = "monday";
        } else if (day == 2) {
            day1 = "tuesday";
        } else if (day == 3) {
            day1 = "wednesday";
        } else {
            day1 = "sunday";
        }
        */

        switch (day) {
            case 1:
                day1 = "monday";
                break;
            case 2:
                day1 = "tuesday";
                break;
            case 3:
                day1 = "wednesday";
                break;
            default:
                day1 = "sunday";
                break;
        }

        System.out.println(day1);










    }

}
