package media;
/* Programmeringsøvelser 7 - Øvelse 18
Lav en abstrakt klasse Media med attributterne name og duration
Lav yderligere to klasser Audio og Video der arver fra Media. Audio har en loudness attribut med en værdi som fx -10.4dB. Video har en aspectRatio attribut med en værdi som fx “16:9” eller “3:4”.

Implementer funktionalitet der tager en liste af media-objekter (blandede Audio og Video) og skriver information om dem ud til en fil “mediainfo.txt”.
Tilføj loudness og aspectRatio information til outputtet når muligt.

 */
public class Video extends Media {

  private String aspectRatio; // med en værdi som fx “16:9” eller “3:4”.

  public Video(String name, int duration, String aspectRatio) {
    super(name, duration);
    this.aspectRatio = aspectRatio;
  }

  public String getAspectRatio() {
    return aspectRatio;
  }

  @Override
  public String toString() {
    return "Video{" +
        "name='" + name + '\'' +
        ", duration=" + duration +
        ", aspectRatio='" + aspectRatio + '\'' +
        '}';
  }
}
