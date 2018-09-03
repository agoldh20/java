import java.util.Scanner;

public class ForgetfulMachine {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.println( "What city is the capital of France?" );
    keyboard.next();

    System.out.println( "What is 6 * 7?" );
    keyboard.nextInt();
    // code blows up when I typed letters
    System.out.println( "Enter a number between 0.0 and 1.0:" );
    keyboard.nextDouble();
    // code blows up when you type a letter because it can only accept a double
    System.out.println( "Is there anything else you'd like to say?" );
    keyboard.next();
  }
}