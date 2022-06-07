package small_exercices;

import java.util.Scanner;

public class InputFromUser {

  String[] fruits = { "Orange", "Apple", "Blueberry", "Guava", "Apple", "Peach", "Orange", "Strawberry" };


  public void trimInput(){

    Scanner input = new Scanner(System.in);
    System.out.println("Hvad er dit navn?");
    String name = input.nextLine().trim();
    System.out.println("Hej " + name);
  }

// TODO: Bug i denne. fungerer ikke som den skal!
    public String searchArray(String fruit){

    boolean found = false;

      for (int i = 0; i < fruits.length; i++) {

        if (fruits[i].equals(fruit)){
          found = true;

        }
        if (found){
          return fruit;
        } else{
          return "Vi kan ikke finde denne frugt i databasen";
        }
      }
      return null;
    }





  public static void main(String[] args) {

    //new InputFromUser().trimInput();
    System.out.println(new InputFromUser().searchArray("Apple"));


  }


}
