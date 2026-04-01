public class LAB2 {

    public static void main(String[] args) {
        int arr_1[] = { 5, 3, 8, 4, 2 };
        int n_1 = arr_1.length;
        for (int i = 0; i < n_1 - 1; i++) {
            for (int j = 0; j < n_1 - i - 1; j++) {
                if (arr_1[j] > arr_1[j + 1]) {
                    int temp = arr_1[j];
                    arr_1[j] = arr_1[j + 1];
                    arr_1[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted Array:");
        for (int num : arr_1)
            System.out.print(num + " ");

        int arr_2[] = { 29, 10, 14, 37, 13 };
        int n_2 = arr_2.length;
        for (int i = 0; i < n_2 - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n_2; j++) {
                if (arr_2[j] < arr_2[min])
                    min = j;
            }
            int temp = arr_2[min];
            arr_2[min] = arr_2[i];
            arr_2[i] = temp;
        }
        System.out.println("Sorted Array:");
        for (int num : arr_2)
            System.out.print(num + " ");

    }
}