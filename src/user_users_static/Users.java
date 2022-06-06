package user_users_static;
import java.util.ArrayList;

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
