import java.util.Scanner;

public class AuthoringAssistant {
   static Scanner scnr = new Scanner(System.in);

   public static char printMenu(){
      char input;

          System.out.println("MENU");
          System.out.println("c - Number of non-whitespace characters");
          System.out.println("w - Number of words");
          System.out.println("f - Find text");
          System.out.println("r - Replace all !'s");
          System.out.println("s - Shorten spaces");
          System.out.println("q - Quit");
          System.out.println();
          System.out.println("Choose an option: ");
          input = scnr.next().charAt(0);


     return input;
   }

   //Define findText
   public static int findText (String findText, String userString){
       int count = 0;
       int firstLetter = userString.indexOf(findText.charAt(0));
       String compare = "";

       while(firstLetter != -1){
           for (int i = 0; i < findText.length(); ++i){

               compare += userString.charAt(firstLetter + i);
           }

           if (compare.equals(findText)) {
               count += 1;
           }

           compare = "";
           firstLetter = userString.indexOf(findText.charAt(0), firstLetter + 1);
       }

       return count;
   }


   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userStr;
      String findStr;
      char input;

      System.out.println("Enter a sample text:");
      userStr = scnr.nextLine();
      System.out.println("\nYou entered: " + userStr);
      System.out.println();

      do{
          input = printMenu();

          switch(input) {
              case 'c':
                  System.out.println("Number of non-whitespace characters: ");
                  break;

              case 'w':
                  System.out.println("Number of words: ");
                  break;

              case 'f':
                  System.out.println("Enter a word or phrase to be found");
                  findStr = scnr.nextLine();
                  System.out.println("\"" + findStr + "\" instances: " + findText(findStr, userStr));
                  break;

              case 'r':
                  System.out.println("Edited text: ");
                  break;

              case 's':
                  System.out.println("Edited text: ");
                  break;

              case 'q':
                  System.out.println();
                  break;

              default:
                  System.out.println("Invalid Choice");

          }


      }while(input != 'q');
   }
}