package com.ne.binarysearch;

import java.util.Arrays;

public class BinarySearch {
    public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = new int[]{34, 43, 22, 34, 54, 875, 12, 54, 8765, 321, 5, 432, 434, 435, 665, 7};
        Arrays.sort(array);

        int find = 875;
        int result = rank(find, array);
        if(result < 0)
            System.out.println("there is no in array");
        else
            System.out.println("Key = " + result);
    }

}
