package com.company;

public class diagonalMatrix {

    public static void main(String[] args) {

        int[][] matrix = new int[4][4];

        for (int i = 0; i < matrix.length ; i++) {

            for (int j = 0; j < matrix[i].length ; j++) {

                if (i == j)
                {
                    matrix[i][j] = 1;
                    System.out.print(matrix[i][j]);
                }
                else
                {
                    matrix[i][j] = 0;
                    System.out.print(matrix[i][j]);
                }
            }

            System.out.println();
        }

    }
}
