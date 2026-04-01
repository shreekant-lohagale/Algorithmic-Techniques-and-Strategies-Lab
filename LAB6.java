import java.util.*;

class Item {
    int weight, value;

    Item(int w, int v) {
        weight = w;
        value = v;
    }
}

public class LAB6 {
    public static void main(String[] args) {
        int[] weight = { 10, 40, 20, 30 };
        int[] value = { 60, 40, 100, 120 };
        int capacity = 50;
        int n = weight.length;
        double[][] ratio = new double[n][2];
        for (int i = 0; i < n; i++) {
            ratio[i][0] = i;
            ratio[i][1] = (double) value[i] / weight[i];
        }
        Arrays.sort(ratio, (a, b) -> Double.compare(b[1], a[1]));
        double maxValue = 0.0;
        for (int i = 0; i < n; i++) {
            int index = (int) ratio[i][0];
            if (capacity >= weight[index]) {
                maxValue += value[index];
                capacity -= weight[index];
            } else {
                maxValue += ratio[i][1] * capacity;
                break;
            }
        }
        System.out.println("Maximum value: " + maxValue);
    }
}
