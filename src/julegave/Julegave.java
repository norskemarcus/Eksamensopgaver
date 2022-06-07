package julegave;

import java.util.Random;
// Øvelse 13 (6)
public class Julegave {

  private boolean isSoft;
  private boolean isRectangular;
  private boolean doesRattle;
  private  Random random = new Random();

  public Julegave() {
    this.isSoft = random.nextBoolean();
    this.isRectangular = random.nextBoolean();;
    this.doesRattle = random.nextBoolean();;
  }

  public boolean couldBeLego(){
    return isRectangular && !isSoft && doesRattle;
  }

  public void printCouldBeLego(){
    if(couldBeLego()){
      System.out.println("Det er måske LEGO!!!");
    } else System.out.println("Æsj myk pakke...");
  }


  @Override
  public String toString() {
    return "Er julegaven myk? " + isSoft +
        ", er den firkantet? " + isRectangular +
        ", og kan den rasle? " + doesRattle;
  }




  public static void main(String[] args) {
    Julegave julegave = new Julegave();
    //System.out.println(julegave);

    julegave.couldBeLego();
    julegave.printCouldBeLego();

  }


}
