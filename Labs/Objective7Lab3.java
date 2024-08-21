
public class Objective7Lab3 {
  public static void main(String[] args) {
    int counter = 1;
    int sum  = 0;

    while(counter <= 20) {
     sum = sum + counter;
     System.out.printf("Counter value is %d , Sum value is %d \n" , counter, sum);
     counter = counter + 1; 
    }
  }
}
