import java.util.Scanner;

public class AuthoringAssistant {

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userStr;
      char menuOp = 'o';

      System.out.println("Enter a sample text:");
      userStr = scnr.nextLine();
      System.out.println("You entered: " + userStr);

      do{
         menuOp = ;//FIXME: Make printMenu()
      }while(menuOp != 'q');
   }
}