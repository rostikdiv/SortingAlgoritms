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

        int[] arr;

        System.out.println("sorting by Exchange started");
        start = (int) System.currentTimeMillis();
        arr = sortAlgorithms.byExchange(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("sorting by Exchange finished for " + time + " ms\n");

        System.out.println("sorting by Choice started");
        start = (int) System.currentTimeMillis();
        arr = sortAlgorithms.byChoice(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("sorting by Choice finished for " + time + " ms\n");

        System.out.println("sorting by Line Search started");
        start = (int) System.currentTimeMillis();
        arr = sortAlgorithms.byLineSearch(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("sorting by Line Search finished for " + time + " ms\n");

        System.out.println("sorting by Insert Sort started");
        start = (int) System.currentTimeMillis();
        arr = sortAlgorithms.byInsertSort(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("sorting by inset Sort finished for " + time + " ms\n");

        System.out.println("reversed sorting by Exchange started");
        start = (int) System.currentTimeMillis();
        arr = sortAlgorithms.byExchangeRev(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("reversed sorting by Exchange finished for " + time + " ms\n");

        System.out.println("reversed sorting by Choice started");
        start = (int) System.currentTimeMillis();
        arr = sortAlgorithms.byChoiceRev(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("reversed sorting by Choice finished for " + time + " ms\n");

        System.out.println("reversed sorting by Line Search started");
        start = (int) System.currentTimeMillis();
        arr = sortAlgorithms.byLineSearchRev(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("reversed sorting by Line Search finished for " + time + " ms\n");

        System.out.println("reversed sorting by Insert Sort started");
        start = (int) System.currentTimeMillis();
        arr = sortAlgorithms.byInsertSortRev(array);
        end = (int) System.currentTimeMillis();
        time = end - start;
        System.out.println("reversed sorting by inset Sort finished for " + time + " ms\n");









    }


}