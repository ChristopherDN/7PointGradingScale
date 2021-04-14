import java.util.Scanner;

public class StudentGrading {

  public static void main(String[] args) {
    int[] grades = new int[6];
    Scanner in = new Scanner(System.in);
    for (int i = 0; i < 7; i++) {
      System.out.println("Enter your grade");
      grades[i] = in.nextInt();
    }



  }
}
