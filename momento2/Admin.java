package momento2;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private ArrayList<Item> items;

    public Admin(ArrayList<Item> items) {
        this.items = items;
    }

    public void addItem(Scanner scanner) {
        System.out.println("Ingrese el nombre del ítem:");
        String name = scanner.nextLine();
        System.out.println("Ingrese el autor:");
        String author = scanner.nextLine();
        System.out.println("Ingrese la sinopsis:");
        String synopsis = scanner.nextLine();
        items.add(new Item(name, author, synopsis));
        System.out.println("Ítem agregado exitosamente.");
    }

    public void addCategory(Scanner scanner) {
        System.out.println("Ingrese el nombre de la nueva categoría:");
        String category = scanner.nextLine();
        System.out.println("Categoría " + category + " agregada exitosamente.");
    }
}
