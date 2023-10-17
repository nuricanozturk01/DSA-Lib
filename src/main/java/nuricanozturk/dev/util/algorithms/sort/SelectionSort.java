/*----------------------------------------------------------------
	FILE		: SelectionSort.java
	AUTHOR		: Nuri Can OZTURK
	LAST UPDATE	: 23.04.2023
	SelectionSort class is a sorting algorithm that time complexity is O(n^2)
	Copyleft (c) DSA-Lib
	All Rights Free
----------------------------------------------------------------*/
package nuricanozturk.dev.util.algorithms.sort;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

final class SelectionSort {

    private final static double DEFAULT_DELTA = .0012;
    private SelectionSort() {

    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void swap(double[] array, int i, int j) {
        double temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    private static void swap(short[] array, int i, int j) {
        short temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private static void swap(byte[] array, int i, int j) {
        byte temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }


    public static void selectionSort(byte[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            swap(arr, (byte) findMinimum(arr, i), (byte) i);
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            swap(arr, findMinimum(arr, i), i);
    }
    private static int findMinimum(int[] arr, int startIdx) {
        return IntStream.range(startIdx, arr.length)
                .reduce((minIndex, currentIndex) -> arr[currentIndex] < arr[minIndex] ? currentIndex : minIndex)
                .orElse(startIdx);
    }
/* TODO
    public static void selectionSort(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            swap(arr, findMinimum(arr, i), i);
    }
    private static int findMinimum(double[] arr, int startIdx) {
        return IntStream.range(startIdx, arr.length)
                .reduce((minIndex, currentIndex) -> arr[currentIndex] < arr[minIndex] ? currentIndex : minIndex)
                .orElse(startIdx);
    }
*/
    public static void selectionSort(short[] arr) {
        for (int i = 0; i < arr.length - 1; i++)
            swap(arr, (short) findMinimum(arr, i), (short) i);
    }


    private static int findMinimum(byte[] arr, int startIdx) {
        return IntStream.range(startIdx, arr.length)
                .reduce((minIndex, currentIndex) -> arr[currentIndex] < arr[minIndex] ? currentIndex : minIndex)
                .orElse(startIdx);
    }

    private static int findMinimum(short[] arr, int startIdx) {
        return IntStream.range(startIdx, arr.length)
                .reduce((minIndex, currentIndex) -> arr[currentIndex] < arr[minIndex] ? currentIndex : minIndex)
                .orElse(startIdx);
    }
}
