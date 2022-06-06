package antalUnikke_tekst;

import java.util.ArrayList;

public class Tekst {

  private ArrayList<String> tekststrenge = new ArrayList<>();

  public ArrayList<String> tilføj(String tekst){
    tekststrenge.add(tekst);
    return tekststrenge;
  }

  public ArrayList<String> getTekststrenge() {
    return tekststrenge;
  }

  // Fjerner duplikater
  public int findAntalUnikke(){

    ArrayList<String> unikkeLinjer = new ArrayList<>();

    for (int i = 0; i <tekststrenge.size(); i++) {

      if(!unikkeLinjer.contains(tekststrenge.get(i))){
        unikkeLinjer.add(tekststrenge.get(i));
      }
    }
    return unikkeLinjer.size();
  }


  public static void main(String[] args){

   Tekst tekst = new Tekst();

    tekst.tilføj("Dette");
    tekst.tilføj("Dette");
    tekst.tilføj("er");
    tekst.tilføj("er");
    tekst.tilføj("en");
    tekst.tilføj("en");
    tekst.tilføj("slags");
    tekst.tilføj("slags");
    tekst.tilføj("historie");
    tekst.tilføj("historie");

    for (String s : tekst.getTekststrenge()) {
      System.out.print(s + " ");
    }

    System.out.println("");
    System.out.print("Antal unikke tekstlinjer = ");
    System.out.println(tekst.findAntalUnikke());


  }


}
