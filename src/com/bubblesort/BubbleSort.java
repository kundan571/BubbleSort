package com.bubblesort;

public class BubbleSort {
    void bubbleSort(int array[]) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j + 1] and array[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    void printArray(int array[]) {
        for (int k = 0; k < array.length; k++) {
            System.out.print(array[k] + " ");
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSortObj = new BubbleSort();
        int arr[] = {9, 8, 4, 5, 6, 1};
        bubbleSortObj.bubbleSort(arr);
        bubbleSortObj.printArray(arr);
    }
}
