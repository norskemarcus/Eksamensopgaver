package media;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;

/* Programmeringsøvelser 7 - Øvelse 18
Lav en abstrakt klasse Media med attributterne name og duration
Lav yderligere to klasser Audio og Video der arver fra Media. Audio har en loudness attribut med en værdi som fx -10.4dB. Video har en aspectRatio attribut med en værdi som fx “16:9” eller “3:4”.
Implementer funktionalitet der tager en liste af media-objekter (blandede Audio og Video) og skriver information om dem ud til en fil “mediainfo.txt”. Tilføj loudness og aspectRatio information til outputtet når muligt.

 */
public class Main {

  ArrayList<Media> mediaListe = new ArrayList<>();

  public void addMediaToFile(){

    try {
      PrintStream out = new PrintStream("mediainfo.txt");

      for (Media media:mediaListe) {
        if (media instanceof Video){

          String aspectRatio = ((Video) media).getAspectRatio();
          out.println("Video: " + media.name + " " + media.duration + "min " + " aspect ratio: " + aspectRatio);

        } else if (media instanceof Audio){
          String loudness = ((Audio)media).getLoudness();
          out.println("Audio: " + media.name + " " + media.duration + "min " + " loudness: " + loudness);

        } else{
          out.println(media.name + media.duration);
          System.out.println(media.name + media.duration + "min ");
        }
      }
      out.close();

  } catch (FileNotFoundException e) {
      System.err.println("Filen blev ikke fundet");
    }
  }


  public static void main(String[] args) {

    Main main = new Main();
    Video video = new Video("Batman", 120, "16:9");
    Audio audio = new Audio("Eminem", 4, "12.2db");

    main.mediaListe.add(video);
    main.mediaListe.add(audio);

    main.addMediaToFile();




  }
}
