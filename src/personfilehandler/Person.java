package personfilehandler;


import java.util.ArrayList;

public class Person {

  // OBS: You can also have an enum inside a class:
  enum Gender{
    MALE, FEMALE, NON_BINARY
  }

  private String fornavn;
  private String mellemnavn;
  private String efternavn;
  private Gender gender;
  private int age;
  private String fuldeNavn = "Marcus Sebastian Holje";
  private ArrayList<Person> persons = new ArrayList<>();
  public static int counter = 0;

// Den smarte måde
  public Person(String fullName, int age) {

    counter++;

    String[] names = fullName.split(" ");

    if(names.length > 2){
      fornavn = names[0];
      mellemnavn = names[1];
      efternavn = names[2];
    } else{
      fornavn = names[0];
      efternavn = names[1];
    }

  }


 // substrings og indexOf
  public void splitName(String fuldeNavn){
    // Finde fornavn. Fornavn er fra index til firstSpace
    int indexStartFornavn = fuldeNavn.indexOf(fuldeNavn);
    fornavn = fuldeNavn.substring(indexStartFornavn, fuldeNavn.indexOf(" "));

    // Finde mellemnavn. Mellemnavn er fra firstSpace+1 til lastSpace
    int indexStartMellemnavn = fuldeNavn.indexOf(" ")+1;
    int indexSlutMellemnavn = fuldeNavn.lastIndexOf(" ");
    mellemnavn = fuldeNavn.substring(indexStartMellemnavn, indexSlutMellemnavn);

    // Finde efternavn. Efternavn er fra lastSpace
    int indexStartEfternavn = fuldeNavn.lastIndexOf(" ")+1;
    efternavn = fuldeNavn.substring(indexStartEfternavn);
  }



  public String getFornavn() {
    return fornavn;
  }

  public String getMellemnavn() {
    return mellemnavn;
  }

  public String getEfternavn() {
    return efternavn;
  }

  public ArrayList<Person> getPersons() {
    return persons;
  }

  public String toString(){

      StringBuilder sb = new StringBuilder();

      sb.append(fornavn).append(" ");

      if(mellemnavn != null){
        sb.append(mellemnavn).append(" ");
      }
      sb.append(efternavn).append(" ");

      return sb.toString();
    }
}
