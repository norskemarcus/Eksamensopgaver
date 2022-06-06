package eksamenstræning_codelab;

/* Opgave 1
Opgave 1:•Opret userklasse,  hvor en user  har et navn.
•Opret klassen  Main med en mainmetode.
•Opret 5 users  i en liste ved brug af et loop, hvor vi angiver deres navn til hver.
•Nu skal du printe  de forskellige  brugere ud ( med navn ).
•Nu skal du ændre den første brugers navn til ”Hans”.
•Vær sød at sorte userne.  Print herefter userne  ud.
•Vær sød at fjerne den 3 user.Print derefter userne  ud igen.
•Vær sød at erstatte første user i listen med useren ”Poul”.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main implements Comparable<User> {

  private ArrayList<User> listOfUsers = new ArrayList();
  private User user;


  public ArrayList<User> makeUsersWithLoop(){


    while(listOfUsers.size() < 5){

        System.out.print("Skriv ind navn på bruger: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        User user = new User(name);
        listOfUsers.add(user);

    }
    System.out.println("Du har nu oprettet 5 brugere");
    return listOfUsers;
  }

  public ArrayList<User> getListOfUsers() {
    return listOfUsers;
  }


  private void changeUserName(int index, String name) {
    listOfUsers.get(index).setName(name);
  }

  private void changeUser(int index, String name) {
    listOfUsers.set(index, new User(name));
  }



  private ArrayList<User> sortUsers(){
    Collections.sort(listOfUsers);
    return listOfUsers;
  }



  public static void main (String[]args){

    Main main = new Main();

    main.makeUsersWithLoop();

    main.printUsers();
    main.changeUserName(0, "Hans");
    System.out.println("Første navn i listen bliver til Hans");
    main.printUsers();
    main.sortUsers();
    System.out.println("--------Sorteret------------");
    main.printUsers();
    System.out.println("Fjerne den 3. user");
    main.getListOfUsers().remove(2);
    main.printUsers();
    System.out.println("Erstatte 1.user i listen med useren Poul");
    main.changeUser(0, "Poul");
    main.printUsers();

  }

  private void printUsers(){
    for (User user: getListOfUsers()) {
      System.out.println(user);
    }
  }

  @Override
  public int compareTo(User o) {
    return user.getName().compareTo(o.getName());
  }
}
