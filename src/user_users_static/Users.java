package user_users_static;
import java.util.ArrayList;
/*
Lav en klasse User med attributterne: username, userid og role.
Role skal være an enum med værdierne: Admin, Editor, eller Reader.
Lav en anden klasse Users, der har en liste af user-objekter, og en metode der opretter en ny bruger.
Sørg for at den metode automatisk tildeler et nyt (tidligere ubrugt) userid til den nye bruger.
Tilføj en metode til Users, til at få en liste af alle brugere med en specifik rolle.

 */
public class Users {

  private FileHandlerUserId fileHandler;

  private ArrayList<User> listOfUsers = new ArrayList<>();
  private int newUserId = 0;

  public void addNewUser(String name, Role role){
    newUserId ++;
    User user = new User(name, newUserId, role);
    listOfUsers.add(user);
    //fileHandler.loadUserId();
  }

  public ArrayList<User> displayListofSpecifikRole(Role role){

    ArrayList<User> temp = new ArrayList<>();

    for (int i = 0; i < listOfUsers.size(); i++) {
      if(listOfUsers.get(i).getRole().equals(role)){
        temp.add(listOfUsers.get(i));
      }
    }
    return temp;
  }
}
