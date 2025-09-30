//Above average. 90% of incoming college students rate themselves as above average.
// Write a program AboveAverage.java that takes a command-line argument n,
// reads in n integers from standard input, and prints the fraction of values
// that are strictly above the average value.
import java.util.Scanner;
import java.util.Arrays;
public class AboveAverage {
  public static void main(String[] args) {
    int n ;
    Scanner input = new Scanner(System.in);
    n = input.nextInt();
    int sum = 0 ;
    int[] array = new int[n];
    for ( int i = 0 ; i < n ; i ++ )
    {
      array[i] = input.nextInt();
      sum += array[i];
    }
    double average = (double)sum/n ;
    int cnt = 0 ;
    for ( int i = 0 ; i < n ; i ++ )
    {
      if (array[i] > average)
      {
        cnt++;
      }
    }
    System.out.println(cnt +"/"+n);

  }
}
