package user_users_static;
/*
Lav en klasse User med attributterne: username, userid og role.
Role skal være an enum med værdierne: Admin, Editor, eller Reader.
Lav en anden klasse Users, der har en liste af user-objekter, og en metode der opretter en ny bruger.
Sørg for at den metode automatisk tildeler et nyt (tidligere ubrugt) userid til den nye bruger.
Tilføj en metode til Users, til at få en liste af alle brugere med en specifik rolle.

 */
public class User {
  private String userName;
  private int userId;
  private Role role;
 // private static int lastUsedUserid = 1;
  FileHandlerUserId fileHandlerUserId = new FileHandlerUserId();

  public User(String userName, Role role){ //int userId,
    this.userName = userName;
    this.userId = fileHandlerUserId.loadUserId();
    // this.userId = lastUsedUserid ++;
    this.role = role;
  }

  public Role getRole(){
    return role;
  }

  public int getUserId() {
    return userId;
  }

  @Override
  public String toString() {
    return  userName + " " + role + " " + userId ;

  }

}
