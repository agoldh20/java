import java.util.Scanner;

public class BMICatagories {
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

    System.out.print( "BMI Catagory: " );
    if ( bmi < 15.0 ) {
      System.out.println( "very severly underweight" );
    }
    else if ( bmi <= 16 ) {
      System.out.println( "severly underweight" );
    }
    else if ( bmi < 18.5 ) {
      System.out.println( "underweight" );
    }
    if ( bmi < 25 ) {
      System.out.println( "normal weight" );
    }
    else if ( bmi < 30 ) {
      System.out.println( "overweight" );
    }
    else if ( bmi < 35 ) {
      System.out.println( "moderatley obese" );
    }
    else if ( bmi < 40 ) {
      System.out.println( "severly obese" );
    }
    else {
      System.out.println( "very severly/\"morbidly\" obese" );
    }
  }
}