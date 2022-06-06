package names_split;

public class Names {

  private String firstName;
  private String middleName;
  private String lastName;

  public Names(String fullName) {

    String[] names = fullName.split(" ");

    if (names.length > 2) {
      firstName = names[0];
      middleName = names[1];
      lastName = names[2];
    } else {
      firstName = names[0];
      lastName = names[1];
    }
  }

  public String toString() {

    StringBuilder sb = new StringBuilder();

    sb.append(firstName).append(" ");

    if (middleName != null) {
      sb.append(middleName).append(" ");
    }

    sb.append(lastName).append(" ");

    return sb.toString();
  }


  public static void main (String[] args){

    Names name = new Names("Marcus Holje");
    Names name2 = new Names("Marcus Sebastian Holje");


    System.out.println(name);
    System.out.println(name2);


  }


}
