package hogwarts;

import java.util.ArrayList;

public class HogwartsExam implements Comparable<HogwartsExam>{

  private String firstName, lastName;
  private String house;

  public HogwartsExam(String firstName, String lastName, String house) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.house = house;
    setHouse(house);
  }

  private void setHouse(String house) {

    switch (house.toLowerCase()) {
      case "gryffindor", "hufflepuff", "rawenclaw", "slytherin" -> this.house = house;
      default -> throw new IllegalArgumentException("Invalid house name " + house);


    }
  }

  public String getLastName() {
    return lastName;
  }

  @Override
  public String toString() {
    return firstName + " " + lastName + " " + house + " house " + "\n";
  }
  
  
  
  public static void main(String[] args) {

    ArrayList<HogwartsExam> studentList = null;

    try{
     HogwartsExam hogwartsExam2 = new HogwartsExam("Harry", "Potter", "Gryffindor");
     HogwartsExam hogwartsExam = new HogwartsExam("Ron", "Weasley", "Gryffindor");

     studentList = new ArrayList<>();
     studentList.add(hogwartsExam);
     studentList.add(hogwartsExam2);

      System.out.println(studentList);

     studentList.sort(HogwartsExam::compareTo);
      System.out.println(" ");
      System.out.println("After sorting by last name: ");

      System.out.println(studentList);
     
   } catch (IllegalArgumentException iae){
     System.out.println("There is no such house at Hogwarts");
   }
   

  }


  @Override
  public int compareTo(HogwartsExam o) {
    return lastName.compareTo(o.lastName);
  }
}