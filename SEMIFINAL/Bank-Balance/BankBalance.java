import java.util.Scanner;

public class BankBalance {
   public static void main(String[] args) {
      double balance;
      int response;
      int year = 1;
      final double INT_RATE = 0.03;
      
      Scanner userKey = new Scanner(System.in);
      
      System.out.print("Enter initial bank balance: ");
      balance = userKey.nextDouble();
      System.out.println("\nDo you want to see next year's balance?");
      System.out.print("Enter 1 for YES and ANY number for NO: ");
      response = userKey.nextInt();
      
      while (response == 1) {
         balance = balance + balance * INT_RATE;
         System.out.println("\nAfter year " + year + " at " + INT_RATE + " interest rate, balance is PHP " + balance);
         year = year + 1;
         System.out.println("\nDo you want to see the balance at the end of another year?");
         System.out.print("Enter 1 for YES and ANY number for NO: ");
         response = userKey.nextInt();
      }
   }
}