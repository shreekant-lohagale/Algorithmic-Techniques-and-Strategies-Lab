import java.util.*;

public class SortingLab2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Sorting Algorithms Menu ===");
        System.out.println("1. Bubble Sort");
        System.out.println("2. Selection Sort");
        System.out.println("3. Insertion Sort");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        // Input array
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        switch (choice) {

            // -------- Bubble Sort --------
            case 1:
                for (int i = 0; i < n - 1; i++) {
                    for (int j = 0; j < n - i - 1; j++) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                        }
                    }
                }
                System.out.println("Sorted using Bubble Sort:");
                break;

            // -------- Selection Sort --------
            case 2:
                for (int i = 0; i < n - 1; i++) {
                    int minIndex = i;

                    for (int j = i + 1; j < n; j++) {
                        if (arr[j] < arr[minIndex]) {
                            minIndex = j;
                        }
                    }

                    int temp = arr[minIndex];
                    arr[minIndex] = arr[i];
                    arr[i] = temp;
                }
                System.out.println("Sorted using Selection Sort:");
                break;

            // -------- Insertion Sort --------
            case 3:
                for (int i = 1; i < n; i++) {
                    int key = arr[i];
                    int j = i - 1;

                    while (j >= 0 && arr[j] > key) {
                        arr[j + 1] = arr[j];
                        j--;
                    }
                    arr[j + 1] = key;
                }
                System.out.println("Sorted using Insertion Sort:");
                break;

            default:
                System.out.println("Invalid Choice!");
                return;
        }

        // Print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
