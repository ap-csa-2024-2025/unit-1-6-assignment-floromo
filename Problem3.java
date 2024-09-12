public class Problem3
{
  public static void main(String[] args)
  {
    double x = 67.3424;

    System.out.println((int) ((x%1)*10));
    System.out.println((int) ((x%0.1)*100));
    System.out.println((int) ((x%0.01)*1000));
  }
}

