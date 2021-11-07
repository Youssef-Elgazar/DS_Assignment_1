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

<<<<<<< Updated upstream

    public static void matrixDisplay(My2D arr) {
        for (int row = 0; row < arr.my2DArr.length; row++) {
            for (int col = 0; col < arr.my2DArr.length; col++) {
                System.out.print( arr.my2DArr[row][col] + " ");
=======
ِ
    public void matrixDsiplay(My2D arr) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr.length; col++) {
                System.out.println( arr.my2DArr[row][col]);
>>>>>>> Stashed changes
            }
            System.out.println();
        }
    }

    public static void deleteRow(int rowToBeDeleted, My2D arr) {
        for (int row = 0; row < arr.length/2; row++) {
            for (int col = 0; col < arr.length/2; col++) {
                if (rowToBeDeleted == row) {
                    arr.my2DArr[row][col] = 0;
                }
                System.out.println();
                }


            }

        }



    public static void deleteColumn(int colToBeDeleted, My2D arr) {

        for (int row = 0; row < arr.length / 2; row++) {
            for (int col = 0; col < arr.length / 2; col++) {
                if (colToBeDeleted == col) {
                    arr.my2DArr[row][col] = 0;
                }
                System.out.println();
            }


        }

    }


    public static void deleteElement( My2D arr, int rowToBeDeleted, int colToBeDeleted) {
        for (int row = 0; row < arr.length/2; row++) {
            for (int col = 0; col < arr.length/2; col++) {
                if (colToBeDeleted == col && rowToBeDeleted == row)  {
                    arr.my2DArr[row][col] = 0;
                }
            }
        }
    }
    
    
    
    
    public static void matrixTranspose( My2D arr){           // n is the order of the matrix
        for (int row = 0; row < arr.my2DArr.length; row++) {
            for (int col = 0; col < arr.my2DArr.length; col++){

                System.out.print( arr.my2DArr[col][row] + " ");
            }
            System.out.println();
        }
        }
    }

<<<<<<< Updated upstream


=======
}
>>>>>>> Stashed changes
