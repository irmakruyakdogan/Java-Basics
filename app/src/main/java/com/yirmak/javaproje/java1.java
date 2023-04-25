package com.yirmak.javaproje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class java1 {
    public static void main(String[] args) {
        String[] myStringArray = new String[4];

        myStringArray[0] = "Ilgın";
        myStringArray[1] = "Eda";
        myStringArray[2] = "Elif";
        myStringArray[3] = "Yirmak";
        System.out.println(myStringArray[3]);
        int[] myIntegerArray = new int[4];
        myIntegerArray[0] = 19;
        myIntegerArray[1] = 18;
        myIntegerArray[2] = 18;
        myIntegerArray[3] = 18;
        System.out.println(myIntegerArray[3]);

        int[] myNumberArray = {1, 2, 3, 4};
        System.out.println(myNumberArray[1]);


        ArrayList<String> myMudicians = new ArrayList<>();

        myMudicians.add("Ayıboğan");
        myMudicians.add("Martı");
        myMudicians.add(1, "Babun");
        myMudicians.add("Habeş");

        System.out.println(myMudicians.get(0));
        System.out.println(myMudicians.get(1));
        System.out.println(myMudicians.get(2));
        System.out.println(myMudicians.get(3));

        System.out.println(myMudicians.size());

        HashSet<String> mySet = new HashSet<String>();

        mySet.add("A.");
        mySet.add("A.");
        System.out.println(mySet.size());

        HashMap<String, String> myHashmap = new HashMap<String, String>();

        myHashmap.put("name", "Luna");
        myHashmap.put("agaga", "A...");

        System.out.println(myHashmap.get("name"));
        System.out.println(myHashmap.get("agaga"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();

        mySecondMap.put("run", 100);
        mySecondMap.put("volley", 200);
        System.out.println(mySecondMap.get("run"));


    }



}
