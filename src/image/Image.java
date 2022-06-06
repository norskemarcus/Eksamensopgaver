package image;

public class Image {
  // Øvelse 14
  private String fileName;
  private int width;
  private int height;

  public Image(String fileName, int width, int height) {
    this.fileName = fileName;
    this.width = width;
    this.height = height;
  }

  public boolean isKnownFileType(){
    return fileName.endsWith(".gif") || (fileName.endsWith("jpg")) || (fileName.endsWith("png")) || (fileName.endsWith("webp")) || (fileName.endsWith("bmp"));
    /*
      if (fileName.endsWith(".gif") || (fileName.endsWith("jpg")) || (fileName.endsWith("png")) || (fileName.endsWith("webp")) || (fileName.endsWith("bmp"))) {
    return true;
    } else return false;
     */
  }

  public boolean isPortrait(){
    //returnerer true hvis billedet er højere end det er bredt
    return height > width;
  }

  public boolean isLandscape(){
    //returnerer true hvis billedet er bredere end det er højt
    return height < width;
  }


  public static void main(String[] args) {
    Image image = new Image("bom", 200, 400);
    System.out.println("isKnownFileType? " + image.isKnownFileType());
    System.out.println("isPortrait? " + image.isPortrait());
    System.out.println("isLandscape? " + image.isLandscape());
  }
}
