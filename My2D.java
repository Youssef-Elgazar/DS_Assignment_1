package com.company;

public class My2D {


    public void matrixDsiplay(int[][] arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.println(arr[row][col]);
            }

        }
    }

    public void deleteRow(int rowToBeDeleted, int[][] arr) {
        int[][] newArr = new int[0][];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                while (row != rowToBeDeleted) {
                    arr[row][col] = newArr[row][col];
                }
            }
        }
    }

    public void deleteColumn(int colToBeDeleted, int[][] arr) {
        int[][] newArr = new int[0][];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                while (col != colToBeDeleted) {
                    arr[row][col] = newArr[row][col];
                }
            }
        }
         
    }

    public void deleteElement(int[][] arr, int rowToBeDeleted, int colToBeDeleted) {
        int[][] newArr = new int[0][];
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                while (col != colToBeDeleted && row != rowToBeDeleted) {
                    arr[row][col] = newArr[row][col];
                }
            }
        }
    }
    
    
    
    
    public void matrixTranspose(int arr [][], int newArr [] [], int n ){           // n is the order of the matrix
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                arr[i][j] = newArr[j][i];    // switching rows and columns
            }
        }
    }
}
