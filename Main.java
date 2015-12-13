package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	    List<Integer> sizes = new ArrayList<Integer> (Arrays.asList(200, 2000, 20000, 200000, 2000000, 20000000));
        Random random = new Random();
        check1(sizes, random);
        System.out.println("Without streams");
        check2(sizes, random);
    }

    private static void check1(List<Integer> sizes, Random random) {
        sizes.forEach(size -> {
            long startTime = System.currentTimeMillis();
            Integer[] array = new Integer[size];
            Arrays.fill(array, random.nextInt());
            final int[] count2 = {0};
            Arrays.stream(array).forEach(item -> {
                if(item ==2) count2[0]+=1;
            });
            long endTime = System.currentTimeMillis();
            System.out.println("Array size: "+ size +" time for simple count operation: " + (endTime - startTime) +" in ms");
        });
    }

    private static void check2(List<Integer> sizes, Random random) {
        sizes.forEach(size -> {
            long startTime = System.currentTimeMillis();
            Integer[] array = new Integer[size];
            Arrays.fill(array, random.nextInt());
            int count2 = 0;
            for (int item: array){
                if(item ==2) count2+=1;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Array size: "+ size +" time for simple count operation: " + (endTime - startTime) +" in ms");
        });
    }
}
