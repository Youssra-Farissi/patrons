abstract class Bouton {
    abstract void dessine();
}

abstract class Menu {
    abstract void actionMenu();
}

class BoutonWindows extends Bouton {
    @Override
    void dessine() {
        System.out.println("Bouton Windows ");
    }
}

class BoutonLinux extends Bouton {
    @Override
    void dessine() {
        System.out.println("Bouton Linux ");
    }
}

class MenuWindows extends Menu {
    @Override
    void actionMenu() {
        System.out.println("Action du menu Windows");
    }
}

class MenuLinux extends Menu {
    @Override
    void actionMenu() {
        System.out.println("Action du menu Linux");
    }
}

interface AbstractGUIFactory {
    Bouton createButton();
    Menu createMenu();
}

class GUIFactoryWindows implements AbstractGUIFactory {
    @Override
    public Bouton createButton() {
        return new BoutonWindows();
    }

    @Override
    public Menu createMenu() {
        return new MenuWindows();
    }
}

class GUIFactoryLinux implements AbstractGUIFactory {
    @Override
    public Bouton createButton() {
        return new BoutonLinux();
    }

    @Override
    public Menu createMenu() {
        return new MenuLinux();
    }
}