package school.hei.storedint.endpoint.rest.controller.storedint;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Random;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StoredIntController {

  private static final Path FILE_PATH =
      Path.of(System.getProperty("java.io.tmpdir"), "stored-int.txt");

  @GetMapping("/stored-int")
  public String getStoredInt() {
    try {
      if (Files.exists(FILE_PATH)) {
        return Files.readString(FILE_PATH).trim();
      } else {
        int randomNumber = new Random().nextInt(1000);
        Files.writeString(FILE_PATH, String.valueOf(randomNumber));
        return String.valueOf(randomNumber);
      }
    } catch (IOException e) {
      throw new RuntimeException("Erreur lors de l'accès au fichier stored-int.txt", e);
    }
  }
}
