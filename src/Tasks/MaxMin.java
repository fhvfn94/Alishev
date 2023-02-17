package Tasks;

import java.util.Arrays;

public class MaxMin {
    public static void main(String[] args) {
//        Мое решение
        int[] arr = {12, 14, 13, 9, 4};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            } else if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        int r = 0;
        int t = 0;
        for (int i = 0; i < arr.length; i++) {
            r += arr[i];
            t += i;
        }
        r  = r / t;
        System.out.println(r);

//        Решение
        int n = 10;
        double[] ar = new double[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = Math.random() * 10;
        }
        double max1 = ar[0];
        double min1 = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (max1 < ar[i]) {
                max1 = ar[i];
            } else if (min1 > ar[i]) {
                min1 = ar[i];
            }
        }
        System.out.println(max1);
        System.out.println(min1);
        double r2 = 0;
        for (int i = 0; i < ar.length; i++) {
            r2 += ar[i] / ar.length;
        }
        System.out.println(r2);

    }
}
