package momento2;

import java.util.ArrayList;
import java.util.Scanner;

public class User {
    private ArrayList<Item> items;

    public User(ArrayList<Item> items) {
        this.items = items;
    }

    public void viewItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

    public void likeItem(Scanner scanner) {
        System.out.println("Ingrese el nombre del ítem para dar 'me gusta':");
        String name = scanner.nextLine();
        for (Item item : items) {
            if (item.toString().contains(name)) {
                item.like();
                System.out.println("Ítem marcado como 'me gusta'.");
                return;
            }
        }
        System.out.println("Ítem no encontrado.");
    }

    public void commentOnItem(Scanner scanner) {
        System.out.println("Ingrese el nombre del ítem para comentar:");
        String name = scanner.nextLine();
        for (Item item : items) {
            if (item.toString().contains(name)) {
                System.out.println("Ingrese su comentario:");
                String comment = scanner.nextLine();
                item.addComment(comment);
                System.out.println("Comentario agregado.");
                return;
            }
        }
        System.out.println("Ítem no encontrado.");
    }
}
