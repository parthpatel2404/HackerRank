import java.io.*;
import java.util.*;

public class Solution1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int i = 4;
        double d= 4.0;
        String s = "HackerRank";
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextDouble();
        sc.nextLine();
        String z = sc.nextLine();
        
        System.out.println(i + x);
        System.out.println(d + y);
        System.out.println(s +" " + z);
        
        sc.close();
    }
}