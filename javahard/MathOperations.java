public class MathOperations {
  public static void main( String[] args ) {
    int a, b, c, d, e, f, g, h;
    double x, y, z, w;
    String one, two, both;

    a = 10;
    b = 27;
    System.out.println( "a is " + a + ", b is " + b );

    c = a + b;
    System.out.println( "a + b = " + c );
    d = a - b;
    System.out.println( "a - b = " + d );
    e = a + b * 3;
    System.out.println( "a + b * 3 = " + e );
    f = b / 2;
    System.out.println( "b / 2 = " + f );
    g = b % 10;
    System.out.println( "b % 10 = " + g );
    h = f + g;
    System.out.println( "f = " + f + ", g = " + g + ". f + g = " + h );

    x = 1.1;
    System.out.println( "\nx = " + x );
    y = x * x;
    System.out.println( "x * x = " + y );
    z = b / 2;
    System.out.println( "b / 2 = " + z + " as a double." );
    w = x + y;
    System.out.println( "y = " + y + ". x + y = " + w );

    one = "dog";
    two = "house";
    both = one + two;
    System.out.println( both );

  }
}