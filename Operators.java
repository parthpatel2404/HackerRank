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

class Result {

    /* Complete the 'solve' function below.
     *
     * The function accepts following parameters:
     *  1. DOUBLE meal_cost
     *  2. INTEGER tip_percent
     *  3. INTEGER tax_percent
     */

    public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    
    double tip = (meal_cost * tip_percent) / 100;
    double tax = (meal_cost * tax_percent) / 100;
    double total_cost = meal_cost + tip + tax;
    System.out.println(Math.round(total_cost));

    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double meal_cost = sc.nextDouble();

        int tip_percent = sc.nextInt();

        int tax_percent = sc.nextInt();

        Result.solve(meal_cost, tip_percent, tax_percent);

        sc.close();
    }
}
