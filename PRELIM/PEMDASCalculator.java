import java.util.Scanner;

public class PEMDASCalculator{
   public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);

      System.out.print("Enter a mathematical expression: ");
      String expression = scanner.nextLine();
      
      try{
         double result = evaluateExpression(expression);
         System.out.println("Result: " + result);
      } 
      catch (Exception e){
         System.out.println("Error: " + e.getMessage());
      }
   }
   
   // EVALUATES EXPRESSIONS
   public static double evaluateExpression(String expression) throws Exception{
      expression = expression.replaceAll("\\s+", ""); // REMOVE WHITESPACE FROM THE EXPRESSION
      return evaluateExpressionHelper(expression);    // CALLS THE HELPER METHOD FOR EVALUATION
   }

   private static double evaluateExpressionHelper(String expression) throws Exception{
      if (expression.isEmpty()){ // CHECKS FOR EMPTY EXPRESSIONS
         throw new Exception("Empty expression");
      }

      try{ // TRY TO PARSE THE EXPRESSION AS DOUBLE
         return Double.parseDouble(expression);
      } 
      catch (NumberFormatException e){
         // CONTINUE EVALUATION
      }

      int parenthesesCount = 0;
      
      // LOOP TO HANDLE ADDITION AND SUBTRACTION OUTSIDE OF PARENTHESES
      for (int i = expression.length() - 1; i >= 0; i--){
         char c = expression.charAt(i);
         
         if (c == ')'){
            parenthesesCount++;
         } 
         else if (c == '('){
            parenthesesCount--;
         }

         if (parenthesesCount == 0 && (c == '+' || c == '-') && i > 0){
            char operator = c;
            String leftOperand = expression.substring(0, i);
            String rightOperand = expression.substring(i + 1);

            if (operator == '+'){
               return evaluateExpressionHelper(leftOperand) + evaluateExpressionHelper(rightOperand);
            } 
            else{
               return evaluateExpressionHelper(leftOperand) - evaluateExpressionHelper(rightOperand);
            }
         }
      }

      parenthesesCount = 0;
      
      // LOOP TO HANDLE MULTIPLICATION AND DIVISION OUTSIDE OF PARENTHESES  
      for (int i = expression.length() - 1; i >= 0; i--){
         char c = expression.charAt(i);
         
         if (c == ')'){
            parenthesesCount++;
         } 
         else if (c == '('){
            parenthesesCount--;
         }

         if (parenthesesCount == 0 && (c == '*' || c == '/') && i > 0){
            char operator = c;
            String leftOperand = expression.substring(0, i);
            String rightOperand = expression.substring(i + 1);

            if (operator == '*'){
               return evaluateExpressionHelper(leftOperand) * evaluateExpressionHelper(rightOperand);
            } 
            else{
               return evaluateExpressionHelper(leftOperand) / evaluateExpressionHelper(rightOperand);
            }
         }
      }
      
      // HANDLE EXPRESSIONS ENCLOSED IN PARENTHESES
      if (expression.charAt(0) == '(' && expression.charAt(expression.length() - 1) == ')'){
         return evaluateExpressionHelper(expression.substring(1, expression.length() - 1));
      }
      
      // THROW EXCEPTION FOR INVALID EXPRESSION
      throw new Exception("Invalid expression: " + expression);
   }
}
