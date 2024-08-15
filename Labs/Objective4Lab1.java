
 import java.util.Scanner;
 public class Objective4Lab1 {
   public static void main(String[] args) {

   Scanner keyboard = new Scanner(System.in);

//    String fname = "";
//    String lname = "";
//    String favoriteAnimal = "";
//    String favoriteFood = "";
//    String favoriteSong = "";

    System.out.println("Please give me your first name.");
    String fname = keyboard.next();

    System.out.println("Please give me your last name.");
    String lname = keyboard.next();

    System.out.println("Please give me your favorite animal.");
    String favoriteAnimal = keyboard.next();

    System.out.println("Please give me your favorite food.");
    String favoriteFood = keyboard.next();

    System.out.println("Please give me your favorite song.");
    String favoriteSong = keyboard.next();

     System.out.printf("My name is %s %s \n" , fname, lname);
     System.out.printf("My favorite animal is the %s \n", favoriteAnimal);
     System.out.printf("My favorite food is %s \n", favoriteFood);
     System.out.printf("My favorite sone is %s \n", favoriteSong);
   
//     scanner.close();
     
   }
}
