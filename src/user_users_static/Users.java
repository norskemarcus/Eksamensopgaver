package user_users_static;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

// TODO: OBS forsøgt at lave en Filehander til at behandle userId. Men nu får alle nr. 3...
/*
Lav en klasse User med attributterne: username, userid og role.
Role skal være an enum med værdierne: Admin, Editor, eller Reader.
Lav en anden klasse Users, der har en liste af user-objekter, og en metode der opretter en ny bruger.
Sørg for at den metode automatisk tildeler et nyt (tidligere ubrugt) userid til den nye bruger.
Tilføj en metode til Users, til at få en liste af alle brugere med en specifik rolle.

 */
public class Users {

  private final FileHandlerUserId fileHandler = new FileHandlerUserId();
  private int userId;

  private ArrayList<User> listOfUsers = new ArrayList<>();
  //private int newUserId = 0;


  public int loadMemberNumber()  {
    userId = fileHandler.loadUserId();
    return userId;
  }


  public void addNewUser(String name, Role role){

    //newUserId ++;
    userId = loadMemberNumber();
    User user = new User(name, role); // newUserId,
    listOfUsers.add(user);
    saveMemberNumberToFile();
    membershipCounter();
  }

  public void saveMemberNumberToFile() {
    fileHandler.saveMemberNumberToFile(userId);
  }


  private void membershipCounter() {
    userId++;
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
