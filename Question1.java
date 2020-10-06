import java.util.Scanner;

class Question1 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);
      String num1;
      String num2;
      System.out.println("Give me a number");
      num1 = scan.nextDouble();
      System.out.println("Give me another number");
      num2 = scan.nextDouble();

      System.out.println( num2 + " " + num1);
    }
}