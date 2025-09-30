import java.util.Scanner;
public class SpringSeason {
  public static void main(String[] args) {
    int m , d ;
    Scanner input = new Scanner(System.in);
    m = input.nextInt();
    d = input.nextInt();
    if ( m == 4 || m == 5 )
    {
      System.out.println("true");
      return ;
    }
    else if ( m == 3 )
    {
      if ( d >= 20 && d <= 31 )
      {
        System.out.println("true");
      }
      else
        {
        System.out.println("false");
        }
    }
    else if ( m == 6 )
    {
      if ( d >= 1 && d <= 20 )
      {
        System.out.println("true");
      }
      else {
        System.out.println("false");
      }
    }
    else
      {
      System.out.println("false");
      }
    return ;
  }
}
