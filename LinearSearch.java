import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        // user input the size
        int myArray[] = new int[size];

        // read the elements in the array
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }

        // sort the array because whie searching we assume we have sorted array
        Arrays.sort(myArray);

        // print the sorted array
        System.out.println(Arrays.toString(myArray));

        // input the value to be searched
        int search = sc.nextInt();

        // release scanner resource
        sc.close();

        // Linear search
        System.out.println(linearSearch(search, myArray));

    }

    public static int linearSearch(int search, int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == search)
                return i;
        }
        return -1;

    }
}
