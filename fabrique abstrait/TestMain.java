public class TestMain {
    public static void main(String[] args) {
        AbstractGUIFactory windowsFactory = new GUIFactoryWindows();
        AbstractGUIFactory linuxFactory = new GUIFactoryLinux();

        Client a = new Client(windowsFactory);
        Client b = new Client(linuxFactory);
    }
}