
package dream;

import java.time.*;
import java.util.ArrayList;
import java.util.Collections;
/*
Lav en klasse Dream med attributterne date, duration (i minutter) og type (tør, våd eller mareridt).
Tilføj en metode isPleasant der fortæller om drømmen er behagelig (et mareridt er aldrig, en våd drøm kun hvis den er kortere end 10 minutter, en tør kun hvis den er længere end 10 minutter!)
Implementer funktionalitet til at sortere en liste af Dream objekter efter dato

 */

public class Dream extends DateComparator<Dream> {

  private LocalDate date;
  private int durationMin;
  private Drømmetype drømmetype;
  private ArrayList<Dream> listOfDreams = new ArrayList<>();

  public Dream(LocalDate date, int durationMin, Drømmetype drømmetype) {
    this.date = date;
    this.durationMin = durationMin;
    this.drømmetype = drømmetype;
  }

  public ArrayList<Dream> addDreamToList(Dream dream){
    listOfDreams.add(dream);
    return listOfDreams;
  }

  public Drømmetype getDrømmetype() {
    return drømmetype;
  }

  public ArrayList<Dream> getListOfDreams() {
    return listOfDreams;
  }

  public LocalDate getDate() {
    return date;
  }

  public ArrayList<Dream> sortList() {
    //DateComparator dateComparator = new DateComparator();
    listOfDreams.sort(new DateComparator<Dream>());
    return listOfDreams;
  }

  public boolean isPleasant(Dream dream){

    drømmetype = dream.getDrømmetype();

    if (drømmetype == Drømmetype.MARERIDT){
      return false;
    }
    if (drømmetype == Drømmetype.VÅD && durationMin < 10){
      return true;
    } else if (drømmetype == Drømmetype.VÅD && durationMin > 10){
      return false;
    } else if (drømmetype == Drømmetype.TØR && durationMin > 10){
      return true;
    } else{
      return false;
    }
  }

  @Override
  public String toString() {
    return "Dato: " + date + " " + durationMin + " min " + drømmetype + "\n";
  }

  public static void main(String[] args) {

    LocalDate date1 = LocalDate.of(2022, 6, 1);
    LocalDate date2 = LocalDate.of(2022, 5, 2);
    LocalDate date3 = LocalDate.of(2022, 4, 3);
    LocalDate date4 = LocalDate.of(2022, 3, 4);
    LocalDate date5 = LocalDate.of(2022, 1, 5);

    Dream dream = new Dream(date1, 9, Drømmetype.TØR);
    Dream dream2 = new Dream(date2, 8, Drømmetype.VÅD);
    Dream dream3 = new Dream(date3, 10, Drømmetype.VÅD);
    Dream dream4 = new Dream(date4, 4, Drømmetype.MARERIDT);
    Dream dream5 = new Dream(date5, 11, Drømmetype.TØR);

    System.out.println("Var drømmen i nat behagelig? "+ dream.isPleasant(dream));
    System.out.println("Var drømmen i nat behagelig? "+ dream.isPleasant(dream2));
    System.out.println("Var drømmen i nat behagelig? "+ dream.isPleasant(dream3));
    System.out.println("Var drømmen i nat behagelig? "+ dream.isPleasant(dream4));
    System.out.println("Var drømmen i nat behagelig? "+ dream.isPleasant(dream5));

    dream.addDreamToList(dream);
    dream.addDreamToList(dream2);
    dream.addDreamToList(dream3);
    dream.addDreamToList(dream4);
    dream.addDreamToList(dream5);

    System.out.println(dream.getListOfDreams());
    System.out.println("---------------Efter sortering: ---------------");
    dream.sortList();
    System.out.println(dream.getListOfDreams());
    //ArrayList<Dream> temp = dream.getListOfDreams();
    //Collections.sort(temp);
    /*
    for (int i = 0; i < dream.getListOfDreams().size() ; i++) {
      System.out.println(dream.getListOfDreams().get(i).);
    }

     */


  }
}



