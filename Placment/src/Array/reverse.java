package Array;

class Solution {
    static void reverse(int arr[]) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            //swap
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;

            i++;
            j--;

        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
            reverse(arr);

            System.out.println( );

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");

            }
        }

    }
