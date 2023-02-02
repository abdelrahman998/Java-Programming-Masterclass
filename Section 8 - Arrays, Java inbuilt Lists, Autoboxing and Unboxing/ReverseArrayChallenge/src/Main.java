import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

    }

    private static void reverse (int[] array) {
        System.out.println("Array = " + Arrays.toString(array));

        int maxIndex = array.length - 1;
        int halfLenght = array.length / 2;
        for (int i = 0; i  < halfLenght; i++){
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }

        System.out.println("Reversed array = " + Arrays.toString(array));
    }
}
