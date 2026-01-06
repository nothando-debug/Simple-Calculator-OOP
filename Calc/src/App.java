import java.util.Scanner;
//My calculator only accepts two numbers and adds, subtracts, multiply or divides them
//It's the most basic and dull calculator, but I'm just using it play around with Java lol
public class App {
    public static void main(String[] args) {
        double num1 = 0;
        double num2 = 0;
     

        // String [] symbols = {"+", "/", "*", "-"};
       
        

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, welcome to my calculator :)");
        System.out.println("NB: It only takes in TWO numbers, + is for adding, -  subtracting, / is for division, * is for multiplication");
        
        System.out.print("Enter first number, then click ENTER: " );
        num1 = scanner.nextDouble();
        scanner.nextLine();
     

        
        System.out.print("Enter symbol, then click ENTER: ");
        String symbol = scanner.nextLine();
        


        System.out.print("Enter second number, then click ENTER: " );
        num2 = scanner.nextDouble();

        if (symbol.equals("+")){
            System.out.println("Answer is: "  + (num1 + num2));
        }else if (symbol.equals("-")){
            System.out.println("Answer is: " + (num1 - num2));
        }else if (symbol.equals("/")){
            System.out.println("Answer is: " + (num1 / num2));
        }else if (symbol.equals("*")){
            System.out.println("Answer is: " + (num1 * num2));
        }else{
            System.out.println("Enter correct symbol wena maan");
            
        }
        
     
        
 
     
        scanner.close();

        }
       
        
    
}
