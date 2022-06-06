package keyword;

import java.util.ArrayList;

//TODO: IKKE FÆRDIG


public class Keyword {

  private String word;
  private String definition;
  private Keyword seeAlso;
  private ArrayList<Keyword> keywords = new ArrayList<Keyword>();;

  public Keyword(String word, String definition) {
    this.word = word;
    this.definition = definition;
  }


  public boolean matches(String search) {
    return(search.equals(word));
  }

  public boolean matches(Keyword keyword) {

    if (keyword.word.equals(word)) {
      return true;
    }
    return keyword.equals(word);
  }


  public ArrayList<Keyword> addKeyword(Keyword keyword) {
    keywords.add(keyword);
    return keywords;
  }

  public ArrayList<Keyword> getKeywords() {
    return keywords;
  }

  public String getWord() {
    return word;
  }

  public static void main (String[] args){

    Keyword keyword = new Keyword("Car", "A vehicle");
    Keyword keyword2 = new Keyword("Boat", "A boat");
    keyword.addKeyword(keyword);
    keyword.addKeyword(keyword2);


    // Test 1
    System.out.println("Does keyword match (true)? " + keyword.matches("Car"));
    // Test 2
    System.out.println("Does keyword match (true)? " + keyword2.matches("Boat"));
    // Test 3
    System.out.println("Does keyword match (false)? " + keyword.matches(keyword2));


    // Printe ud arrayList
    for (int i = 0; i < keyword.keywords.size(); i++) {
      System.out.println(keyword.getKeywords().get(i).getWord());
    }




  }


}
