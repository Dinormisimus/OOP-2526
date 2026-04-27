public class TestMenu {
    public static void main(String[] args) {
        Menu menu = new Menu();


        menu.root()
                .submenu("File")
                .action("New", () -> System.out.println("New file"))
                .action("Open", () -> System.out.println("Opening..."))
                .submenu("Recent")
                .action("file1.txt", () -> {})
                .action("file2.txt", () -> {})
                .back() // Opcionalno bi se moglo dodati, ali ovdje gradimo prema dolje
                .submenu("Edit")
                .action("Copy", () -> System.out.println("Copied"));

        menu.print();
    }
}