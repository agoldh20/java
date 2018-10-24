import java.util.Scanner;

public class EnterPIN {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);
    int pin = 12345, entry = 0, tries = 0;
    String typedPassword = "";

    System.out.println("WELCOME TO THE BANK OF JAVA.");

    while (!typedPassword.equals("hunter2")) {
      if (tries > 0) {
        System.out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
      }

      tries += 1;
      System.out.println("ENTER YOUR PASSWORD: ");
      typedPassword = keyboard.next();
    }

    tries = 0;

    while (entry != pin) {
      if (tries > 0) {
        System.out.println("\nINCORRECT PIN. TRY AGAIN."); }

      tries += 1;
      System.out.print("ENTER YOUR PIN: ");
      entry = keyboard.nextInt();
    }

    System.out.println("\nPIN ACCEPTED, YOUR ACCOUNT BALANCE IS $425.17");
  }
}