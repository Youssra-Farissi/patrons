package ex4;

interface PaymentMethod {
    void payer();
}
class Visa implements PaymentMethod {
    private String nom;
    private String numero;

    public Visa(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }

    @Override
    public void payer() {
        System.out.println("Paiement par Visa effectué");
    }
}
class MasterCard implements PaymentMethod {
    private String numero;
    private int codeSecurite;

    public MasterCard(String numero, int codeSecurite) {
        this.numero = numero;
        this.codeSecurite = codeSecurite;
    }

    @Override
    public void payer() {
        System.out.println("Paiement par MasterCard effectué");
    }
}
// Nouvelle implémentation de la méthode de paiement a la livraison
class alivraison implements PaymentMethod {
    private String nom;
    private String numero;
 
    public alivraison(String nom, String numero) {
        this.nom = nom;
        this.numero = numero;
    }
 
 
    @Override
    public void payer() {
        System.out.println("Paiement a la livraison effectué");
    }
 }
class Paypal implements PaymentMethod {
    private String email;
    private String motDePasse;

    public Paypal(String email, String motDePasse) {
        this.email = email;
        this.motDePasse = motDePasse;
    }

    @Override
    public void payer() {
        System.out.println("Paiement par Paypal effectué");
    }
}
class PaymentApplication {
    private PaymentMethod paymentMethod;

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void payer() {
        if (paymentMethod != null) {
            paymentMethod.payer();
        } else {
            System.out.println("Veuillez choisir une méthode de paiement");
        }
    }
}
public class Apresajout {
    public static void main(String[] args) {
        PaymentMethod visa = new Visa("youssra farissi", "1111111");
        PaymentMethod masterCard = new MasterCard("22222222", 123);
        PaymentMethod paypal = new Paypal("youssra@domain.com", "mama");
        PaymentMethod alivraison = new alivraison("youssra", "1234");

        PaymentApplication paymentApp = new PaymentApplication();
        paymentApp.setPaymentMethod(visa);
        paymentApp.payer();

        paymentApp.setPaymentMethod(masterCard);
        paymentApp.payer();

        paymentApp.setPaymentMethod(paypal);
        paymentApp.payer();

        paymentApp.setPaymentMethod(alivraison);
        paymentApp.payer();
    }
}