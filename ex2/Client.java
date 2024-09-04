package ex2;

interface Button {
    void getCharacteristics();
}

interface Menu {
    void getCharacteristics();
}

abstract class AbstractFactory {
    abstract Button createButton();
    abstract Menu createMenu();
}

class WindowsFactory extends AbstractFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Menu createMenu() {
        return new WindowsMenu();
    }
}

class LinuxFactory extends AbstractFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Menu createMenu() {
        return new LinuxMenu();
    }
}

class MacOSFactory extends AbstractFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Menu createMenu() {
        return new MacOSMenu();
    }
}

class WindowsButton implements Button {
    @Override
    public void getCharacteristics() {
        System.out.println("Windows Button Characteristics");
    }
}

class WindowsMenu implements Menu {
    @Override
    public void getCharacteristics() {
        System.out.println("Windows Menu Characteristics");
    }
}

class LinuxButton implements Button {
    @Override
    public void getCharacteristics() {
        System.out.println("Linux Button Characteristics");
    }
}

class LinuxMenu implements Menu {
    @Override
    public void getCharacteristics() {
        System.out.println("Linux Menu Characteristics");
    }
}

class MacOSButton implements Button {
    @Override
    public void getCharacteristics() {
        System.out.println("MacOS Button Characteristics");
    }
}

class MacOSMenu implements Menu {
    @Override
    public void getCharacteristics() {
        System.out.println("MacOS Menu Characteristics");
    }
}

public class Client {
    public static void main(String[] args) {
        AbstractFactory windowsFactory = new WindowsFactory();
        Button windowsButton = windowsFactory.createButton();
        Menu windowsMenu = windowsFactory.createMenu();
        windowsButton.getCharacteristics();
        windowsMenu.getCharacteristics();

        AbstractFactory linuxFactory = new LinuxFactory();
        Button linuxButton = linuxFactory.createButton();
        Menu linuxMenu = linuxFactory.createMenu();
        linuxButton.getCharacteristics();
        linuxMenu.getCharacteristics();

        AbstractFactory macOSFactory = new MacOSFactory();
        Button macOSButton = macOSFactory.createButton();
        Menu macOSMenu = macOSFactory.createMenu();
        macOSButton.getCharacteristics();
        macOSMenu.getCharacteristics();
    }
}

