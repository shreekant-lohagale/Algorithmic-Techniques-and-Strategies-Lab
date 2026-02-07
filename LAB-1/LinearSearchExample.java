public class LinearSearchExample {
    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 4, 2};
        int key = 4;
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
    }
}
