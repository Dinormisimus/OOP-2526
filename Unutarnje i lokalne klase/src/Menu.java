import java.util.ArrayList;
import java.util.List;

public class Menu {
    private final SubmenuItem root = new SubmenuItem("Root", null);

    public abstract class Item {
        protected String name;
        protected Item(String name) { this.name = name; }
        abstract void print(String indent);
    }

    public class ActionItem extends Item {
        private final Runnable action;

        public ActionItem(String name, Runnable action) {
            super(name);
            this.action = action;
        }

        @Override
        void print(String indent) {
            System.out.println(indent + "- " + name);
        }
    }

    public class SubmenuItem extends Item {
        private final List<Item> children = new ArrayList<>();
        private final SubmenuItem parent; // Referenca na roditelja

        public SubmenuItem(String name, SubmenuItem parent) {
            super(name);
            this.parent = parent;
        }

        public SubmenuItem action(String name, Runnable action) {
            children.add(new ActionItem(name, action));
            return this;
        }

        public SubmenuItem submenu(String name) {
            SubmenuItem sub = new SubmenuItem(name, this); // Prosljeđujemo 'this' kao roditelja
            children.add(sub);
            return sub;
        }

        // METODA KOJA TI JE NEDOSTAJALA:
        public SubmenuItem back() {
            return (parent != null) ? parent : this;
        }

        @Override
        void print(String indent) {
            System.out.println(indent + "> " + name);
            for (Item child : children) {
                child.print(indent + "  ");
            }
        }
    }

    public SubmenuItem root() { return root; }

    public void print() {
        root.print("");
    }
}