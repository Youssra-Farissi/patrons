public class Client {
    public Client(AbstractGUIFactory factory) {
        Bouton bouton = factory.createButton();
        bouton.dessine();
    }
}