interface Forme {
    void dessiner();
}

class Cercle implements Forme {
    public void dessiner() {
        System.out.println("Dessiner Cercle 1");
    }
    public void dessinerCercle() {
        System.out.println("Dessiner Cercle 2");
    }
}

class Rectangle implements Forme {
    public void dessiner() {
        System.out.println("Dessiner Rectangle 1");
    }
    public void dessinerRectangle() {
        System.out.println("Dessiner Rectangle 2");
    }
}

class CercleV1 implements Forme {
    private Cercle cercle = new Cercle();

    @Override
    public void dessiner() {
        cercle.dessiner();
    }

    public void dessinerCercle() {
        cercle.dessinerCercle();
    }
}

class CercleV2 extends CercleV1 {
    @Override
    public void dessinerCercle() {
        super.dessinerCercle();
    }
}

class RectangleV1 implements Forme {
    private Rectangle rectangle = new Rectangle();

    @Override
    public void dessiner() {
        rectangle.dessiner();
    }

    public void dessinerRectangle() {
        rectangle.dessinerRectangle();
    }
}

class RectangleV2 extends RectangleV1 {
    @Override
    public void dessinerRectangle() {
        super.dessinerRectangle();
    }
}

// Example usage
class DP1 implements Forme {
    private CercleV1 cercleV1 = new CercleV1();
    private RectangleV1 rectangleV1 = new RectangleV1();

    @Override
    public void dessiner() {
        cercleV1.dessiner();
        rectangleV1.dessiner();
    }
}
