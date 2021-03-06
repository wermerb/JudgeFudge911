import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;

public class T_04_WriteSingleLine {
  public static void main(String[] args) {
    Path path = Paths.get("my-file.txt");

    String content = "Gábor Wermer";

    try {
      Files.write(path, content.getBytes());
      System.out.println("File is written");
    } catch (IOException e) {
      System.out.println("Unable to write file: " + path);
    }

  }
}
