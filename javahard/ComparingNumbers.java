import java.util.Scanner;

public class ComparingNumbers {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double first, second;

    System.out.print( "Give me two numbers. First: " );
    first = keyboard.nextDouble();
    System.out.print( "Second: " );
    second = keyboard.nextDouble();

    if ( first < second ) {
      System.out.println( first + " is Less Than " + second );
    }
    if ( first <= second ) {
      System.out.println( first + " is Less Than/Equal to " + second );
    }
    if ( first == second ) {
      System.out.println( first + " is Equal To " + second );
    }
    if ( first >= second ) {
      System.out.println( first + " is Greater Than/Equal To " + second );
    }
    if ( first > second ) {
      System.out.println( first + " is Greater Than " + second );
    }
    if ( first != second ) {
      System.out.println( first + " is Not Equal To " + second );
      System.out.println( "Hey." );
    }
  }
}