import java.util.Random;

public class LAB4 {
    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};
        System.out.println("Original array:");
        printArray(arr);

        // Merge Sort
        MergeSortExample mergeSort = new MergeSortExample();
        int[] mergeArr = arr.clone();
        mergeSort.sort(mergeArr, 0, mergeArr.length - 1);
        System.out.println("After Merge Sort:");
        printArray(mergeArr);

        // Heap Sort
        HeapSortExample heapSort = new HeapSortExample();
        int[] heapArr = arr.clone();
        heapSort.sort(heapArr);
        System.out.println("After Heap Sort:");
        printArray(heapArr);

        // Quick Sort
        QuickSortExample quickSort = new QuickSortExample();
        int[] quickArr = arr.clone();
        quickSort.sort(quickArr, 0, quickArr.length - 1);
        System.out.println("After Quick Sort:");
        printArray(quickArr);

        // Random Quick Sort
        RandomQuickSort randomQuickSort = new RandomQuickSort();
        int[] randomArr = arr.clone();
        randomQuickSort.randomSort(randomArr, 0, randomArr.length - 1);
        System.out.println("After Random Quick Sort:");
        printArray(randomArr);
    }

    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

class MergeSortExample {
    void merge(int arr[], int l, int m, int r) {
        int n1 = m - l + 1, n2 = r - m;
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (int i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; j++)
            R[j] = arr[m + 1 + j];
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j])
                arr[k++] = L[i++];
            else
                arr[k++] = R[j++];
        }
        while (i < n1)
            arr[k++] = L[i++];
        while (j < n2)
            arr[k++] = R[j++];
    }

    void sort(int arr[], int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;
            sort(arr, l, m);
            sort(arr, m + 1, r);
            merge(arr, l, m, r);
        }
    }
}

class HeapSortExample {
    void heapify(int arr[], int n, int i) {
        int largest = i, l = 2 * i + 1, r = 2 * i + 2;
        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heapify(arr, n, largest);
        }
    }

    void sort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
}

class QuickSortExample {
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}

class RandomQuickSort {
    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    void randomSort(int arr[], int low, int high) {
        if (low < high) {
            Random rand = new Random();
            int pivotIndex = low + rand.nextInt(high - low);
            int temp = arr[pivotIndex];
            arr[pivotIndex] = arr[high];
            arr[high] = temp;
            int pi = partition(arr, low, high);
            randomSort(arr, low, pi - 1);
            randomSort(arr, pi + 1, high);
        }
    }
}