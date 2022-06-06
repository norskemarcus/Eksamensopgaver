package motherboard;

public class NoMoreSpaceInArray extends RuntimeException{

  public NoMoreSpaceInArray() {
    super("Det er ikke mere plads i arrayet!");
  }

  public NoMoreSpaceInArray(String message) {
    super(message);
  }
}
