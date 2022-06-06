package personfilehandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class FileHandler {

  private Person person;

  // Kunne skrive til en fil vha PrintStream
 public void saveToFile(Person person) throws FileNotFoundException {
   try{
     PrintStream out = new PrintStream("medlemsliste.csv");

     out.print(person.getFornavn() + " " + person.getEfternavn());
     out.print(";");
     out.print("\n");
     out.close();
   }
   catch (FileNotFoundException fnfe){
     throw new FileNotFoundException();
   }
 }

  // Kunne læse fra en fil vha Scanner
  public ArrayList<Person> loadFromFile() throws FileNotFoundException {

   ArrayList<Person> persons = new ArrayList<>();

  try{
    Scanner fileScanner = new Scanner(new File("medlemsliste.csv"));

    while(fileScanner.hasNextLine()){
      String line = fileScanner.nextLine();
      Scanner lineScanner = new Scanner(line).useDelimiter(";").useLocale(Locale.ENGLISH);

      String name = lineScanner.next();
      int age = lineScanner.nextInt();

      Person person = new Person(name, age);
      persons.add(person);
    }

     fileScanner.close();

  } catch (FileNotFoundException e){
    throw new FileNotFoundException();
  }
    return persons;
  }
}
