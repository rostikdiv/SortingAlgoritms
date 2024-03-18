package com.Algoritm;


public class SortAlgorithms {

    //сортування обміном
    int[] byExchange(int[] array){
        int[] arr=array.clone();
        boolean needIteration =true;
        while(needIteration){
            needIteration =false;
            for(int i =1;i<arr.length;i++){
                if(arr[i]<arr[i-1]){
                    swap(arr,i,i-1);
                    needIteration=true;
                }
            }
        }
        return arr;
    }
    int[] byExchangeRev(int[] array){
        int[] arr=array.clone();
        boolean needIteration =true;
        while(needIteration){
            needIteration =false;
            for(int i =1;i<arr.length;i++){
                if(arr[i]>arr[i-1]){
                    swap(arr,i,i-1);
                    needIteration=true;
                }
            }
        }
        return arr;
    }
    void swap(int[] array,int ind1, int ind2){
        int tmp=array[ind1];
        array[ind1]=array[ind2];
        array[ind2]=tmp;
    }

    // сортування вибором
    int[] byChoice(int[] array){
        int[] arr=array.clone();
        for(int left=0;left<arr.length;left++){
           int minInd=left;
           for(int i =left;i<arr.length;i++){
               if(arr[i]<arr[minInd]){
                   minInd=i;
               }
           }
           swap(arr,left,minInd);
        }
        return arr;
    }
    int[] byChoiceRev(int[] array){
        int[] arr=array.clone();
        for(int left=0;left<arr.length;left++){
            int maxInd=left;
            for(int i =left;i<arr.length;i++){
                if(arr[i]>arr[maxInd]){
                    maxInd=i;
                }
            }
            swap(arr,left,maxInd);
        }
        return arr;
    }
    // сортування лінійним пошуком
    int[] byLineSearch(int[] array){
        int[] arr=array.clone();
        for(int left=1;left<arr.length;left++){
            int value=arr[left];
            int i = left -1;
            for(;i>=0;i--){
                if(value<arr[i]){
                    arr[i+1]=arr[i];
                } else {
                  break;
                }
            }
            arr[i+1]=value;

        }
        return arr;
    }
    int[] byLineSearchRev(int[] array){
        int[] arr=array.clone();
        for(int left=1;left<arr.length;left++){
            int value=arr[left];
            int i = left -1;
            for(;i>=0;i--){
                if(value>arr[i]){
                    arr[i+1]=arr[i];
                } else {
                    break;
                }
            }
            arr[i+1]=value;

        }
        return arr;
    }
    // сортування бінарним пошуком
    int[] byInsertSort(int[] array) {
        int[] arr=array.clone();
        for (int left = 1; left < arr.length; left++) {
            int key = arr[left];
            if (arr[left - 1] < arr[left]) {
                int leftIndex = 0;
                int rightIndex = left - 1;

                do {
                    int mid = (leftIndex + rightIndex) / 2;
                    if (arr[mid] > key) {
                        leftIndex = mid + 1;
                    } else {
                        rightIndex = mid - 1;
                    }
                } while (leftIndex <= rightIndex);

                for (int j = left - 1; j >= leftIndex; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[leftIndex] = key;
            }
        }
        return arr;
    }
    int[] byInsertSortRev(int[] array) {
        int[] arr=array.clone();
        for (int left = 1; left < arr.length; left++) {
            int key = arr[left];
            if (array[left - 1] > arr[left]) {
                int leftIndex = 0;
                int rightIndex = left - 1;

                do {
                    int mid = (leftIndex + rightIndex) / 2;
                    if (arr[mid] < key) {
                        leftIndex = mid + 1;
                    } else {
                        rightIndex = mid - 1;
                    }
                } while (leftIndex <= rightIndex);

                for (int j = left - 1; j >= leftIndex; j--) {
                    arr[j + 1] = arr[j];
                }
                arr[leftIndex] = key;
            }
        }
        return arr;
    }


}
