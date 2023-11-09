import java.util.Scanner;
import java.util.ArrayList;

public class RestaurantInteractiveApp {
	static ArrayList<MenuItem> menuItems = new ArrayList<>();
	static ArrayList<MenuItem> orders = new ArrayList<>();
	static double total = 0;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int choice, quantity;
		
		menuItems.add(new MenuItem("C1", 100.00, 0));
		menuItems.add(new MenuItem("C2", 150.00, 0));
      menuItems.add(new MenuItem("C3", 200.00, 0));
      menuItems.add(new MenuItem("R1", 35.00, 0));
      menuItems.add(new MenuItem("R2", 50.00, 0));
        
      do {
         System.out.println("\n--- Menu ---");
         for (int i = 0; i <= 2; i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i));
         }
         System.out.println("--- Add Ons ---");
         for (int i = 3; i <= 4; i++) {
            System.out.println((i + 1) + ". " + menuItems.get(i));
         }
        	System.out.println("6. Show Orders");
        	System.out.println("7. Exit");
        	
        	System.out.print("Enter Order: ");
        	choice = scan.nextInt();
        	
        	switch (choice) {
         case 1:
        	case 2:
        	case 3:
        	case 4:
        	case 5:
        		System.out.print("Enter Quantity: ");
        		quantity = scan.nextInt();
        		
        		MenuItem selectedItem = menuItems.get(choice - 1);
        		double subTotal = quantity * selectedItem.price;
        		total += subTotal;
        		
        		orders.add(new MenuItem(selectedItem.name, subTotal, quantity));
        		System.out.println("\nAdded order: " + quantity + " " + selectedItem.name + " ");
        		break;
        	case 6:
        		showOrders();
        		break;
        	case 7:
        		break;
        	default:
        		System.out.println("Invalid Choice. Please try again.");
        		break;
         }
      } while (choice != 7);
	}
	
   public static void showOrders() {
		System.out.println("\nOrders: ");
		
		for (MenuItem item : orders) {
			System.out.println(item.name + " - Php " + item.price + " - Quantity " + item.quantity);
		}
		
		System.out.println("Total Price in Pesos: Php " + total);
		System.out.println("Total Price in Dollar:  $ " + total / 50); // Assuming that 1 USD = 50 Php.
	}
}

class MenuItem {
	String name;
	double price;
   int quantity;
	
	public MenuItem(String name, double price, int quantity) {
		this.name     = name;
		this.price    = price;
      this.quantity = quantity;
	}
	
	public String toString() {
		return name + " - Php " + price;
	}
}