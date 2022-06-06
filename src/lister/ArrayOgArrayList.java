package lister;

import java.util.Arrays;

public class ArrayOgArrayList {

  private String[] helloWorld = {"Hello", "World"};

  public void printAnArray(){
    System.out.println(Arrays.toString(helloWorld));
    System.out.println("");
    System.out.println("Penere print af et array er med et loop:");

    // almindelig for loop
    for(int i=0; i<helloWorld.length; i++){
      System.out.println(helloWorld[i]);
    }
    // enhanced for loop
    for (String s : helloWorld) {
      System.out.println(s);
    }

  }





}
