import java.util.Scanner;

class Student {
   String firstName, middleName, lastName, suffix;
   
   public Student() {}
   
   public void setFirstName(String _firstName) {
      firstName = _firstName;
   }
   
   public void setMiddleName(String _middleName) {
      middleName = _middleName;
   }
   
   public void setLastName(String _lastName) {
      lastName = _lastName;
   }
   
   public void setSuffix(String _suffix) {
      suffix = _suffix;
   }
   
   // GETTERS
   
   public String getFirstName() {
      return firstName;
   }
   
   public String getMiddleName() {
      return middleName;
   }
   
   public String getLastName() {
      return lastName;
   }
   
   public String getSuffix() {
      return suffix;
   }
   
   public String getFullName() {
      return firstName + " " + middleName + " " + lastName + " " + suffix;
   }
}

public class StudentInterface {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      Student s = new Student();
      
      System.out.print("First name:  ");
      s.setFirstName(scan.nextLine());
      
      System.out.print("Middle name: ");
      s.setMiddleName(scan.nextLine());
      
      System.out.print("Last name:   ");
      s.setLastName(scan.nextLine());
      
      System.out.print("Suffix (If none just skip(spacebar)):      ");
      s.setSuffix(scan.nextLine());
      
      System.out.println("Fullname: " + s.getFullName());
   }
}