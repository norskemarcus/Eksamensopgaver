package keyword;

import java.util.ArrayList;
import java.util.Collections;

public class KeywordExam implements Comparable<KeywordExam>{

  private String word = "Hello";
  private String definition;
  private Keyword seeAlso;
  private ArrayList<KeywordExam> listOfKeywords = new ArrayList<>();

  public KeywordExam(String word){
    this.word = word;
  }


  public boolean matches(String searchWord){

    if(searchWord.equals(word)){
      return true;
    } else{
      return false;
    }
  }

  // Censor: Hvordan kan man lave metoden matches mere simpel?

  public boolean matches2(String searchWord){
   return searchWord.equals(word);
  }

  public ArrayList<KeywordExam> addKeyword(KeywordExam keyword){
    listOfKeywords.add(keyword);
    return listOfKeywords;
  }

  public ArrayList<KeywordExam> getListOfKeywords() {
    return listOfKeywords;
  }

  public String toString(){
    return word;
  }

  public String getWord() {
    return word;
  }

  public static void main(String[] args){

    //System.out.println(new KeywordExam().matches("World"));
    //System.out.println(new KeywordExam().matches2("World"));

    KeywordExam keywordExam = new KeywordExam("Hello");
    KeywordExam keywordExam2 = new KeywordExam("World");
    KeywordExam keywordExam3 = new KeywordExam("Planet calling");

    keywordExam.getListOfKeywords().add(keywordExam);
    keywordExam.getListOfKeywords().add(keywordExam2);
    keywordExam.getListOfKeywords().add(keywordExam3);

    System.out.println(keywordExam.getListOfKeywords());

    for (int i = 0; i < keywordExam.getListOfKeywords().size(); i++) {
      System.out.println(keywordExam.getListOfKeywords().get(i));

    }

    Collections.sort(keywordExam.getListOfKeywords());

    System.out.println("Efter sortering:");
    for (int i = 0; i < keywordExam.getListOfKeywords().size(); i++) {
      System.out.println(keywordExam.getListOfKeywords().get(i));

    }
  }


  @Override
  public int compareTo(KeywordExam o) {
    return word.compareTo(o.getWord());
  }
}
