package article;

import java.util.Arrays;
import java.util.Comparator;
//TODO: Hvordan løse denne på en nemmere måde uden at bruge Stream? Jonatan havde en løsning

public class Article {

  private String heading;
  private String body;
  private String author;
  private String longestWord = " ";

  public Article(String heading, String body, String author) {
    this.heading = heading;
    this.body = body;
    this.author = author;
  }

  // Med stream
  public String getLongestWord(){

    String s = body;
    String longest = Arrays.stream(s.split(" "))
        .max(Comparator.comparingInt(String::length))
        .orElse(null);
    return longest;
  }

// Med split
  public String getLongestWordUdenStream() {

    String[] split = body.split(" ");

    for (int i = 0; i < split.length; i++) {

      if (split[i].length() > longestWord.length()) {
        longestWord = split[i];
      }
    }
    return longestWord;
  }

  public String[] getWords(){

    String[] stringArray = null;
    body.split(" ");
    stringArray = body.split(" ");
    return stringArray;
  }

  @Override
  public String toString() {
    return "Heading: " + heading + "\n"
        + body + "\n"
        + "Forfatter: " + author + "\n";

  }

  public static void main(String[] args) {
    Article article = new Article("Datamatikere i top",
        "Dette er en lang tekst som beskriver hvorfor datamatikere er i top",
        "Marcus Holje");
    System.out.println(article);
    //System.out.println("Longest word: " + article.getLongestWord());


    // Splitte en lang tekst op og lægge det ind i et array
    String[] listeMedOrd = article.getWords();

    System.out.println("Longest word uden stream: " + article.getLongestWordUdenStream());

    /*for (int i = 0; i < article.getWords().length; i++) {
      System.out.println(listeMedOrd[i]);
    }

     */
  }

}
