package Quick_Sort_Algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class quickSortAlgo {

    int A[];
    int temp;

    public quickSortAlgo(int a) {
        A = new int[a];
        for (int i = 0; i <= A.length - 1; i++) {
            A[i] = (int) (Math.random() * 100);
        }
    }

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter length of Array : ");
        int a = s.nextInt();
        quickSortAlgo B = new quickSortAlgo(a);
        System.out.println("Before Sorting");
        B.printArray();
        B.sort();
        System.out.println("\nAfter Sorting");
        B.printArray();
    }

    public void printArray() {
        System.out.println(Arrays.toString(A));
    }

    public void sort() {
        int left = 0;
        int right = A.length - 1;
        quickSort(A, left, right);
    }

    public void quickSort(int A[], int left, int right) {
        if (A == null || A.length == 0) {
            return;
        }
        if (left >= right) {
            return;
        }
        int pivot = A[left + (right - left) / 2];
        int i = left, j = right;
        while (i < j) {
            while (A[i] < pivot) {
                i++;
            }
            while (A[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(i++, j--);
            }
        }
        if (left < j) {
            quickSort(A, left, j);
        }
        if (right > i) {
            quickSort(A, i, right);
        }
    }

    public void swap(int x, int y) {
        temp = A[x];
        A[x] = A[y];
        A[y] = temp;
    }
}
