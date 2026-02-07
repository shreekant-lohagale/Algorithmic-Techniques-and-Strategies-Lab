public class BinarySearchExample {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int key = 8;

        int low = 0, high = arr.length - 1;
        int index = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == key) {
                index = mid;
                break;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (index != -1)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}
