public class Course {
   private int courseOption;
   private String courseName;
   private String courseCode;
   private String department;
   
   public Course() {
   
   }
   
   public void setCourseOption(int option){
      courseOption = option;
   }
   
   public String getCourseName() {
      if (courseOption == 1) {
         courseName = "Bachelor of Science in Information Technology";
      }
      else if (courseOption == 2) {
         courseName = "Bachelor of Scienece in Computer Science";
      }
      else if (courseOption == 3) {
         courseName = "Associate of Computer Technology";
      }
      else if (courseOption == 4) {
         courseName = "Bachelor of Scienece in Mechanical Engineering";
      }
      else if (courseOption == 5) {
         courseName = "Bachelor of Scienece in Civil Engineering";
      }
      
      return courseName;
   }
   
   public String getCourseCode() {
      if (courseOption == 1) {
         courseCode = "BSIT";
      }
      else if (courseOption == 2) {
         courseCode = "BSCS";
      }
      else if (courseOption == 3) {
         courseCode = "ACT";
      }
      else if (courseOption == 4) {
         courseCode = "BSME";
      }
      else if (courseOption == 5) {
         courseCode = "BSCE";
      }
      else {
         System.out.println("Invalid Option");
      }
      
      return courseCode;
   }
   
   public String getDepartment() {
      if (courseOption == 1 || courseOption == 2 || courseOption == 3) {
         department = "College of Computer Studies";
      }
      else if (courseOption == 4 || courseOption == 5) {
         department = "College of Engineering";
      }
      else {
         System.out.println("Invalid Option");
      }
      
      return department;
   }
}