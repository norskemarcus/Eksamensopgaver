package beer;

public class NegativeNumberException extends RuntimeException {

/*
  public NegativeNumberException(){
    super("Prisen kan ikke være negativ");
  }


 */

  public NegativeNumberException(String message){
    super(message);
  }

}
