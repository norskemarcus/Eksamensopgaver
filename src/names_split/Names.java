package names_split;


public class Names {

  private String firstName;
  private String middleName;
  private String lastName;


  public Names(String fullName){
    String[] names = fullName.split(" "); // Kan fx bruge semikolon eller /

    if(names.length > 2){
      firstName = names[0].substring(0,1).toUpperCase() + names[0].substring(1).toLowerCase();
      middleName = names[1].substring(0,1).toUpperCase() + names[0].substring(1).toLowerCase();;
      lastName = names[2].substring(0,1).toUpperCase() + names[0].substring(1).toLowerCase();;
    } else{
      firstName = names[0].substring(0,1).toUpperCase() + names[0].substring(1).toLowerCase();;
      lastName = names[1].substring(0,1).toUpperCase() + names[0].substring(1).toLowerCase();;
    }
    //System.out.println(firstName + " " + middleName + " " + lastName);

  }

  @Override
  public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(firstName).append(" ");

    if (middleName != null){
      s.append(middleName).append(" ");
    }

    s.append(lastName).append(" ");

    return s.toString();
  }



  public static void main(String[] args) {

    Names marcus = new Names("marcus sebastian holje");
    Names tommy = new Names("Tommy jensen");

    System.out.println(marcus);
    System.out.println(tommy);
  }

}

