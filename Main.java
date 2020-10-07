import java.util.Scanner;
/**
 *
 * @author celer7841
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a number between 1 and 10");
    int counter = sc.nextInt();
    
    for (int j=1; j<=counter; j++){
      for (int i = 1; i <= counter; i++){
      System.out.print("*");
      }
      System.out.println();
    } 
    

  }
}
