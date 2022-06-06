package exceptionhandling;

import java.util.Scanner;

public class ExceptionHandling {


  public static void main(String[] args) {

    //int myInt = Integer.parseInt("pants");

    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number between 1 and 10:");


    try{
      int num = input.nextInt();

      if (num < 1 || num > 10){
        throw new InvalidNumberException("Not a valid number"); // SÅDAN!
      }
    } catch (InvalidNumberException e){
      System.out.println(e.getMessage());
    }


  }
}
