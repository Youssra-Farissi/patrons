public class Client {
    public static void main(String[] args) {
        // Creating instances of DP1 and DP2
        DP1 dessin1 = new DP1();
        DP2 dessin2 = new DP2();

        // Calling methods on dessin1
        dessin1.dessiner_une_ligne();
        dessin1.dessiner_un_cercle();

        // Calling methods on dessin2
        dessin2.dessiner_une_ligne();
        dessin2.dessiner_un_cercle();
    }
}
