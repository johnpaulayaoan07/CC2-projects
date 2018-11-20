package course;

import java.util.Scanner;
public class Course {
    
    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       String course="";
       String major="";
       
       
       
        System.out.println("Enter your course: "
                + "\n[1]BSDA"
                + "\n[2]BSIT"
                + "\n[3]BSCS");
        course = sc.nextLine();
        
        if(course.equals("BSDA")||course.equals("1")){
            System.out.println("\n___________________________________________________");
            System.out.println("You are a BSDA student.");

            
        }else if(course.equals("2")||course.equals("BSIT")){
            System.out.println("\nWhat is your Major?");
            System.out.println(""
                    + "\n[1]Network Security"
                    + "\n[2]Enterprise Resource Planning Track"
                    + "\n[3]Web Development");
            String choose=sc.nextLine();
            
            if(choose.equals("1")||choose.equals("Network Security")){
            major="Network Security";
            }
            else if(choose.equals("2")||choose.equals("Enterprise Resource Planning Track")){
            major="Enterprise Resource Planning Track";
            }
            else if(choose.equals("3")||choose.equals("Web Development")){
            major="Web Development";
            }
            System.out.println("___________________________________________________");
            System.out.println("Your are BSIT student"+" major in "+major+".");
        }else if(course.equals("3")||course.equals("BSCS")){
            System.out.println("\nWhat is your Major?");
            System.out.println(""
                    + "\n[1]Mobile Development"
                    + "\n[2]Digital Arts and Animation");
            String choose2=sc.nextLine();
            
            
            if(choose2.equals("1")||major.equals("Mobile Development")){
            major="Mobile Development";
            }
            else if(choose2.equals("2")||major.equals("Digital Arts and Animation")){
            major="Digital Arts and Animation";
            }
            System.out.println("___________________________________________________");
            System.out.println("Your are BSCS student"+" major in "+major+".");
        }
        
        else{
            System.out.println("Error!");
        }
        
            
            
                
                  
          
             
                     
            
                
                
                
                
                
                
            
        
        
        
    
        
        
        
      
      
       
    }
    
}
