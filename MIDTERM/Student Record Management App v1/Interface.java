import java.util.Scanner;

public class Interface {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      Student s = new Student();
      Course c = new Course();
    
      do {
         System.out.println("\nSelection Menu: ");
         System.out.println("------------------------------");
         System.out.println("1. Create Student Record");
         System.out.println("0. Exit");
         System.out.println("------------------------------");
         System.out.print("Enter Selection: ");
         int menuSelection = scan.nextInt();
         
         System.out.println("------------------------------");
         
         if (menuSelection == 1) {
            System.out.println("\nEnter Student Details: ");
            System.out.println("------------------------------");
            System.out.print("Enter Student ID No.: ");
            s.setStudentID(scan.nextInt());
            scan.nextLine();
            System.out.print("Enter First Name: ");
            s.setFirstName(scan.nextLine());
            System.out.print("Enter Middle Name: ");
            s.setMiddleName(scan.nextLine());
            System.out.print("Enter Last Name: ");
            s.setLastName(scan.nextLine());
            System.out.print("Enter Suffix: ");
            s.setSuffix(scan.nextLine());
            System.out.print("Enter Age: ");
            s.setAge(scan.nextInt());
            System.out.print("Enter Year Level (e.g. 1):");
            s.setYearLvl(scan.nextInt());
            System.out.print("Enter Phone Number: ");
            s.setPhoneNum(scan.nextInt());
            System.out.print("Enter Email: ");
            scan.nextLine();
            s.setEmail(scan.nextLine());
            System.out.println("------------------------------");
            
            do {
               System.out.println("\n\nStudent Record Selection Menu: ");
               System.out.println("------------------------------");
               System.out.println("1. Update Student Profile Details");
               System.out.println("2. Update Student Course Details");
               System.out.println("3. Display Student Record");
               System.out.println("0. Exit");
               System.out.println("------------------------------");
               System.out.println("Enter Selection: ");
               int selection = scan.nextInt();
               
               if (selection == 1) {
                  do {
                     System.out.println("\nStudent Profile Details Update Selection Menu: ");
                     System.out.println("------------------------------");
                     System.out.println("1. Update Student ID No.");
                     System.out.println("2. Update First Name: ");
                     System.out.println("3. Update Middle Name: ");
                     System.out.println("4. Update Last Name: ");
                     System.out.println("5. Update Suffix: ");
                     System.out.println("6. Updaet Age: ");
                     System.out.println("7. Update Year Level (e.g. 1):");
                     System.out.println("8. Update Phone Number: ");
                     System.out.println("9. Update Email: ");
                     System.out.println("0. Return");
                     int profileSelection = scan.nextInt();
                     
                     System.out.println("------------------------------");
                     
                     System.out.println("Enter Student Details: (Update)");
                     
                     System.out.println("------------------------------");
                     
                     switch (profileSelection) {
                        case 1:
                           System.out.println("Student ID No.");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter Student ID No.: ");
                           s.setStudentID(scan.nextInt());
                           scan.nextLine();
                           break;
                        case 2:
                           System.out.println("First Name");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter First Name: ");
                           s.setFirstName(scan.nextLine());
                           break;
                        case 3:
                           System.out.println("Middle Name");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter Middle Name: ");
                           s.setMiddleName(scan.nextLine());
                           break;
                        case 4:
                           System.out.println("Last Name");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter Last Name: ");
                           s.setLastName(scan.nextLine());
                           break;
                        case 5:
                           System.out.println("Suffix");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter Suffix: ");
                           s.setSuffix(scan.nextLine());
                           break;
                        case 6:
                           System.out.println("Age");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter Age: ");
                           s.setAge(scan.nextInt());
                           break;
                        case 7:
                           System.out.println("Year Level");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter Year Level (e.g. 1): ");
                           s.setYearLvl(scan.nextInt());
                           break;
                        case 8:
                           System.out.println("Phone Number");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter Phone Number: ");
                           s.setPhoneNum(scan.nextInt());
                           break;
                        case 9:
                           System.out.println("Email");
                           System.out.println("------------------------------");
                           System.out.print("\nEnter Email: ");
                           scan.nextLine();
                           s.setEmail(scan.nextLine());
                           break;
                        default:
                           System.out.println("\nInvalid Option");
                           break;
                     }
                  } while (profileSelection != 0);
                  
                  System.out.println("------------------------------");
               }
               
               else if (selection == 2) {
               System.out.println("\nSelect Student Course Detail: (Update) ");
               System.out.println("------------------------------");
               System.out.println("1. Bachelor of Science in Information Technology (IT)");
               System.out.println("2. Bachelor of Science in Computer Science (BSCS)");
               System.out.println("3. Associate of Computer Technology (ACT)");
               System.out.println("4. Bachelor of Science in Mechanical Engineer (BSME)");
               System.out.println("5. Bachelor of Science in Civil Engineer (BSCE)");
               System.out.println("------------------------------");
               System.out.print("Enter selection: ");
               c.setCourseOption(scan.nextInt());
            }
            else if (selection == 3) {
               System.out.println("\nStudent Record: ");
               System.out.println("0. Exit");
               System.out.println("------------------------------");
               System.out.println("Student ID No.: " + s.getStudentID());
               System.out.println("First Name: " + s.getFirstName());
               System.out.println("Middle Name: " + s.getMiddleName());
               System.out.println("Last Name: " + s.getLastName());
               System.out.println("Suffix: " + s.getSuffix());
               System.out.println("Age: " + s.getAge());
               System.out.println("Year Level:" + s.getYearLvl());
               System.out.println("Phone Number: " + s.getPhoneNumber());
               System.out.println("Email: " + s.getEmail());
               System.out.println("------------------------------");
               
               System.out.println("Student Course Details: ");
               System.out.println("Course Name: " + c.getCourseName());
               System.out.println("Course Code: " + c.getCourseCode());
               System.out.println("Department:  " + c.getDepartment());
               
               System.out.print("Enter selection: ");
               int select = scan.nextInt();
               
               System.out.println("------------------------------");
               
               if (select == 0) {
                  selectionExit = true;
               }
               else {
                  System.out.println("Invalid selection");
                  selectionExit = false;
               }
            }
            } while (selection != 0);

         }
         else {
            System.out.println("Invalid Selection");
         }
      } while (menuSelection != 0);
   }
}