abstract class Dessin {
    abstract void dessinerLigne();
    abstract void dessinerCercle();
}

class DessinV1 extends Dessin {
    @Override
    public void dessinerLigne() {
        System.out.println("Dessiner ligne méthode 1");
    }
    @Override
    public void dessinerCercle() {
        System.out.println("Dessiner Cercle méthode 1");
    }
}

class DessinV2 extends Dessin {
    @Override
    public void dessinerLigne() {
        System.out.println("Dessiner ligne méthode 2");
    }

    @Override
    public void dessinerCercle() {
        System.out.println("Dessiner Cercle méthode 2");
    }
}

class DP1 {
    private DessinV1 dessinV1;

    public DP1() {
        dessinV1 = new DessinV1();
    }

    public void dessiner_une_ligne() {
        dessinV1.dessinerLigne();
    }

    public void dessiner_un_cercle() {
        dessinV1.dessinerCercle();
    }
}

class DP2 {
    private DessinV2 dessinV2;

    public DP2() {
        dessinV2 = new DessinV2();
    }

    public void dessiner_une_ligne() {
        dessinV2.dessinerLigne();
    }

    public void dessiner_un_cercle() {
        dessinV2.dessinerCercle();
    }
}
class DessinV3 extends Dessin {
    @Override
    public void dessinerLigne() {
        System.out.println("Dessiner ligne méthode 3");
    }

    @Override
    public void dessinerCercle() {
        System.out.println("Dessiner Cercle méthode 3");
    }
}

class DessinV4 extends Dessin {
    @Override
    public void dessinerLigne() {
        System.out.println("Dessiner ligne méthode 4");
    }

    @Override
    public void dessinerCercle() {
        System.out.println("Dessiner Cercle méthode 4");
    }
}