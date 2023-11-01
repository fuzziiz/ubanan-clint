// UBANAN, CLINT JOSEPH   BSCS 2

import java.util.Scanner;

class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int option = 0;
      boolean exit = false;
      BankAccount acc = new BankAccount();
      
      do {
         try {
            System.out.println("\nBank Account System");
            System.out.println("------------------------------------------------");
            System.out.print("Enter Account Name:   ");
            acc.setAccountName(scan.nextLine());
            System.out.print("Enter Account Number: ");
            acc.setAccountNumber(scan.nextInt());
            exit = true;
         }
         catch (Exception e) {
            System.out.println("\nInvalid input. Please try again.");
            scan.nextLine();
            exit = false;
         }
         System.out.println("------------------------------------------------");
              
         while (exit) {
            System.out.println("\nChoose an option: ");
            System.out.println("------------------------------------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Balance");
            System.out.println("0. Exit");
            System.out.println("------------------------------------------------");
            
            try {
               System.out.print("Enter here: ");
               option = scan.nextInt();
            }
            catch (Exception e) {
               System.out.println("\nInvalid input. Please try again.");
               scan.nextLine();
               exit = false;
            }
            
            switch (option){
               case 1:
                  System.out.println("\nDeposit Page");
                  System.out.println("------------------------------------------------");
                  try {
                     System.out.print("Enter the amount to deposit: ");
                     acc.setDeposit(scan.nextDouble());
                  }
                  catch (Exception e) {
                     System.out.println("Invalid Input. ");
                     scan.nextLine();
                     continue;
                  }
                  break;
               case 2:
                  System.out.println("\nWithdraw Page");
                  System.out.println("------------------------------------------------");
                  System.out.print("Enter the amount to withdraw: ");
                  acc.setWithdraw(scan.nextDouble());
                  break;
               case 3:
                  System.out.println("\nBalance Page");
                  System.out.println("------------------------------------------------");
                  System.out.print("Balance: \n$ " + acc.getBalance());
                  System.out.println();
                  break;
               case 0:
                  System.out.println("Goodbye and have a nice day.");
                  exit = true;
                  break;
               default:
                  System.out.println("Invalid Input.");
                  exit = false;
                  break;
            }
         }
      } while (!exit);
   }
}
