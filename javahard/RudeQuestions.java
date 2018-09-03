import java.util.Scanner;

public class RudeQuestions {
  public static void main( String[] args ) {
    String name, happy;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print( "Hello. What is your name? " );
    name = keyboard.next();
    // blows up when number is entered because name has be declared as a string

    System.out.print( "Hi, " + name + "! How old are you? " );
    age = keyboard.nextInt();
    // blows up when a string is entered because its declared as a number

    System.out.println( "So you're " + age + ", eh? That's not very old." );
    System.out.print( "How much do you weigh, " + name + "? " );
    weight = keyboard.nextDouble();
    // blows up when a string is entered because its declared as a double


    System.out.println( weight + "! Better keep that quiet!!");
    System.out.print( "Finally, whats your income, " + name + "? ");
    income = keyboard.nextDouble();
    // blows up when a string is entered because its declared as a double


    System.out.print( "Hopefully that is " + income + " per hour" );
    System.out.println( " and not per year!" );
    System.out.print( "Well, thanks for answering my rude questions, " );
    System.out.println( name + "." );

    System.out.println( "Are you happy these questions are finally over, " + name + "? ");
    happy = keyboard.next();

    System.out.println( "Ha! " + happy + " is my middle name!" );
  }
}

// The code WILLNOT blow up if you type an int instead of a double because its still a number?
// Yes the code will blow up if you type a number were it is expecting a string because a stirng is not a number