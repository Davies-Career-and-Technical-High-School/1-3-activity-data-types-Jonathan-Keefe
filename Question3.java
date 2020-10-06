import java.util.Scanner;

class Question3 {
    public static void main(String[] args) {

        /* Write your code here */
      Scanner scan = new Scanner(System.in);
      Boolean answer1;
      Boolean answer2;
      Boolean answer3;
      System.out.println("Java is a programming language, true or false?");
      answer1 = scan.nextBoolean();
      System.out.println("Only numbers can be stored by variables in Java, true or false?");
      answer2 = scan.nextBoolean();
      System.out.println("There are only 2 possible values which can be held by a boolean variable, true or false?");
      answer3 = scan.nextBoolean();
      System.out.println("Question 1 - Your answer: " + answer1 + " Correct answer: true");
      System.out.println("Question 2 - Your answer:" + answer2 + " Correct answer: false" );
      System.out.println("Question 3 - Your answer:" + answer3 + " Correct answer: true");
    }
}