package julegave;

import java.util.Random;

public class Julegave {

  private boolean isSoft;
  private boolean isRectangular;
  private boolean doesRattle;

  public Julegave() {
    Random random = new Random();
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
    return "Julegave{" +
        "isSoft=" + isSoft +
        ", isRectangular=" + isRectangular +
        ", doesRattle=" + doesRattle +
        '}';
  }




  public static void main(String[] args) {
    Julegave julegave = new Julegave();
    System.out.println(julegave);

    julegave.couldBeLego();
    julegave.printCouldBeLego();

  }


}
