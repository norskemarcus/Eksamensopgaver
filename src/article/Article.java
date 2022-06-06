package article;

import java.util.ArrayList;


public class Article {

  private String heading;
  private String body;
  private String author;
  private String longestWord = " ";

  // Lav test-kode der sætter alle tre attributter. Så kan være settere i stedet for konstruktør!
  /*public Article(String heading, String body, String author) {
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

   */

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public void setHeading(String heading) {
    this.heading = heading;
  }


  // Returnerer det længste ord (uden tegn!) fra body
  public String getLongestWord() {

    String[] split = body.split(" ");

    for (String s : split) {

      if (s.length() > longestWord.length()) {
        longestWord = s;
      }
    }
      return longestWord;
    }





  // returnerer en liste af alle ord fra body
  // men hvor hvert ord kun forekommer en enkelt gang
  public ArrayList<String> getWords(){

    String[] split = body.split(" ");
    ArrayList<String> arrayList = new ArrayList<>();

    for (String s : split) {
      if (!arrayList.contains(s)) {
        arrayList.add(s);
      }
    }

    return arrayList;
  }

  @Override
  public String toString() {
    return "Heading: " + heading + "\n"
        + body + "\n"
        + "Forfatter: " + author + "\n";

  }

  public static void main(String[] args) {
    Article article = new Article();
    article.setHeading("Datamatikere i top");
    article.setBody("Dette er er en lang tekst, som som beskriver hvorfor datamatikere, er i top top top");
    article.setAuthor("Marcus Holje");
    System.out.println(article);

    System.out.println("ArrayList med klammer: " + article.getWords());
    System.out.println(" ");
    System.out.println("Det længste ordet : " + article.getLongestWord());
    System.out.println("");
    System.out.println("Print af liste uden klammer: ");
    for (int i = 0; i < article.getWords().size(); i++) {
      System.out.print(article.getWords().get(i) + " ");
    }


  }

}
