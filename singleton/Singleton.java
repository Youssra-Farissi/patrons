public class Singleton {
    /* Instance unique non préinitialisée */
    private static Singleton instance = null;
    /* constructeur en privé pour intérdire l'instanciation de classe de l'extérieur */
    private Singleton() {}
    /* Point d'accès pour l'instance unique du Singleton */
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();
    
        System.out.println(singletonInstance1 == singletonInstance2); 
    
    }
}