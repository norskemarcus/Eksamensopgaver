package exceptionhandling;

public class InvalidNumberException extends RuntimeException{

  // Man kan skrive en default message her i selve min egen exception
  // eller man kan skrive en message når man skriver
  // throw new InvalidNumberException("Not a valid number");

  public InvalidNumberException(){
    super("Invalid number. It should be between 1 and 10");
  }

  public InvalidNumberException(String message){
    super(message);
  }


}
