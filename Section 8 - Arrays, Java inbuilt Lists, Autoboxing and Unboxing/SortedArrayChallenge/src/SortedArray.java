import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] myIntgers = getIntegers(5);
        int[] sorted = sortIntegers(myIntgers);
        printArray(sorted);

    }

    public static int[] getIntegers(int capacity) {
        int[] array = new int[capacity];
        System.out.println("Enter " + capacity + " integers values/\r");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " content " + array[i]);
        }
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedIntegers = Arrays.copyOf(array, array.length);
        boolean flag = true;
        int temp;
        while(flag) {
            flag = false;
            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[i + 1]){
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        return sortedIntegers;
    }


}
