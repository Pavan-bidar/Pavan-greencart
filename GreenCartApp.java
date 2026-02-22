package greenCartsystem;

import java.sql.Date;
import java.util.Scanner;

public class GreenCartApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        GroceryDAO dao = new GroceryDAO();

        while (true) {

            System.out.println("\n===== GREEN CART MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. View All Items");
            System.out.println("3. View Expired Items");
            System.out.println("4. Search by Category");
            System.out.println("5. Update Quantity");
            System.out.println("6. Delete Item");
            System.out.println("7. View Low Stock Items");
            System.out.println("8. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();

                    System.out.print("Category: ");
                    String category = sc.nextLine();

                    System.out.print("Quantity: ");
                    int qty = sc.nextInt();

                    System.out.print("Expiry Date (yyyy-mm-dd): ");
                    Date expiry = Date.valueOf(sc.next());

                    System.out.print("Price: ");
                    double price = sc.nextDouble();

                    dao.addItem(new GroceryItem(name, category, qty, expiry, price));
                    break;

                case 2:
                    dao.viewAllItems();
                    break;

                case 3:
                    dao.viewExpiredItems();
                    break;

                case 4:
                    System.out.print("Enter Category: ");
                    String cat = sc.nextLine();
                    dao.searchByCategory(cat);
                    break;

                case 5:
                    System.out.print("Enter Item ID: ");
                    int id = sc.nextInt();

                    System.out.print("New Quantity: ");
                    int newQty = sc.nextInt();

                    dao.updateQuantity(id, newQty);
                    break;

                case 6:
                    System.out.print("Enter Item ID to delete: ");
                    int delId = sc.nextInt();
                    dao.deleteItem(delId);
                    break;

                case 7:
                    dao.lowStockItems();
                    break;

                case 8:
                    System.out.println("👋 Exiting GreenCart...\nThank you. Visit again");
                    System.exit(0);

                default:
                    System.out.println("❌ Invalid choice!");
            }
        }
	}

}
