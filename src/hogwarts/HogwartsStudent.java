package hogwarts;

import java.util.ArrayList;
import java.util.Collections;

public class HogwartsStudent implements Comparable<HogwartsStudent> {
  //Field
  private String firstName;
  private String lastName;
  private String house;

  public HogwartsStudent(String firstName, String lastName, String house) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.house = house;
    setHouse(house);
  }

  public void setHouse(String house) throws IllegalArgumentException{

    switch (house.toLowerCase()){
      case "gryffindor","hufflepuff", "rawenclaw", "slytherin" ->  this.house = house;
      default -> throw new IllegalArgumentException("Invalid house name: " + house);
    }
  }

  @Override
  public String toString() {
    return
        firstName + " " + lastName + ": " + house + "\n";
  }

  @Override
  public int compareTo(HogwartsStudent o) {
    return lastName.compareTo(o.lastName);
  }


  public static void main(String[] args) {

    ArrayList<HogwartsStudent> studentList = new ArrayList<>();


      try {
        HogwartsStudent hogwartsStudent = new HogwartsStudent("Harry", "Potter", "Gryffindor");
        HogwartsStudent hogwartsStudent2 = new HogwartsStudent("Ron", "Wesley", "Gryffindor");
        HogwartsStudent hogwartsStudent3 = new HogwartsStudent("Hermine", "Granger", "Gryffindor");

        //add til liste
        studentList.add(hogwartsStudent);
        studentList.add(hogwartsStudent2);
        studentList.add(hogwartsStudent3);

        System.out.println(studentList);
        Collections.sort(studentList);
        // print liste
        System.out.println(studentList);

      } catch (Exception e) {
        System.err.println(e.getMessage());
      }
    }
  }


