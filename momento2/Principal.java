package momento2;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    private ArrayList<Item> items;
    private Admin admin;
    private User user;

    public Principal() {
        items = new ArrayList<>();
        admin = new Admin(items);
        user = new User(items);
    }

    public static void main(String[] args) {
        Principal system = new Principal();
        system.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Administrador");
            System.out.println("2. Usuario");
            System.out.println("3. Salir");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    adminMenu(scanner);
                    break;
                case 2:
                    userMenu(scanner);
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }

    private void adminMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Agregar ítem");
            System.out.println("2. Agregar categoría");
            System.out.println("3. Volver");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    admin.addItem(scanner);
                    break;
                case 2:
                    admin.addCategory(scanner);
                    break;
                case 3:
                    return;
            }
        }
    }

    private void userMenu(Scanner scanner) {
        while (true) {
            System.out.println("1. Ver ítems");
            System.out.println("2. Dar 'me gusta' a un ítem");
            System.out.println("3. Comentar en un ítem");
            System.out.println("4. Volver");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    user.viewItems();
                    break;
                case 2:
                    user.likeItem(scanner);
                    break;
                case 3:
                    user.commentOnItem(scanner);
                    break;
                case 4:
                    return;
            }
        }
    }
}
