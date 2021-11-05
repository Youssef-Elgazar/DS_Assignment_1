package com.company;
import java.util.*;

public class My2D {
    private int[][] my2DArr;
    private int length;

    // Construction.
    public My2D(int rows, int cols) {
        my2DArr = new int[rows][cols];
        length = rows * cols;
    }

    // Population of 2D array.
    public static void populate(My2D arr) {
        Scanner console = new Scanner(System.in);
        for(int i = 0; i < arr.my2DArr.length; i++){
            for(int j = 0; j < arr.my2DArr.length; j++){
                System.out.println("Enter element [" + i + "][" + j + "]:");
                arr.my2DArr[i][j] = console.nextInt();
            }
        }
    }


    public void matrixDsiplay(My2D arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.println( arr.my2DArr[row][col]);
            }

        }
    }

    public void deleteRow(int rowToBeDeleted,My2D arr, My2D newArr ) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                while (row != rowToBeDeleted) {
                    arr.my2DArr[row][col] = newArr.my2DArr[row][col];
                }
            }
        }
    }

    public void deleteColumn(int colToBeDeleted, My2D arr,  My2D newArr) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                while (col != colToBeDeleted) {
                    arr.my2DArr [row][col] = newArr.my2DArr[row][col];
                }
            }
        }
         
    }

    public void deleteElement( My2D arr, My2D newArr , int rowToBeDeleted, int colToBeDeleted) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                while (col != colToBeDeleted && row != rowToBeDeleted) {
                    arr.my2DArr[row][col] = newArr.my2DArr[row][col];
                }
            }
        }
    }
    
    
    
    
    public void matrixTranspose( My2D arr, My2D newArr , int n ){           // n is the order of the matrix
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                arr.my2DArr [i][j] = newArr.my2DArr[j][i];    // switching rows and columns
            }
        }
    }

    public static void main(String[] args) {
        My2D test = new My2D(2,2);
        populate(test);
    }
}
