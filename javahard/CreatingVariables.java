public class CreatingVariables {
  public static void main( String[] args ) {
    int x, y, age, kids;
    double seconds, e, checking, pi;
    String firstName, lastName, title, city, state;

    x = 10;
    y = 400;
    age = 39;
    kids = 2;

    seconds = 4.71;
    e = 2.71828182845904523536;
    checking = 1.89;
    pi = 3.14159;

    firstName = "Graham";
    lastName = "Mitchell";
    title = "Mr.";
    city = "Chicago";
    state = "Illinois";

    System.out.println( "The variable  contains " + x );
    System.out.println( "The value " + y + " is stored in the variable y." );
    System.out.println( "I have " + kids + " kids." );
    System.out.println( "The experiment took " + seconds + " seconds" );
    System.out.println( "A favorite irrational # is Euler's number: " + e );
    System.out.println( "The value of pi is approx: " + pi);
    System.out.println( "Hopefully you have more than $" + checking + "!" );
    System.out.println( "My name's " + title + " " + firstName + lastName );
    System.out.println( "My current location is " + city + ", " + state );
  }
}