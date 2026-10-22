package sorting;

import java.util.Arrays;

public class QuickSort {
    


    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Find the correct position of pivot
            int pivotIndex = partition(arr, low, high);

            // Sort the left part
            quickSort(arr, low, pivotIndex - 1);

            // Sort the right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {

        // Choose the last element as pivot
        int pivot = arr[high];

        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;

                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {

        int[] arr = {10, 7, 8, 9, 1, 5};

        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array: "
                + Arrays.toString(arr));
    }
}

    

