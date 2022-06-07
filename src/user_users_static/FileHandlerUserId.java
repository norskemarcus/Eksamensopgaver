package user_users_static;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class FileHandlerUserId {


  public int loadUserId()  {

    int userId = 0;

    try {
      Scanner fileScanner = new Scanner(new File("userId.txt"));

      int number = fileScanner.nextInt();
      userId = number;

    } catch (FileNotFoundException fnfe) {
      System.out.println("Fil ikke fundet");
    }
    return userId;
  }

  public void saveMemberNumberToFile(int userId) {

    try {
      PrintStream out = new PrintStream("userId.txt");
      out.print(userId);

    } catch (FileNotFoundException fnfe) {
      System.out.println("Fil ikke fundet");
    }
  }

}
