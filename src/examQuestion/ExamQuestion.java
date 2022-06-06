package examQuestion;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Random;

public class ExamQuestion {

  private int number;
  private String grade;


  public ExamQuestion(int number) {
    this.number = number;

  }


  public void setGrade(){
    Random random = new Random();
    int tal = random.nextInt(1,7);

    switch(tal){
      case 1 -> this.grade = "A";
      case 2 -> this.grade = "B";
      case 3 -> this.grade = "C";
      case 4 -> this.grade = "D";
      case 5 -> this.grade = "E";
      case 6 -> this.grade = "F";
    }
  }



  @Override
  public String toString() {
    return "Exam question no. " + number + " / grade: " + grade;
  }

  public static void main(String[] args){

    ExamQuestion ex = new ExamQuestion(1);
    ex.setGrade();


    ArrayList<ExamQuestion> examQuestions = new ArrayList<>();


      for (int i = 0; i < 14; i++) {
        ExamQuestion examQ = new ExamQuestion(i+1);
        examQ.setGrade();
        examQuestions.add(examQ);
      }


    try{
      PrintStream out = new PrintStream("questions.txt");

      for (ExamQuestion question : examQuestions) {
        System.out.println(question);
        out.println(question);
      }

    } catch (FileNotFoundException f){
      System.out.println("Filen blev ikke fundet");

    }

  }

}
