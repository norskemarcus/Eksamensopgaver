package raflebæger;

import java.util.Random;

// Øvelse 1 nr 3
public class Raflebæger {

  private int antalTerninger;
  private int[] liste;

  public Raflebæger(int antalTerninger){
    this.antalTerninger = antalTerninger;
    liste = new int[antalTerninger];
    // lave et array i konstruktøren til at indeholde alle x terninger
  }

  public int ryst(){
// lægge random tal ind i array
    Random random = new Random();

    for (int i = 0; i < liste.length; i++) {
      int terning = random.nextInt(6+1);
      liste[i] = terning;
    }
    // Summere random fra array
    int sum = 0;
    for (int i = 0; i < liste.length; i++) {
      sum += liste[i];
    }
    return sum;
  }

  public int[] se(){
    return liste;
  }


  public static void main(String[] args) {


    Raflebæger raflebæger = new Raflebæger(4);

    raflebæger.ryst();
    int[] listeTerninger = raflebæger.se();

    for (int i = 0; i < listeTerninger.length; i++) {
      System.out.println(listeTerninger[i]);
    }



  }


}
