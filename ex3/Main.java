class DatabaseConnection {
    private static DatabaseConnection instance;
    private boolean connected;

   void DatabaseConncetion() {
        connected = false;
    }
    // Méthode pour obtenir l'instance unique de la classe DatabaseSingleton
    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    // Méthode pour établir la connexion à la base de données
    public void connect() {
        if (!connected) {
            connected = true;
            System.out.println("Connexion établie avec la base de données");
        } else {
            System.out.println("La connexion à la base de données est déjà établie");
        }
    }}
public class Main {
    public static void main(String[] args) {
        DatabaseConnection database = DatabaseConnection.getInstance();

        database.connect();

        database.connect();

    }
}