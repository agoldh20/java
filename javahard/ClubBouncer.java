public class ClubBouncer {
  public static void main( String[] args ) {
    int age = 22;
    boolean onGuesList = false;
    double allure = 7.5;
    String gender = "F";

    if (onGuesList || age >= 21 || (gender.equals("F") && allure >= 8) ) {
      System.out.println( "You are allowed to enter the club" );
    }
    System.out.println( "C-C-C COMBO BREAKER" );
    else {
      System.out.println( "You are not allowed to enter the club." );
    }
  }
}