package gussingnumber;
import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessingGame {

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String hl="";
        String i="";
//        int numGuess=17;
        int userGuess=0;
        try{
        System.out.println("Enter the number to be guess(from 1-999): ");
        int numGuess=sc.nextInt();
                    if(numGuess<0){
                    System.out.println("\n=================================================="
                    + "\n[!]Invalid Input"
                    + "\nInput must be from 1-999!"
                    + "\n==================================================");
                    System.exit(0);
                    }else if(numGuess > 999){
                    System.out.println("\n=================================================="
                    + "\n[!]Invalid Input"
                    + "\nInput must be from 1-999!"
                    + "\n==================================================");
                    System.exit(0);
                    
                    }
        
        
        System.out.println("\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
                + "\n"
               );
        
        if(numGuess%2==0){
        i="even";
        }else{
        i="odd";
        }
        
        
        System.out.println("\n=================================================="
                + "\nEnter your guess(from 1-999): ");
            userGuess=sc.nextInt();
            System.out.println("\nThe number to be guess is an "+i+"!"
                    + "\n==================================================");
            
            
        
            while(userGuess>0&&userGuess<=1000){
                while(userGuess!=numGuess){
                System.out.println("\n=================================================="
                    + "\nEnter your guess: ");
                    userGuess=sc.nextInt();
                    
                    if(userGuess<0){
                    System.out.println("\n=================================================="
                    + "\n[!]Invalid Input"
                    + "\nInput must be from 1-999!"
                    + "\n==================================================");
                    System.exit(0);
                    }else if(userGuess>999){
                    System.out.println("\n=================================================="
                    + "\n[!]Invalid Input"
                    + "\nInput must be from 1-999!"
                    + "\n==================================================");
                    System.exit(0);
                    
                    }
                    
                    if(userGuess<numGuess){
                    hl="Higher!";
                    }else{
                    hl="Lower!";
                    }
                    if(userGuess==numGuess){
                    System.out.println("\n=================================================="
                    + "\nCongratulation, You've got the correct number!"
                    + "\n==================================================");
                    System.exit(0);
                    }
                    
                System.out.println("\n"+hl+" The number to be guess is an "+i+" number!"
                    + "\n==================================================");
                }
                
            System.out.println("\n=================================================="
                    + "\nCongratulation, You've got the correct number!"
                    + "\n==================================================");
            
            System.exit(0);
        }
        System.out.println("\n=================================================="
                + "\n[!]Invalid Input"
                + "\nInput must be from 1-999!"
                + "\n==================================================");
        
        
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Entered value is not an integer!");
          }
    }
    
}