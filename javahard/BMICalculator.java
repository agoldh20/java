import java.util.Scanner;

public class BMICalculator {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    double totalInches, feetToInches, feet, inches, pounds, bmi, m, kg;

    System.out.print( "Your height (feet only): " );
    feet = keyboard.nextInt();
    
    System.out.print( "Remainder height (inches only): " );
    inches = keyboard.nextDouble();

    System.out.print( "Your weight in pounds: " );
    pounds = keyboard.nextDouble();

    feetToInches = feet * 12;
    totalInches = inches + feetToInches;

    m = totalInches * 0.0254;
    kg = pounds * 0.453592;
    bmi = kg / (m * m);

    System.out.println( "Your BMI is: " + bmi );
  }
}