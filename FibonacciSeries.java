package Day11;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int Firstterm = 0;
        int secondterm = 1;
        int n = 10;

        System.out.println("fibonacci terms till " +n+ " are : ");

        for ( int i = 1; i <=n; i++){
            System.out.println(Firstterm + "  ");

            int nextterm = Firstterm + secondterm;
            Firstterm = secondterm;
            secondterm = nextterm;
        }
    }
}
