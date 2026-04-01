public class LAB3 {
    static int binarySearch(int arr[], int low, int high, int key) {
        if (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key)
                return mid;
            if (arr[mid] > key)
                return binarySearch(arr, low, mid - 1, key);
            return binarySearch(arr, mid + 1, high, key);
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12 };
        int key = 8;
        int result = binarySearch(arr, 0, arr.length - 1, key);
        if (result == -1)
            System.out.println("Element not found");
        else
            System.out.println("Element found at index " + result);
    }
}
