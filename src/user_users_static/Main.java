package user_users_static;

public class Main {

  public static void main(String[] args) {

    Users users = new Users();
    users.addNewUser("Tommy", Role.ADMIN);
    users.addNewUser("Per", Role.ADMIN);
    users.addNewUser("Peter", Role.EDITOR);
    users.addNewUser("Tine", Role.READER);

    System.out.println("--------Admin-----------");
    System.out.println(users.displayListofSpecifikRole(Role.ADMIN));
    System.out.println("--------Editors-----------");
    System.out.println(users.displayListofSpecifikRole(Role.EDITOR));
    System.out.println("--------Reader-----------");
    System.out.println(users.displayListofSpecifikRole(Role.READER));

  }
}
