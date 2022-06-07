package personfilehandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandlerExam {


  public void saveToFile() {

  }

  public ArrayList<Person> loadFromFile() throws FileNotFoundException {

    ArrayList<Person> persons = new ArrayList<>();

    try {
      Scanner fileScanner = new Scanner(new File("medlemslisteExam.csv"));

      while (fileScanner.hasNextLine()) {

        String line = fileScanner.nextLine();

        Scanner lineScanner = new Scanner(line).useDelimiter(";");
        String name = lineScanner.next();
        int age = lineScanner.nextInt();

        Person person = new Person(name, age);
        persons.add(person);
      }
      fileScanner.close();

    } catch (FileNotFoundException f) {
      throw new FileNotFoundException();
    }
    return persons;
  }
}