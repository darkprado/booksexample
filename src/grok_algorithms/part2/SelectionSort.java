package grok_algorithms.part2;

import java.util.Arrays;

/**
 * @author S.Melekhin
 * @since 19 aug 2024 г.
 */
public class SelectionSort {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sort(new int[]{5, 3, 6, 2, 10})));
    }

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int small = smallIndex(array, i);
            if (small != i) {
                int temp = array[i];
                array[i] = array[small];
                array[small] = temp;
            }
        }
        return array;
    }

    public static int smallIndex(int[] array, int begin) {
        int smallNum = array[begin];
        int smallIndex = begin;
        for (int i = begin; i < array.length; i++) {
            if (array[i] < smallNum) {
                smallNum = array[i];
                smallIndex = i;
            }
        }
        return smallIndex;
    }

}
