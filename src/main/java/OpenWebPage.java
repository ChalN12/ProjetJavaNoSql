import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenWebPage {
    public static void main(String[] args) {
        try {
            // Créer un objet Desktop
            Desktop desktop = Desktop.getDesktop();
            // Spécifier le chemin du fichier HTML à ouvrir
            File file = new File("src/main/java/front.html");
            // Ouvrir le fichier HTML avec le navigateur par défaut
            desktop.browse(file.toURI());
        } catch (IOException e) {
            // Gérer les exceptions
            e.printStackTrace();
        }
    }
}
