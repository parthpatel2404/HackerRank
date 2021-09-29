import java.io.*;
import java.util.*;
import java.math.*;
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        
        sc.nextLine();
        
        for(int i=0;i<N;i++){
            String S = sc.nextLine();
            char[] charArray = S.toCharArray();
            for(int j=0;j<charArray.length;j++){
                if(j % 2 == 0){
                    System.out.print(charArray[j]);
                }
            }
            System.out.print(" ");
            for(int j=0;j<charArray.length;j++){
                if(j % 2 != 0){
                    System.out.print(charArray[j]);
                }
            }
        System.out.println();
        }
        sc.close();
    }
}