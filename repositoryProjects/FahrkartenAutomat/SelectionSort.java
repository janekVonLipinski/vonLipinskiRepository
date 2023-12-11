package repositoryProjects.FahrkartenAutomat;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {

        int [] test = {1,6, 8, 3, 2, 7, 4, 199, 643, 774, 16, 18};
        selectionSort(test);
        System.out.println(Arrays.toString(test));
    }

    public static void selectionSort(int[] array) {

        int kleinstesElement = array[0];
        int kleinstesElementIndex = 0;
        int sortierteGrenze = 0;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = sortierteGrenze + 1; i < array.length; i++) {
                if (array[i] < kleinstesElement) {
                    kleinstesElementIndex = i;
                    kleinstesElement = array[i];
                }
            }
            swap(array, kleinstesElementIndex, sortierteGrenze);
            sortierteGrenze++;
            kleinstesElement = array[sortierteGrenze];
            kleinstesElementIndex = sortierteGrenze;
        }
    }

    public static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
