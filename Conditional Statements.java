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



public class Solution {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int i;
        
        if(n % 2 == 0){
            for(i=2;i<=5;i++){
                if(i == n){
                System.out.println("Not Weird");                    
                }
            }
            for(i=6;i<=20;i++){
                if(i == n){
                System.out.println("Weird");                    
                }
            }
            if(n>20){
                System.out.println("Not Weird");                    
            }            
        }
        else{
            System.out.println("Weird");
        }
        sc.close();
    }
}