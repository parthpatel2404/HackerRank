import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Solution{
        
    static int R = 6;
    static int C = 6;
    
    // Returns maximum sum of
    // hour glass in ar[][]
    static int findMaxSum(int [][]mat){
        if (R < 3 || C < 3)
            return -1;
            
        // Here loop runs (R-2)*(C-2)
        // times considering different
        // top left cells of hour glasses.
        int max_sum = Integer.MIN_VALUE;
        for (int i = 0; i < R - 2; i++){
            for (int j = 0; j < C - 2; j++){
                // Considering mat[i][j] as top
                // left cell of hour glass.
                int sum = (mat[i][j] + mat[i][j + 1] +
                        mat[i][j + 2]) + (mat[i + 1][j + 1]) +
                        (mat[i + 2][j] + mat[i + 2][j + 1] +
                        mat[i + 2][j + 2]);
                        
                max_sum = Math.max(max_sum, sum);
            }
        }
        return max_sum;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i, j;   
    
        int mat[][] = new int[6][6];   

        for (i = 0; i < 6; i++){
            for (j = 0; j < 6; j++){
            mat[i][j] = sc.nextInt();      
            }
        }       
        
        int res = findMaxSum(mat);
        if (res == -1)
            System.out.println("Not possible");
        else
            System.out.println(res);
    }
}
