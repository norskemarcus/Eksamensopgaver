package small_exercices;

public class Capitalization {
  /*
  Du skal lave et program der kan ændre en vilkårlig streng til at det tredje bogstav er stort, og alle de andre er små. Så for eksempel “peter” eller “PETER” eller “Peter” alle bliver til “peTer”
  Øvelsen skal løses ved hjælp af de forskellige substring, toUpperCase og toLowerCase metoder.
  */



  public void capitalizeName(String name){
/*
    String toBogstaver = name.substring(0,2);
    toBogstaver = toBogstaver.toLowerCase();

    String tredjeBogstav = name.substring(2,3);
    tredjeBogstav = tredjeBogstav.toUpperCase();

    String resten = name.substring(3);
    resten = resten.toLowerCase();
    System.out.println(toBogstaver + tredjeBogstav + resten);

 */

    // Første bogstav altid stor
    String førstebogstav = name.substring(0,1);
    førstebogstav = førstebogstav.toUpperCase();
    String restenAfNavnet = name.substring(1);
    restenAfNavnet = restenAfNavnet.toLowerCase();

    System.out.println(førstebogstav+restenAfNavnet);

  }

  public void capitalize(String name){

    System.out.println(name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase());

  }

  public static void main(String[] args) {
    Capitalization capitalization = new Capitalization();
    capitalization.capitalizeName("marcus holje");

    capitalization.capitalize("marcus holje");

  }

}
