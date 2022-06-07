package small_exercices;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayTraining {

  private String firstName;
  private final String ANSI_RESET = "\u001B[0m";
  private final String ANSI_GREEN = "\u001B[32m";
  private final String ANSI_CYAN = "\u001B[36m";
  private final String ANSI_BLACK_BACKGROUND = "\u001B[40m";


  private ArrayList<String> liste = new ArrayList<>();
  private String[] listeMedStrenge = {"Onsdag", "Mandag", "Tirsdag"};
  private String[] listeMedTal = {"1","9","10","5","4","7","2","12","6","8"};


  public ArrayList<String> addName(String firstName){
    liste.add(firstName);
    return liste;
  }

  public void printListeMedStrenge() {
    for(String s: listeMedStrenge){
      System.out.println(s);
    }
  }
  // OBS OBS: ikke sortere tal som strenge! Strings are sorted by code points!
  public String[] sortListeMedTal(){
    Arrays.sort(listeMedTal);
    return listeMedTal;
  }

  private void printListeMedTal(){
    for(String s:listeMedTal){
      System.out.println(s);
    }
  }

  public ArrayList<String> sortArrayList(){
    Collections.sort(liste);
    return liste;
  }

  public String[] sortArray(){
    Arrays.sort(listeMedStrenge);
    return listeMedStrenge;
  }

  public void printList(){
    for (String s : liste)
      System.out.println(ANSI_GREEN + s + ANSI_RESET);
  }

  public void printListWithBlackBackground(){
    for (String s : liste)
      System.out.println(ANSI_BLACK_BACKGROUND + ANSI_CYAN + s + ANSI_RESET);
  }

  @Override
  public String toString() {
    return firstName;
  }

  public ArrayList<String> getListe() {
    return liste;
  }

  public static void main(String[] args) {

    ArrayTraining a = new ArrayTraining();
    a.addName("Tommy");
    a.addName("Marcus");

    System.out.println("Før sortering:");
    a.printList();
    System.out.println("Efter sortering af ArrayList:");
    a.sortArrayList();
    a.printList();

    System.out.println("Før sortering:");
    a.printListeMedStrenge();
    a.sortArray();
    System.out.println("Efter sortering af array:");
    a.printListeMedStrenge();

    System.out.println("Før sortering af tal");
    a.printListeMedTal();
    System.out.println("Efter sortering af tal");
    a.sortListeMedTal();
    a.printListeMedTal();

  }

}
