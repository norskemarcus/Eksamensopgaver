package media;
/* Programmeringsøvelser 7 - Øvelse 18
Lav en abstrakt klasse Media med attributterne name og duration
Lav yderligere to klasser Audio og Video der arver fra Media. Audio har en loudness attribut med en værdi som fx -10.4dB. Video har en aspectRatio attribut med en værdi som fx “16:9” eller “3:4”.
Implementer funktionalitet der tager en liste af media-objekter (blandede Audio og Video) og skriver information om dem ud til en fil “mediainfo.txt”. Tilføj loudness og aspectRatio information til outputtet når muligt.

 */
public class Audio extends Media {

  private String loudness; // med en værdi som fx -10.4dB

  public Audio(String name, int duration, String loudness) {
    super(name, duration);
    this.loudness = loudness;
  }


  public String getLoudness() {
    return loudness;
  }

  @Override
  public String toString() {
    return "Audio{" +
        "loudness='" + loudness + '\'' +
        ", name='" + name + '\'' +
        ", duration=" + duration +
        '}';
  }
}
