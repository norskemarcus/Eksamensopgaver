package user_isLetter;

import java.util.Random;

public class User {
  private String fullName;
  private String userID;

  public User(String fullName, String userID) {
    this.fullName = fullName;
    this.userID = userID;
  }

  public boolean validUserId() {
    boolean valid = false;

    if (userID.length() == 8) {
      String letters = userID.substring(0, 4);
      String digits = userID.substring(4);

      valid = true;

      for (int i = 0; i < 4; i++) {
        if (!(Character.isLetter(letters.charAt(i)) && (Character.isLowerCase(letters.charAt(i))))) {
          valid = false;

          for (int j = 0; j < 4; j++) {
            if (!(Character.isDigit(digits.charAt(i)))) {
              valid = false;
            }
          }
        }
      }
    }
    return valid;
  }

  public String createUserID(){

    String[] userIdArray = fullName.split(" ");
    Random random = new Random();

    if (userIdArray.length > 2){
      String loLetters = userIdArray[0].substring(0,2);
      String nextLetters = userIdArray[2].substring(0,2);
      int randomNumber = random.nextInt(0000, 9999);

      userID = loLetters + nextLetters + randomNumber;
      return userID;

    } else{
      String tobogstaver = userIdArray[0].substring(0,2);
      String næsteToBogstaverFraEfternavn = userIdArray[1].substring(0,2);

      int randomNumber = random.nextInt(1000, 9999);
      userID = tobogstaver + næsteToBogstaverFraEfternavn + randomNumber;
      return userID;
    }
  }


  public static void main(String[] args) {

    User user = new User("Eva Møller", "abcd2345");
    User user2 = new User("Marcus Sebastian Holje", "abcd1234");
    //System.out.println(user.validUserId());

    for (int i = 0; i < 100 ; i++) {
      System.out.println(user.createUserID());
    }



  }

}