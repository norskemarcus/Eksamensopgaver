package media;
/* Programmeringsøvelser 7 - Øvelse 18
Lav en abstrakt klasse Media med attributterne name og duration
Lav yderligere to klasser Audio og Video der arver fra Media. Audio har en loudness attribut med en værdi som fx -10.4dB. Video har en aspectRatio attribut med en værdi som fx “16:9” eller “3:4”.
Implementer funktionalitet der tager en liste af media-objekter (blandede Audio og Video) og skriver information om dem ud til en fil “mediainfo.txt”. Tilføj loudness og aspectRatio information til outputtet når muligt.

 */

public abstract class Media {
  protected String name;
  protected int duration;


  public Media(String name, int duration) {
    this.name = name;
    this.duration = duration;
  }




}
