import java.util.ArrayList;
import java.util.List;

interface Form {
    void operation();
}

class Leaf implements Form {
    @Override
    public void operation() {
        System.out.println("*op*");
    }
}
class FormComposite implements Form {
    private List<Form> children = new ArrayList<>();

    @Override
    public void operation() {
        System.out.println("*op*");
    }

    public void add(Form form) {
        children.add(form);
    }

    public void remove(Form form) {
        children.remove(form);
    }

    public Form getChild(int index) {
        if (index >= 0 && index < children.size()) {
            return children.get(index);
        }
        return null;
    }
    public int getChildrenCount() {
        return children.size();
    }
}