//celle ci c la version 3
interface Forme_trois {
    void dessiner();
}

class Cercle implements Forme_trois {
    @Override
    public void dessiner() {
        System.out.println("Dessiner Cercle méthode 1");
    }

    public void dessinerCercle() {
        System.out.println("Dessiner Cercle méthode 2");
    }
}

class Rectangle implements Forme_trois {
    @Override
    public void dessiner() {
        System.out.println("Dessiner Rectangle méthode 1");
    }

    public void dessinerRectangle() {
        System.out.println("Dessiner Rectangle méthode 2");
    }
}

class Carre implements Forme_trois {
    @Override
    public void dessiner() {
        System.out.println("Dessiner Carre méthode 1");
    }

    public void dessinerCarre() {
        System.out.println("Dessiner Carre méthode 2");
    }
}

class CercleV1 extends Cercle {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}
class CercleV2 extends Cercle {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}
class CercleV3 extends Cercle {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}

class RectangleV1 extends Rectangle {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}
class RectangleV2 extends Rectangle {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}
class RectangleV3 extends Rectangle {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}

class CarreV1 extends Carre {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}
class CarreV2 extends Carre {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}
class CarreV3 extends Carre {
    @Override
    public void dessiner() {
        super.dessiner();
    }
}


class DP1 implements Forme_trois {
    private CercleV1 cercleV1;
    private RectangleV1 rectangleV1;
    private CarreV1 carreV1;

    public DP1() {
        cercleV1 = new CercleV1();
        rectangleV1 = new RectangleV1();
        carreV1 = new CarreV1();
    }

    @Override
    public void dessiner() {
        cercleV1.dessiner();
        rectangleV1.dessiner();
        carreV1.dessiner();
    }
}

class DP2 implements Forme_trois {
    private CercleV2 cercleV2;
    private RectangleV2 rectangleV2;
    private CarreV2 carreV2;

    public DP2() {
        cercleV2 = new CercleV2();
        rectangleV2 = new RectangleV2();
        carreV2 = new CarreV2();
    }

    @Override
    public void dessiner() {
        cercleV2.dessiner();
        rectangleV2.dessiner();
        carreV2.dessiner();
    }
}

class DP3 implements Forme_trois {
    private CercleV3 cercleV3;
    private RectangleV3 rectangleV3;
    private CarreV3 carreV3;

    public DP3() {
        cercleV3 = new CercleV3();
        rectangleV3 = new RectangleV3();
        carreV3 = new CarreV3();
    }

    @Override
    public void dessiner() {
        cercleV3.dessiner();
        rectangleV3.dessiner();
        carreV3.dessiner();
    }
}