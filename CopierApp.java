import java.io.FileNotFoundException;

public class CopierApp {
    public static void main(String[] args) throws FileNotFoundException {
        Copier copier = new Copier();
        copier.connectPowerCordConnector();
        copier.turnOnStartButton();
        copier.turnOnScanner();
        copier.putSmthOnTable();
        copier.set_copy(true);
        copier.startCopping(true);
        copier.dispose();
        copier.turnOffScanner();
        copier.disconnectPowerCordConnector();
    }
}
