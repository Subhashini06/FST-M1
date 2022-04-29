
package actvities;

import java.util.Arrays;

public class Activity2
{


    public static void main(String[] args) {
        int [] arrlist = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(arrlist));
        int searchNum = 10;
        int fixedSum = 30;

        System.out.println("Result: " + result(arrlist, searchNum, fixedSum));

    }

    public static boolean result(int[] numbers, int searchNum, int fixedSum) {
        int temp = 0;
        for (int number : numbers) {
            if (number == searchNum) {
                temp += searchNum;
            }
            if (temp > fixedSum) {
                break;
            }
        }
            return temp == fixedSum;
    }
}
