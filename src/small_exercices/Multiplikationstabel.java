package small_exercices;
/*
Lav et program der udskriver en multiplikationstabel for alle tallene fra 1 til 10.
Lav programmet i en enkelt metode kaldet printMulTable.

Brug to løkker der begge tæller fra 1 til 10 – brug f.eks. a og b som tællere, og sørg for at b er inden i a.

Udskriv resultatet af a*b for hver iteration af den indre løkke.

Tip: Brug printf til at få tallene til at stå højrestillet med lige mange tegn for hvert tal.

NB: Husk at der kun skal laves linjeskift når der er skrevet en hel række ud.
 */


import java.util.Scanner;

public class Multiplikationstabel {

  private int a, b;
  
  public void printMulTab() {

    for (int a = 1; a <= 10; a++) {
      for (int b= 1; b <=10 ; b++) {
        System.out.printf("%4d", a*b);
      }
      System.out.println();
    }
    System.out.println("");
  }


  public void printStarBlock(int height, int width){

    for (int y = height; y > 0; y--) {
      for (int x = width; x > 0; x--) {
        System.out.printf("*");
      }
      System.out.println(" ");
    }
  }


  
  public static void main(String[] args) {

    //new Multiplikationstabel().printMulTab();

   // new Multiplikationstabel().printStarBlock(4, 4);

    Multiplikationstabel m = new Multiplikationstabel();


    }
  }
  

