abstract class Document {
    public abstract void getInfo();
}
class Livre extends Document {
    @Override
    public void getInfo() {
        System.out.println("Document de type Livre");
    }}
class Journal extends Document {
    @Override
    public void getInfo() {
        System.out.println("Document de type Journal");
    }}
class Magazine extends Document {
    @Override
    public void getInfo() {
        System.out.println("Document de type Magazine");
    }}
public class DocumentFactory {
    public static Document createDocument(String type) {
        if (type.equalsIgnoreCase("livre")) {
            return new Livre();
        } else if (type.equalsIgnoreCase("journal")) {
            return new Journal();
        } else if (type.equalsIgnoreCase("magazine")) {
            return new Magazine();
        } else {
            return null;
        }
    }
}

