package user_isLetter;

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


  public static void main(String[] args) {
    User user = new User("Eva Møller", "abcd2345");
    System.out.println(user.validUserId());
  }

}