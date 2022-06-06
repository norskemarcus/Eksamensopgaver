package names_split;

public class NamesExam {

  private String firstName;
  private String middleName;
  private String lastName;

  public NamesExam(String fullName) {

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

    NamesExam name = new NamesExam("Marcus Holje");
    NamesExam name2 = new NamesExam("Marcus Sebastian Holje");


    System.out.println(name);
    System.out.println(name2);


  }


}
