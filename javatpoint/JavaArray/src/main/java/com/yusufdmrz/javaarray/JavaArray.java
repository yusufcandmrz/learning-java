/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.yusufdmrz.javaarray;

/**
 *
 * @author Yusuf
 */
public class JavaArray {
    
    public static int findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int index = 1; index < array.length; index++) {
            if (array[index] < minNumber) {
                minNumber = array[index];
            }
        }
        return minNumber;
    }
    
    public static void printArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
    }
    
    public static int[] getArray() {
        return new int[]{10, 30, 50, 70, 90};
    }
 
    public static void main(String[] args) {
        // JAVA ARRAY
        /* int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        for (int index = 0; index < array.length; index++) {
            System.out.print(array[index] + " ");
        }
        
        System.out.println();
        
        int[] array2 = {10, 20, 30};
        for (int index = 0; index < array2.length; index++) {
            System.out.print(array2[index] + " ");
        }
        
        System.out.println();
        
        int[] array3 = {90, 80, 70};
        for (int number : array3) {
            System.out.print(number + " ");
        }
        
        System.out.println();
        
        int[] array4 = {24, 36, 60, 12, 48};
        System.out.println(findMinNumber(array4));
        
        printArray(new int[]{10, 20, 30});
        
        System.out.println();
        
        int[] array5 = getArray();
        for (int index = 0; index < array5.length; index++) {
            System.out.print(array5[index] + " ");
        }
        
        System.out.println();
        
        int[][] array6 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        for (int index = 0; index < array6.length; index++) {
            for (int index2 = 0; index2 < array6[index].length; index2++) {
                System.out.print(array6[index][index2] + " ");
            }
            System.out.println();
        }
        
        int[][] array7 = new int[3][];
        array7[0] = new int[3];
        array7[1] = new int[4];
        array7[2] = new int[2];
        int count = 0;
        for (int index = 0; index < array7.length; index++) {
            for (int index2 = 0; index2 < array7[index].length; index2++) {
                array7[index][index2] = count++;
            }
        }
        for (int index = 0; index < array7.length; index++) {
            for (int index2 = 0; index2 < array7[index].length; index2++) {
                System.out.print(array7[index][index2] + " ");
            }
            System.out.println();
        }
        
        int[] array8 = {1, 2, 3};
        System.out.println(array8.getClass().getName());
        
        char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
        char[] copyTo = new char[7];
        System.arraycopy(copyFrom, 2, copyTo, 0, 7);
        System.out.println(String.valueOf(copyTo));
        
        int[] cloneFrom = {12, 24, 36, 48};
        int[] cloneTo = cloneFrom.clone();
        printArray(cloneTo);
        System.out.println();
        System.out.println(cloneFrom == cloneTo);
        
        int[][] array9 = {{1, 3, 4}, {3, 4, 5}};
        int[][] array10 = {{1, 3, 4}, {3, 4, 5}};
        int[][] array11 = new int[2][3];
        for(int index = 0; index < array9.length; index++){
            for(int index2 = 0; index2 < array9[index].length; index2++){
                array11[index][index2] = array9[index][index2] + array10[index][index2];
                System.out.print(array11[index][index2] + " ");
            }
            System.out.println();
        } */
    }
}
