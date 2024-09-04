public class Client {
    public Client() {
        UseSingleton();
    }
    public void UseSingleton() {
        Singleton S1 = Singleton.getInstance();
        Singleton S2 = Singleton.getInstance();
        System.out.println(S1);
        System.out.println(S2);
    }
}