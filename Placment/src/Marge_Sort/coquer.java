package Marge_Sort;

class MergeSort {

    // Merge two sorted parts
    void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        // copy data
        for (int i = 0; i < n1; i++)
            L[i] = arr[left + i];

        for (int j = 0; j < n2; j++)
            R[j] = arr[mid + 1 + j];

        int i = 0, j = 0, k = left;

        // merge
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // copy remaining
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Divide array
    void sort(int[] arr, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            sort(arr, left, mid);      // left part
            sort(arr, mid + 1, right); // right part

            merge(arr, left, mid, right);
        }
    }

    // Main
    public static void main(String[] args) {
        int[] arr = { 5, 2, 9, 1, 6 };

        MergeSort ms = new MergeSort();
        ms.sort(arr, 0, arr.length - 1);

        // print sorted array
        for (int x : arr)
            System.out.print(x + " ");
    }
}
