package actvities;

import java.util.Arrays;

public class Activity4 {

    static void ascendSort(int[] array) {
        int size = array.length, i;

        for (i = 0; i < size; i++) {
            int key = array[i];
            System.out.println("Key value after entering Loop" +key);
            System.out.println("i value" +i);

            int j = i - 1;
            System.out.println("J value" +j);
            while (j >= 0 && key < array[j]) {
                System.out.println("array[j]" +array[j]);
                array[j + 1] = array[j];
                System.out.println("array[j+1]" +array[j + 1]);
                System.out.println("Before minus value" +j);
                --j;
                System.out.println("After minus value" +j);
            }
            System.out.println("Before putting the key value" +key);
            System.out.println("Before putting the key value" +array[j + 1]);
            array[j + 1] = key;
            System.out.println("After minus value" +key);
            System.out.println("After minus value" +array[j + 1]);
        }
    }

    public static void main(String[] args) {
        int[] arrList = {3, 5, 8, 1, 9, 2};
        ascendSort(arrList);
        System.out.println(Arrays.toString(arrList));
    }

}
