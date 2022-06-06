package names_split;

// Name-parts - II - metoden writeNameParts der man bruger substring og indexOf
// Brug heller kun split - se Names

public class WriteNameParts {

  private String firstName;
  private String middleName;
  private String lastName;

  public WriteNameParts(String fullName){

    String[] names = fullName.split(" ");

    if (names.length > 2){
      int indexFirstName = fullName.indexOf(fullName);
      firstName = fullName.substring(indexFirstName, fullName.indexOf(" "));

      int indexMiddleName = fullName.indexOf(" ")+1;
      int endMiddleName = fullName.lastIndexOf(" ");
      middleName = fullName.substring(indexMiddleName, endMiddleName);

      int indexStartLastName = fullName.lastIndexOf(" ")+1;
      lastName = fullName.substring(indexStartLastName);

    } else{
      int indexFirstName = fullName.indexOf(fullName);
      firstName = fullName.substring(indexFirstName, fullName.indexOf(" "));

      int indexStartLastName = fullName.lastIndexOf(" ")+1;
      lastName = fullName.substring(indexStartLastName);
    }
  }

  @Override
  public String toString() {

    if (middleName != null){
      return firstName + " " + middleName + " " + lastName;
    } else return firstName + " " + lastName;

  }



  public static void main(String[] args) {

    WriteNameParts marcus = new WriteNameParts("marcus sebastian holje");
    WriteNameParts tommy = new WriteNameParts("Tommy Jensen");

    System.out.println(marcus);
    System.out.println(tommy);
  }

}

