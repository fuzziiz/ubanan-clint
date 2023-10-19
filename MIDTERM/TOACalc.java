import java.util.Scanner;

public class TOACalc {
   static double subTotalDistance = 37.3;
   static double totalDistance = 0;
   static double TOA = 0;
   static int minTOA = 0;
   static int hrTOA = 0;
   
   static Scanner scan = new Scanner(System.in);
   
   public static void main(String[] args) {
      int choice, speed;
      
      System.out.print("Speed: ");
      speed = scan.nextInt();
      System.out.print("\nIs Barili route obstructed (YES == 1, 0 == NO)? ");
      choice = scan.nextInt();
      
      if (choice == 1) {
         System.out.println("\n- Cebu City   (Emall)        - START");
         System.out.println("- Route 1     (Minglanilla)  - Route 1");
         System.out.println("- Route 2     (San Fernando) - Route 2");
         System.out.println("- Route 3     (Carcar)       - Route 3");
         System.out.println("- Route 4.1   (Barili)       - Route 4.1");
         System.out.println("- Route 4.1.1 (Dumanjug)     - Route 4.1.1");
         System.out.println("- Route 4.1.2 (Alcantara)    - Route 4.1.2");
         System.out.println("- Moalboal                   - END\n");
         bariliRoute(speed);
      }
      else if (choice == 0) {
         sibongaRoute(speed);
      }
      else {
         System.out.println("Invalid");  
      }
   }
   
   public static void bariliRoute(int _speed) {
      totalDistance = subTotalDistance + 47.6;
      TOA = totalDistance / _speed * 60;
      
      minTOA = (int)TOA % 60;
      hrTOA = (int)TOA / 60;
      
      System.out.println("Speed: " + _speed + " km/hr");
      System.out.printf("Total Distance: %.1f km\n", totalDistance);
      System.out.println("Est. Time of Arrival: " + hrTOA + " Hour/s " + minTOA + " Minute/s");
   }
   
   public static void sibongaRoute(int _speed){
      double dumanjugDistance = 58.9;
      double argaoDistance = 67.1;
      
      System.out.println("\nChoose a route ");
      System.out.println("1. Dumanjug");
      System.out.println("2. Argao");
      System.out.print("Enter here: ");
      int newRoute = scan.nextInt();

      if (newRoute == 1) {
         totalDistance = subTotalDistance + dumanjugDistance;
         TOA = totalDistance / _speed * 60;
         
         minTOA = (int)TOA % _speed;
         hrTOA = (int)TOA / _speed;
      
         System.out.println("\n- Cebu City   (Emall)        - START");
         System.out.println("- Route 1     (Minglanilla)  - Route 1");
         System.out.println("- Route 2     (San Fernando) - Route 2");
         System.out.println("- Route 3     (Carcar)       - Route 3");
         System.out.println("- Route 4.2   (Sibonga)      - Route 4.2");
         System.out.println("- Route 4.2.1 (Dumanjug)     - Route 4.2.1");
         System.out.println("- Route 4.2.2 (Alcantara)    - Route 4.2.2");
         System.out.println("- Moalboal                   - END\n");
         
         System.out.println("Speed: " + _speed + " km/h");
         System.out.printf("Total Distance: %.1f km\n", totalDistance);
         System.out.println("Est. Time of Arrival: " + hrTOA + " Hour/s " + minTOA + " Minute/s");
      }
      else if (newRoute == 2) {
         totalDistance = subTotalDistance + argaoDistance;
         TOA = totalDistance / _speed * 60;
         
         minTOA = (int)TOA % _speed;
         hrTOA = (int)TOA / _speed;
         
         System.out.println("\n- Cebu City   (Emall)        - START");
         System.out.println("- Route 1     (Minglanilla)  - Route 1");
         System.out.println("- Route 2     (San Fernando) - Route 2");
         System.out.println("- Route 3     (Carcar)       - Route 3");
         System.out.println("- Route 4.2   (Sibonga)      - Route 4.2");
         System.out.println("- Route 5     (Argao)        - Route 5");
         System.out.println("- Route 5.1   (Ronda)        - Route 5.1");
         System.out.println("- Route 5.2   (Alcantara)    - Route 5.1");
         System.out.println("- Moalboal                   - END\n");
         
         System.out.println("Speed: " + _speed + " km/h");
         System.out.printf("Total Distance: %.1f km\n", totalDistance);
         System.out.println("Est. Time of Arrival: " + hrTOA + " Hour/s " + minTOA + " Minute/s");
      }
      else {
         System.out.println("Invalid choice");
      }
      
      scan.close();
   }
}