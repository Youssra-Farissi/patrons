public class Client {
    public static void main(String[] args) {
        Document livre = DocumentFactory.createDocument("livre");
        Document journal = DocumentFactory.createDocument("journal");
        Document magazine = DocumentFactory.createDocument("magazine");

        livre.getInfo();
        journal.getInfo();
        magazine.getInfo();
    }
}