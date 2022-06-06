package user_users_static;

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
