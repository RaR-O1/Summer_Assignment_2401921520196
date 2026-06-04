/*
Problem 1:

class Solution {
    public int diagonalSum(int[][] mat) {
              int n = mat.length;
        int sum = 0;
        
        for (int i = 0; i < n; i++) {
            sum += mat[i][i];            
            sum += mat[i][n - 1 - i];   
        }
        
        
        if (n % 2 == 1) {
            sum -= mat[n / 2][n / 2];
        }
        
        return sum;



    }
}



Problem 2:
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length, n = mat[0].length;
        
         
        if (m * n != r * c) return mat;
        
        int[][] result = new int[r][c];
        
        for (int i = 0; i < m * n; i++) {
            result[i / c][i % c] = mat[i / n][i % n];
        }
        
        return result;
    }
}







Problem 3:
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
 List<Integer> result = new ArrayList<>();
        
        int top = 0, bottom = matrix.length - 1;
        int left = 0, right = matrix[0].length - 1;
        
        while (top <= bottom && left <= right) {
            
            for (int col = left; col <= right; col++)
                result.add(matrix[top][col]);
            top++;
            
             
            for (int row = top; row <= bottom; row++)
                result.add(matrix[row][right]);
            right--;
            
            
            if (top <= bottom) {
                for (int col = right; col >= left; col--)
                    result.add(matrix[bottom][col]);
                bottom--;
            }
            
            if (left <= right) {
                for (int row = bottom; row >= top; row--)
                    result.add(matrix[row][left]);
                left++;
            }
        }
        
        return result;



    }
}




*/