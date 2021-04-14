public class Student {

  String name;
  int[] grades;

  public Student(String name, int[] grades) {
    this.name = name;
    this.grades = grades;
  }

  public String getName(){
    return name;
  }

  public int[] getGrades(){
    return grades;
  }


  public double averageGrade() {
    return 0;
  }
}
