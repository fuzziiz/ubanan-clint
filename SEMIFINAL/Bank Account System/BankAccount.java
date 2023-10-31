public class BankAccount {
   private int accountNumber;
   private String accountName;
   private double balance;
   
   public BankAccount() {
      
   }
   
   public void setAccountName(String accountName) {
      this.accountName = accountName;
   }
   
   public void setAccountNumber(int accountNumber) {
      this.accountNumber = accountNumber;
   }
   
   public void setDeposit(double amount) {
      balance += amount;
   }
   
   public void setWithdraw(double amount) {
      balance -= amount;
   }
   
   public String getAccountName() {
      return accountName;
   }
   
   public double getBalance() {
      return balance;
   }
}