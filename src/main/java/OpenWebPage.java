import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class OpenWebPage {
    public static void main(String[] args) {
        try {
            // Créer un objet Desktop
            Desktop desktop = Desktop.getDesktop();
            // Spécifier l'URL à ouvrir
            URI uri = new URI("http://localhost:63342/ProjetJavaNoSql/src/main/java/Test/index.html?_ijt=34bd08atbrlm4e88mgh1qfcfdi&_ij_reload=RELOAD_ON_SAVE");
            // Ouvrir l'URL avec le navigateur par défaut
            desktop.browse(uri);
        } catch (IOException | URISyntaxException e) {
            // Gérer les exceptions
            e.printStackTrace();
        }
    }
}
