package eksamenstræning_codelab;

import java.util.ArrayList;

public class User implements Comparable<User> {

  private String name;


  public User(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return name;
  }

  @Override
  public int compareTo(User o) {
    return name.compareTo(o.getName());
  }
}
