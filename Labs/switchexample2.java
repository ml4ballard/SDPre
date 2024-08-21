
public class switchexample2 {
  public static void main(String[] args) {
    char grade;
    grade = 'a';

    switch (grade) {
    case 'A':
    case 'a':
      System.out.println("Fantastic job!");
      break;
    case 'B':
      System.out.println("Good job!");
      break;
    case 'C':
      System.out.println("You are doing ok");
      break;
    default:
      System.out.println("Invalid grade");

    }  // close of switch 

   } // close of main 

  }  //
