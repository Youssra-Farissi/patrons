
class Caracteristiques {
    String couleur;
    String largeur;
    String hauteur;

    public Caracteristiques(String couleur, String largeur, String hauteur) {
        this.couleur = couleur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getLargeur() {
        return largeur;
    }

    public String getHauteur() {
        return hauteur;
    }
}

class OSComposants {
    Caracteristiques caracteristiques;

    public OSComposants(Caracteristiques caracteristiques) {
        this.caracteristiques = caracteristiques;
    }

    public Caracteristiques getCaracteristiques() {
        return caracteristiques;
    }
}

abstract class Menu extends OSComposants {
    public Menu(Caracteristiques caracteristiques) {
        super(caracteristiques);
    }

    public abstract void afficherMenu();
}

abstract class Bouton extends OSComposants {
    public Bouton(Caracteristiques caracteristiques) {
        super(caracteristiques);
    }

    public abstract void cliquerBouton();
}

class WindowsBouton extends Bouton {
    public WindowsBouton(Caracteristiques caracteristiques) {
        super(caracteristiques);
    }

    @Override
    public void cliquerBouton() {
        System.out.println("Bouton Windows cliqué");
    }
}

class LinuxBouton extends Bouton {
    public LinuxBouton(Caracteristiques caracteristiques) {
        super(caracteristiques);
    }

    @Override
    public void cliquerBouton() {
        System.out.println("Bouton Linux cliqué");
    }
}

class MacOSBouton extends Bouton {
    public MacOSBouton(Caracteristiques caracteristiques) {
        super(caracteristiques);
    }

    @Override
    public void cliquerBouton() {
        System.out.println("Bouton MacOS cliqué");
    }
}

class WindowsMenu extends Menu {
    public WindowsMenu(Caracteristiques caracteristiques) {
        super(caracteristiques);
    }

    @Override
    public void afficherMenu() {
        System.out.println("Menu Windows affiché");
    }
}

class MacOSMenu extends Menu {
    public MacOSMenu(Caracteristiques caracteristiques) {
        super(caracteristiques);
    }

    @Override
    public void afficherMenu() {
        System.out.println("Menu MacOS affiché");
    }
}

class LinuxMenu extends Menu {
    public LinuxMenu(Caracteristiques caracteristiques) {
        super(caracteristiques);
    }

    @Override
    public void afficherMenu() {
        System.out.println("Menu Linux affiché");
    }
}

public class Pont{
    public static void main(String[] args) {
        Caracteristiques caracteristiquesWindows = new Caracteristiques("rouge", "100px", "50px");
        WindowsBouton boutonWindows = new WindowsBouton(caracteristiquesWindows);
        WindowsMenu menuWindows = new WindowsMenu(caracteristiquesWindows);

        Caracteristiques caracteristiquesMacOS = new Caracteristiques("bleu", "80px", "40px");
        MacOSBouton boutonMacOS = new MacOSBouton(caracteristiquesMacOS);
        MacOSMenu menuMacOS = new MacOSMenu(caracteristiquesMacOS);

        // Exemple d'utilisation
        boutonWindows.cliquerBouton();
        menuWindows.afficherMenu();
        boutonMacOS.cliquerBouton();
        menuMacOS.afficherMenu();
    }
}