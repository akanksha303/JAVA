import java.util.Arrays;

public class MergeSorted {

    // Swap within the same array
    public void swapArray(int[] arr, int i, int j) {
        if (arr[i] > arr[j]) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    // Swap between two arrays
    public void swap(int[] arr1, int[] arr2, int i, int j) {
        if (arr1[i] > arr2[j]) {
            int temp = arr1[i];
            arr1[i] = arr2[j];
            arr2[j] = temp;
        }
    }

    // Gap Method (O(1) Space)
    public void optimal(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int len = n + m;
        int gap = (len / 2) + (len % 2);

        while (gap > 0) {

            int left = 0;
            int right = left + gap;

            while (right < len) {

                // Both pointers in arr1
                if (left < n && right < n) {
                    swapArray(arr1, left, right);
                }

                // One pointer in arr1, one in arr2
                else if (left < n && right >= n) {
                    swap(arr1, arr2, left, right - n);
                }

                // Both pointers in arr2
                else {
                    swapArray(arr2, left - n, right - n);
                }

                left++;
                right++;
            }

            if (gap == 1) {
                break;
            }

            gap = (gap / 2) + (gap % 2);
        }
    }

    public static void main(String[] args) {

        MergeSorted ob = new MergeSorted();

        int[] arr1 = {2, 3, 4, 9};
        int[] arr2 = {4, 6, 7, 8, 10};

        ob.optimal(arr1, arr2);

        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
