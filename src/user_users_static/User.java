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
  private static int lastUsedUserid = 1;

  public User(String userName, int userId, Role role){
    this.userName = userName;
    this.userId = lastUsedUserid ++;
    this.role = role;

  }

  public Role getRole(){
    return role;
  }


  @Override
  public String toString() {
    return  userName + " " + role + " " + userId ;

  }

}
