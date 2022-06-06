package dataobject;

import java.util.ArrayList;

public class Student implements DataObject {

  private int id;
  private String name;
  private String email;


  public Student(int id, String name, String email) {
    this.id = id;
    this.name = name;
    this.email = email;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public String getName() {
    return null;
  }

  public String getEmail() {
    return email;
  }

  @Override
  public String toString(){
    return "Id: " + id + " , name: " + name  + " , email: " + email;
  }

  @Override
  public ArrayList<DataObject> getData() {
    return null;
  }

  @Override
  public int compareTo(DataObject o) {
    return getId() - o.getId();
  }
}
