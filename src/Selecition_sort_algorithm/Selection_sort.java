package Selecition_sort_algorithm;

import java.util.Arrays;

public class Selection_sort {

    int array[] = {14, 33, 27, 10, 35, 19, 42, 44};
    int min;
    int _j; //it will hold index of item to be swapped with index i
    boolean flag = false; // this will indicate whether min value updated or not

    public void sort() {
        for (int i = 0; i < array.length; i++) {
            min = array[i];
            for (int j = i; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    flag = true;
                    _j = j;
                }
            }
            if (flag) {
                swap(i, _j);
                flag = false;
            }
        }
    }

    public void swap(int i, int j) {
        int temp = array[i];
        array[i] = min;
        array[_j] = temp;
    }

    public void display() {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        Selection_sort S = new Selection_sort();
        System.out.println("Before sorting ");
        S.display();
        S.sort();
        System.out.println("After sorting ");
        S.display();
    }
}
