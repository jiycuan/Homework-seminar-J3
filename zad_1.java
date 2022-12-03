// Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class zad_1 {
    public static void main(String[] args) {

        int[] nums = {15, 12, 2, 4, 788, 73, 8, 21};
        int len = nums.length;
        mergeSort(nums, len);
        String nums_str = Arrays.toString(nums);
        System.out.println(nums_str);
    }

    public static void mergeSort(int[] array, int len) {
        if (len < 2) {
            return;
        }
        int mid = len / 2;
        int[] left = new int[mid];
        int[] right = new int[len - mid];
    
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int i = mid; i < len; i++) {
            right[i - mid] = array[i];
        }
        mergeSort(left, mid);
        mergeSort(right, len - mid);
        merge(array, left, right, mid, len - mid);
    }

    public static void merge(
        int[] array, int[] left_array, int[] right_array, int left, int right) {
 
        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (left_array[i] <= right_array[j]) {
                array[k++] = left_array[i++];
            }
            else {
                array[k++] = right_array[j++];
            }
        }
        while (i < left) {
            array[k++] = left_array[i++];
        }
        while (j < right) {
            array[k++] = right_array[j++];
        }
    }
}

