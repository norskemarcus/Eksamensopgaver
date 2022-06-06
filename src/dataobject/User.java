package dataobject;

import javax.xml.crypto.Data;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class User implements DataObject {

  private int id;
  private String name;
  private String userName;
  ArrayList<DataObject> listOfUsersAndStudents = new ArrayList<>();
  private Student student;

  public User(int id, String name, String userName) {
    this.id = id;
    this.name = name;
    this.userName = userName;
  }

  @Override
  public int getId() {
    return id;
  }

  @Override
  public ArrayList<DataObject> getData() {
    return listOfUsersAndStudents;
  }

  public String getName() {
    return name;
  }

  public String getUserName() {
    return userName;
  }

  public ArrayList<DataObject> addData(DataObject object) {
    listOfUsersAndStudents.add(object);
    return listOfUsersAndStudents;
  }

  public ArrayList<DataObject> sortData(){

      Collections.sort(listOfUsersAndStudents);

      return listOfUsersAndStudents;
}

  public void saveListToFile(ArrayList<DataObject> listOfUsersAndStudents) throws FileNotFoundException {

    try{
      PrintStream out = new PrintStream("studentsAndUsers.csv");



      for (int i = 0; i < listOfUsersAndStudents.size(); i++) {



        if (listOfUsersAndStudents.get(i) instanceof User) {

          out.print((listOfUsersAndStudents.get(i)).getName());
          out.print(";");
          out.print((listOfUsersAndStudents.get(i)).getId());
          out.print(";");
          out.print(((User) listOfUsersAndStudents.get(i)).getUserName());
          out.print("\n");

        } else if (listOfUsersAndStudents.get(i) instanceof Student) {
          out.print((listOfUsersAndStudents.get(i)).getName());
          out.print(";");
          out.print((listOfUsersAndStudents.get(i)).getId());
          out.print(";");
          out.print(((Student) listOfUsersAndStudents.get(i)).getEmail());
          out.print("\n");
        }
      }

    } catch (FileNotFoundException fnfe){
      throw new FileNotFoundException();
    }

  }



  @Override
  public String toString(){
    return "Id: " + id + " , name: " + name  + " , username: " + userName;
  }

  public static void main(String[] args) {
    User user = new User (001, "Marcus", "skiordie");
    User user2 = new User (002, "Ola", "hoppla");
    User user3 = new User (003, "Tore", "gaze");

    Student student = new Student(004, "Tommy", "tommy@gmail.com");

    user.addData(user);
    user.addData(student);
    user.addData(user2);
    user.addData(user3);

    System.out.println(user.getData());

    System.out.println("Uden klammer:");

    for (int i = 0; i < user.getData().size(); i++) {
      System.out.println(user.getData().get(i));
    }

    System.out.println("----------Efter sortering:----------");

    user.sortData(); // HUSK AT FAKTISK SORTERE!!

    for (DataObject d: user.listOfUsersAndStudents){
      System.out.println(d);
    }

    try{
      user.saveListToFile(user.listOfUsersAndStudents);
    }catch (FileNotFoundException fileNotFoundException){
      fileNotFoundException.getMessage();
    }


  }




  @Override
  public int compareTo(DataObject o) {
    return getId() - o.getId();
  }
}
