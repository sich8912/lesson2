package ru.geekbrain.lesson2;

import java.util.Arrays;

public class mainApp2 {

    public static void main(String[] args) {

//        for (int i = 0; i<3; i++) {
//            System.out.println("privet");
//        }
//
//        int[] myArrey = new int[10];
//        System.out.println(Arrays.toString(myArrey));
//
//        int[][] arr = new int[3][3];
//        for (int i = 0; i < 3 ; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print(arr[i][j] + "");
//            }
//            System.out.println();
//        }

        int[] array = {1, 0, 1, 0, 0, 1};
        Mass_0_1(array);
        System.out.println("--------------------------");
        Mass_0_3_6();
        System.out.println("--------------------------");
        MassChenge6x2();
        System.out.println("--------------------------");
        SquareMass();
        System.out.println("--------------------------");
        MinMax();
        System.out.println("--------------------------");
        int[] array2 = {1, 0, 1, 0, 0, 1};
        System.out.println("Исходный массив: " + Arrays.toString(array2) + ", " + "Половина массива равна другой - " + ArrayTrueFalse(array2));
        System.out.println("--------------------------");


    }

    public static void Mass_0_1(int[] array) {
        System.out.println("Входящий массив = " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {

            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }

        }
        System.out.println("Полученный массив = " + Arrays.toString(array));
    }

    private static void Mass_0_3_6() {
        int[] array = new int[8];
        int a = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = a;
            a += 3;
        }
        System.out.println("Массив чисел кратных 3-ем = " + Arrays.toString(array));
    }

    public static void MassChenge6x2() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] *= 2;
            }

        }
        System.out.println("Числа меньше 6ти умноженны на 6 = " + Arrays.toString(array));
    }


    private static void SquareMass() {
        int a = 4;
        int[][] array = new int[a][a];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {

                if (i == j) {
                    array[i][j] = 1;
                }
                System.out.print(array[i][j] + "");
            }
            System.out.println(" ");
        }

    }

    public static void MinMax() {
        int[] array = {3, 6, 9, 8, 7, 6};
        int a = array[0];
        for (int i = 0; i < array.length; i++) {
            if (a < array[i]) {
                a = array[i];
            }
        }
        System.out.println("Самый большой элемент массива = " + a);

        int b = array[0];
        ;
        for (int i = 0; i < array.length; i++) {
            if (b > array[i]) {
                b = array[i];
            }
        }
        System.out.println("Самый маленький элемент массива = " + b);
    }

    public static Boolean ArrayTrueFalse(int[] array) {
        int a = 0;
        int b = 0;

        for (int i = 0; i < array.length/2 ; i++) {
            a+=array[i];
        }
        for (int i = array.length/2; i < array.length ; i++) {
            b+=array[i];
        }

        if (a==b){
            return true;
        }else return false;

    }
}
