import java.util.Scanner;

public class Sequencing {
  public static void main( String[] args ) {
    // THIS CODE IS BROKEN UNTIL YOU FIX IT

    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;

    System.out.print( "How much is the purchase price? " );
    price = keyboard.nextDouble();

    salesTax = price * 0.0825;
    total = price + salesTax;

    System.out.println( "Item Price:\t" + price );
    System.out.println( "Sales Tax:\t" + salesTax );
    System.out.println( "Total Cost:\t" + total );
  }
}