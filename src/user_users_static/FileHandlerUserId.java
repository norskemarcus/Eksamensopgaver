package user_users_static;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlerUserId {


  public int loadUserId(){

    int userId = 1;

    Scanner fileScanner = new Scanner("user_users_static/userId.txt");

    userId = fileScanner.nextInt();

    return userId;
  }


}
