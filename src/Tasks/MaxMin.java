package Tasks;

import java.util.Arrays;
import java.util.List;

public class MaxMin {
    public static void main(String[] args) {
        int[] r = {13, 12, 7, 1, 8};
        int[] evenArray = new int[5];
//        System.out.println(Arrays.toString(randomArray(evenArray)));
        int test_array[] = {9,1,7,2,3,4,5,2};
        removeElement(test_array, 3);
        System.out.println(Arrays.toString(test_array));
    }

    //    исключить все  вхождения  числа из массива
    public static int[] removeElement(int[] arr, int value) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                count++;
            } else {
                arr[i - count] = arr[i];
            }
        }
        return Arrays.copyOf(arr, arr.length - count);
    }
    //    Создаем массив с случайными числами
    public static int[] randomArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.ceil(Math.random() * 10);
        }
        return arr;
    }

    //    программа, которая выводит на консоль простые числа
    public static void evenNumbers(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
    }

    //    Первая Сортировка пузырьками
    public static void bubbleSorting(int[] arr) {
        int count = 0;
        int a;
        for (int j = 0; j < arr.length; j++) {
//            System.out.println(Arrays.toString(arr));
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
                System.out.println("i " + i + " = " + Arrays.toString(arr));
            }
            System.out.println("j " + j + " = " + Arrays.toString(arr));
        }
    }


    //    Вторая сортировка пузырьками
    public static void secondBubbleSorting(int[] arr) {
        int a;
        int count = 0;
        boolean status = false;
//        Цикл будет пока status не равен false
        while (!status) {
            count++;
            status = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    status = false;
                    a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                    System.out.println("i " + i + " = " + Arrays.toString(arr));
                }
            }
            System.out.println("status" + " = " + status);
        }
    }

//    минимальное и максимальное значение
    public static int min(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

//    находим среднее значение массива
    public static int averageValue(int[] arr) {
        int r = 0;
        for (int i = 0; i < arr.length; i++) {
            r += arr[i] / arr.length;
        }
        return r;
    }
}
