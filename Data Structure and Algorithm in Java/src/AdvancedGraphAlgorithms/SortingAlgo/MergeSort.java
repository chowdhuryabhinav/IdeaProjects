package AdvancedGraphAlgorithms.SortingAlgo;

import java.util.Arrays;

public class MergeSort {

    private static int[] merge(int[] first, int[] second) {

        int[] mix = new int[first.length + second.length];

        int i=0;
        int j=0;
        int k=0;

        while (i < first.length && j< second.length) {
            if(first[i] < second[j]) {
                mix[k] = first[i];
                i++;
            } else {
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i< first.length) {
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j< second.length) {
            mix[k] = second[i];
            j++;
            k++;
        }

        return mix;

    }

    private static void mergeWithIndex(int[] arr, int s, int m, int e) {

        int[] mix = new int[e - s];

        int i=s;
        int j=m;
        int k=0;

        while (i < m && j< e) {
            if(arr[i] < arr[j]) {
                mix[k] = arr[i];
                i++;
            } else {
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i< m) {
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j< e) {
            mix[k] = arr[i];
            j++;
            k++;
        }

        for(int l=0;l<mix.length;i++) {
            arr[s + l] = mix[l];
        }
    }

    static int[] mergeSort(int[] arr) {
        if(arr.length == 2) {
             return arr;
        }


        int mid = arr.length / 2;

      int[] left =   mergeSort(Arrays.copyOfRange(arr,0,mid));
      int [] right =   mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

      return merge(left,right);

    }

    static void mergeSortWithIndex(int[] arr, int s, int e) {
        if(e -s == 1) {
            return ;
        }


        int mid = (s + e) / 2;

          mergeSortWithIndex(arr,s,mid);
          mergeSortWithIndex(arr,mid,e);

         mergeWithIndex(arr, s, mid, e);

    }
    public static void main(String[] args) {

    }
}
