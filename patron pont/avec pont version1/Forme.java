public abstract class Forme {

    public abstract void dessiner();
}
class Cercle extends Forme {
   
    Dessin dessin = new DessinV1();

    @Override
    public void dessiner() {
        System.out.println("Dessiner Cercle méthode 1");
    }
}

class Rectangle extends Forme {
    // Here, you can choose to instantiate the field if needed
    Dessin dessin = new DessinV1();

    @Override
    public void dessiner() {
        System.out.println("Dessiner Rectangle méthode 1");
    }
}
