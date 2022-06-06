package personfilehandler;
// Dette er min egen exceptionklasse! Den arver fra Exception
// (Throwable er superklassen, den skal man ALDRIG throwe!)

public class MinEgenException extends Exception{

  public MinEgenException(String message) {
    super(message);
  }
}
