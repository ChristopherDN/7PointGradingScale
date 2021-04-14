import java.util.ArrayList;
import java.util.Scanner;

public class StudentGrading {

  public static void main(String[] args) {
    int[] grades = new int[7];
    Scanner in = new Scanner(System.in);

    boolean isCreating = true;
    ArrayList<Student> students = new ArrayList<>();
    while (isCreating) {
      System.out.print("Enter you name: ");
      String name = in.next();

      for (int i = 0; i < 7; i++) {
        System.out.print("Enter your grade: ");
        grades[i] = in.nextInt();
      }
      System.out.println("Do you want to create a new Student grading, press y/n: ");
      String answer = in.next();
      if (answer.equals("n")) {
        isCreating = false;
      }
      students.add(new Student(name, grades));
    }

    for (int i = 0; i < students.size(); i++) {
      System.out.println(students.get(i).getName());

      //Foreach loop
      int j = 1;
      for (int grade : students.get(i).getGrades()) {
        System.out.print("Grade " + (j) + ". " + grade + "\n");
        j++;
      }
    }
  }
}
