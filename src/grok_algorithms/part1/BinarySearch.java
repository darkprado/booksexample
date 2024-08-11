package grok_algorithms.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author S.Melekhin
 * @since 11 aug 2024 г.
 */
public class BinarySearch {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(binarySearch(list, 1));
    }

    public static int binarySearch(List<Integer> searchList, Integer searchItem) {
        int low = 0, high = searchList.size() - 1, mid, tempItem, countSearch = 1;
        while (low <= high) {
            System.out.printf("Проход #%s%n", countSearch++);
            mid = (low + high) / 2;
            tempItem = searchList.get(mid);
            if (tempItem == searchItem) {
                return mid;
            } else if (tempItem > searchItem) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

}
