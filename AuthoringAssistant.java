import java.util.Scanner;

public class AuthoringAssistant {
   static Scanner scnr = new Scanner(System.in);

   public static char printMenu(){
      char input;
      while (true){

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


      }

         /*cout << "MENU" << endl;
         cout << "c - Number of non-whitespace characters" << endl;
         cout << "w - Number of words" << endl;
         cout << "f - Find text" << endl;
         cout << "r - Replace all !'s" << endl;
         cout << "s - Shorten spaces" << endl;
         cout << "q - Quit" << endl;
         cout << endl << "Choose an option: ";
         cin >> input;
         cout << endl;*/

      //return 0;

   }

   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      String userStr;
      char input;

      System.out.println("Enter a sample text:");
      userStr = scnr.nextLine();
      System.out.println("\nYou entered: " + userStr);

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
                  findText(findStr, userStr);
                  break;

              case 'r':
                  System.out.println("Edited text: ");
                  break;

              case 's':
                  System.out.println("Edited text: ");
                  break;

          }


      }while(input != 'q');
   }
}