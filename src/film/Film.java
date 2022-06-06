package film;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
Lav en klasse Film med attributter for filmtitel og udgivelsesår.

Tilføj en konstruktør der modtager en filmtitel og et udgivelsesår og en anden konstruktør der kun modtager filmtitel og selv sætter udgivelsesåret til det aktuelle år.

Tilføj en klasse Producer, og giv Film klassen mulighed for at ”koble” en producer til en film.

 */
public class Film {

  private static Comparator<Film> yearComparator = Comparator.comparing(Film::getUdgivelsesår)
      .thenComparing(Film::getFilmtitel);

  private String filmtitel;
  private int udgivelsesår;
  private Producer producer;
  private ArrayList<Film> filmer = new ArrayList<>();


  public Film(String filmtitel){
    this.filmtitel = filmtitel;
    this.udgivelsesår = LocalDate.now().getYear();
  }


  public Film(String filmtitel, int udgivelsesår){
    this.filmtitel = filmtitel;
    this.udgivelsesår = udgivelsesår;
  }

  public Film(String filmtitel, int udgivelsesår, String producer){
    this.filmtitel = filmtitel;
    this.udgivelsesår = udgivelsesår;
    this.producer = new Producer(producer);
  }


  public ArrayList<Film> addFilm(Film film){
    filmer.add(film);
    return filmer;
  }

  public ArrayList<Film> getFilmer() {
    return filmer;
  }

  public int getUdgivelsesår() {
    return udgivelsesår;
  }

  public Producer getProducer() {
    return producer;
  }

  public String getFilmtitel() {
    return filmtitel;
  }

  public ArrayList<Film> sortFilms(){
    //FilmComparator filmComparator = new FilmComparator();

    // Nyeste måde:
    //filmer.sort(new FilmComparator());

    filmer.sort(yearComparator);
    //Collections.sort(filmer, filmComparator);
    return filmer;
  }


  @Override
  public String toString() {
    if (producer == null){
      return "Film: " + filmtitel + " " + udgivelsesår + "\n";
    } else{
      return "Film: " + filmtitel + " " + udgivelsesår + " " + producer + "\n";
    }
  }

  public static void main(String[] args) {

    Film film = new Film("X-bond", 2000);
    Film film2 = new Film("A-bond", 1980);
    Film film3 = new Film("C-bond", 1990);
    Film film4 = new Film("D-bond", 1970);
    Film menInBlack = new Film("Men in Black", 1997, "Steven Spielberg");
    Film jurassicPark = new Film("Jurassic Park", 1996, "Steven Spielberg");

    //System.out.println(film);//
    //System.out.println(menInBlack);
    //System.out.println(jurassicPark);

    film.addFilm(film);
    film.addFilm(menInBlack);
    film.addFilm(jurassicPark);
    film.addFilm(film2);
    film.addFilm(film3);
    film.addFilm(film4);
    System.out.println(film.getFilmer());
    film.sortFilms();
    System.out.println(film.getFilmer());

  }
/*
  @Override
  public int compareTo(Film o) {
    return udgivelsesår - o.udgivelsesår;
  }


 */

  public int compareTo(Film o) {
    return filmtitel.compareTo(o.filmtitel);
  }


}
