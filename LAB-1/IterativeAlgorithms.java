import java.util.*;
// Name : Shreekant Sunil Lohagale
// Roll No : MLTB32
public class IterativeAlgorithms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // GCD
        System.out.println("=== GCD Algorithm ===");
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = a, y = b;
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        System.out.println("GCD = " + x);


        //Fibonacci
        System.out.println("\n=== Fibonacci Sequence ===");
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        int f1 = 0, f2 = 1;
        System.out.print("Fibonacci: " + f1 + " " + f2 + " ");

        for (int i = 2; i < n; i++) {
            int next = f1 + f2;
            System.out.print(next + " ");
            f1 = f2;
            f2 = next;
        }


        // Linear Search
        System.out.println("\n\n=== Linear Search ===");
        int[] arr = {5, 3, 8, 4, 2};
        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                index = i;
                break;
            }
        }

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");


        // Binary Search
        System.out.println("\n=== Binary Search ===");
        int[] sortedArr = {2, 4, 6, 8, 10, 12};

        System.out.print("Enter element to search: ");
        int bkey = sc.nextInt();

        int low = 0, high = sortedArr.length - 1;
        int bIndex = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (sortedArr[mid] == bkey) {
                bIndex = mid;
                break;
            } else if (sortedArr[mid] < bkey) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (bIndex != -1)
            System.out.println("Element found at index " + bIndex);
        else
            System.out.println("Element not found");

        sc.close();
    }
}
