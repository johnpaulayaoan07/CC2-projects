
package calculator;
import java.util.Scanner;
 

public class Calculator {


    public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
        
        
        double num1;
        double num2;
        String operation="";
        double sol;
        double answer=0;
        

        System.out.println("Enter the first number:");
        num1 = Double.parseDouble(sc.nextLine());

        System.out.println("Enter the second number");
        num2 = Double.parseDouble(sc.nextLine());
        
        System.out.println("\nEnter an operation:");
         operation=sc.nextLine();

        

        

        switch (operation) {
            case "+":
            case "add":
                sol=num1+num2;
                answer=sol;
                break;
            case "-":
            case "minus":

                sol=num1 - num2;
                answer=sol;

                break;
            case "/":
            case "divide":
                sol =num1 / num2;
                answer=sol;
                break;
            case "*":
            case "multiply":
                sol=num1 * num2;
                answer=sol;
                break;
            case "%":
            case "modulo":
                sol=num1 % num2;
                answer=sol;
                break;
            default:
                break;
        }
        
        
        System.out.println(num1+operation+num2+"= "+answer);

    }
    
}