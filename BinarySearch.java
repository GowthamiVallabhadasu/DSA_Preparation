import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        // read the scanner class
        Scanner sc = new Scanner(System.in);

        // input the size of array
        int size = sc.nextInt();
        int[] myArray = new int[size];

        // read array elements
        for (int i = 0; i < size; i++) {
            myArray[i] = sc.nextInt();
        }
        // sort the array because binary searching requires a sorted array
        Arrays.sort(myArray);

        // print the sorted array
        System.out.println(Arrays.toString(myArray));

        // input the searched element
        int search = sc.nextInt();

        // Binary search
        System.out.println(BinarySearch(size, myArray, search));
    }

    public static int BinarySearch(int size, int[] myArray, int search) {
        int start = 0, end = size - 1, mid = 0;
        for (; start <= end;) {
            mid = start + end / 2;
            if (search > myArray[mid])
                start = mid + 1;
            else if (search < myArray[mid])
                end = mid - 1;
            if (search == myArray[mid])
                return mid + 1;
        }
        return -1;

    }

}
