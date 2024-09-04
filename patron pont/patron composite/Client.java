public class Client {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        FormComposite formComposite = new FormComposite();

        formComposite.add(leaf1);
        formComposite.add(leaf2);

        formComposite.operation();

        System.out.println("Children of FormComposite:");
        for (int i = 0; i < formComposite.getChildrenCount(); i++) {
            Form child = formComposite.getChild(i);
            if (child != null) {
                child.operation();
            }
        }

        formComposite.remove(leaf2);

        System.out.println("Children of FormComposite after removal:");
        for (int i = 0; i < formComposite.getChildrenCount(); i++) {
            Form child = formComposite.getChild(i);
            if (child != null) {
                child.operation();
            }
        }
    }
}
