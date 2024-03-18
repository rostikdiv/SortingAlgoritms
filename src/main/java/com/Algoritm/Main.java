package com.Algoritm;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random=new Random();
        SortAlgorithms sortAlgorithms=new SortAlgorithms();
        int[] array=new int[10000];
        int start,end,time;
        for(int i=0;i<array.length;i++){
            array[i]=random.nextInt();
        }

        System.out.println("sorting by Exchange started");
        start = (int) System.currentTimeMillis();
        int[] arr1 = sortAlgorithms.byExchange(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("sorting by Exchange finished for " + time + " ms");

        System.out.println("sorting by Choice started");
        start = (int) System.currentTimeMillis();
        arr1 = sortAlgorithms.byChoice(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("sorting by Choice finished for " + time + " ms");

        System.out.println("sorting by Line Search started");
        start = (int) System.currentTimeMillis();
        arr1 = sortAlgorithms.byLineSearch(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("sorting by Line Search finished for " + time + " ms");

        System.out.println("sorting by Insert Sort started");
        start = (int) System.currentTimeMillis();
        arr1 = sortAlgorithms.byInsertSort(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("sorting by inset Sort finished for " + time + " ms");









    }


}