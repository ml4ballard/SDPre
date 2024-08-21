
  import java.util.Scanner;

 public class Objective4Lab2 {
   public static void main(String[] args) {
         //Create a scanner object to read input from the terminal

         Scanner scanner = new Scanner(System.in);

         int num1 = 0, num2 = 0, num3 = 0;
//         double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

         //prompt the user to get inpput for all of the int variables

         System.out.println("Please give me the first integer");
          num1 = scanner.nextInt();

         System.out.println("Please give me the second integer");
          num2 = scanner.nextInt();

         System.out.println("Please give me the third integer");
          num3 = scanner.nextInt();

         System.out.println("Please give me the first double");
         double dub1 = scanner.nextInt();

         System.out.println("Please give me the second double");
         double dub2 = scanner.nextInt();

         System.out.println("Please give me the third double");
         double dub3 = scanner.nextInt();

  System.out.printf("%d + %d + %d = %d \n", num1, num2, num3, num1+num2+num3);

    }
 }
