package motherboard;

import java.util.ArrayList;

public class MotherBoard {

  private ArrayList<SataDrive> tilkobledeSataDrives = new ArrayList<>();

  public void getTilkobledeSataDrives() {

    printList();
  }

  public void printList(){
    for (int i = 0; i < tilkobledeSataDrives.size(); i++) {

      String name = tilkobledeSataDrives.get(i).getName();
      int number = tilkobledeSataDrives.get(i).getNumber();
      System.out.println(name + " " + number);
    }
  }

  public void addSataDrive(String name, int age) {

    if(tilkobledeSataDrives.size() < 4){
      tilkobledeSataDrives.add(new SataDrive(name, age));
    } else {
      throw new NoMoreSpaceInArray();
      // OBS den skal være Runtime Exception pga fejlen skal komme når det ikke er plads i arrayet!
    }
  }

  public ArrayList<SataDrive> sortSataDrives(){
    tilkobledeSataDrives.sort(new SataDriveAgeComparator());
    // Bruge Comparator fordi det er objekter som skal sorteres!
    return tilkobledeSataDrives;
  }

  public static void main(String[] args) {
    MotherBoard motherBoard = new MotherBoard();
    //motherBoard.getTilkobledeSataDrives();

    System.out.println("Efter brug af addSataDrive metode:");
    // try catch her


   // motherBoard.addSataDrive("SataDrive", 6);
   // motherBoard.addSataDrive("SataDrive", 7);
    motherBoard.addSataDrive("SataDrive", 3);
    motherBoard.addSataDrive("SataDrive", 1);
    motherBoard.addSataDrive("SataDrive", 2);

    SataDrive sataDrive1 = new SataDrive("SataDrive", 1);
    SataDrive sataDrive2 = new SataDrive("SataDrive", 2);
    SataDrive sataDrive3 = new SataDrive("SataDrive", 3);
    SataDrive sataDrive4 = new SataDrive("SataDrive", 4);
    //SataDrive sataDrive5 = new SataDrive("SataDrive", 5);


    motherBoard.printList();
    System.out.println("---------------------Sortering-------------------");
    motherBoard.sortSataDrives();
    motherBoard.printList();

  }


  public int compare(SataDrive o1, SataDrive o2) {
    return o1.getNumber() - o2.getNumber();
  }
}
