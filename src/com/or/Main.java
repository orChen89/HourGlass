package com.or;

public class Main {

    public static int hourglassSum(int[][] twoDimArr) {


        int rows = twoDimArr.length;
        int columns = twoDimArr[0].length;
        int maxSum = -63;

        for (int i = 0; i < rows - 2 ; i++) {
            for (int j = 0; j < columns - 2 ; j++) {
                int currentSum = twoDimArr[i][j] + twoDimArr[i][j+1] + twoDimArr[i][j+2] + twoDimArr[i+1][j+1] +
                        twoDimArr[i+2][j] + twoDimArr[i+2][j+1] + twoDimArr[i+2][j+2];
                if(currentSum > maxSum){
                    maxSum = currentSum;
                }
            }
        }
          return maxSum;
    }

    public static void main(String[] args) {

        int[][] twoDimArr =

                {
                { 1, 1, 1, 0, 0, 0 },
                { 0, 1, 0, 0, 0, 0 },
                { 1, 1, 1, 0, 0, 0 },
                { 3, -2, -1, 5, 1, 3 },
                { 0, 2, 0, 0, 4, 0 },
                { -6, 8, 1, 4, 1, 2 },
        };

        System.out.print("The maximum hourglass sum is: ");
        System.out.print(hourglassSum(twoDimArr));
    }
}

