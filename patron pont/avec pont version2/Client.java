public class Client {
    public static void main(String[] args) {
        // Creating instances of DP1, DP2, DP3, and DP4
        DP1 dessin1 = new DP1();
        DP2 dessin2 = new DP2();
        DP3 dessin3 = new DP3();
        DP4 dessin4 = new DP4();

        // Calling methods on dessin1
        dessin1.dessiner_une_ligne();
        dessin1.dessiner_un_cercle();

        // Calling methods on dessin2
        dessin2.dessiner_une_ligne();
        dessin2.dessiner_un_cercle();

        // Calling methods on dessin3
        dessin3.dessiner_une_ligne();
        dessin3.dessiner_un_cercle();

        // Calling methods on dessin4
        dessin4.dessiner_une_ligne();
        dessin4.dessiner_un_cercle();
    }
}
