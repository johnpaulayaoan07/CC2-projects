package array2;

import java.util.ArrayList;
import java.util.Scanner;

//2nd task: Let the user input elements.

public class OddEven {

    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Enter number of elements:");

        int n=sc.nextInt();

        int numArray[]=new int[n];
        for(int a=0;a<numArray.length;a++){
            System.out.print("Enter element["+a+"]:");
            numArray[a]=sc.nextInt();
        }
        
        
        ArrayList<Integer> even = new ArrayList();
        ArrayList<Integer> odd = new ArrayList();
        
        for (int i = 0; i < numArray.length; i++){
            
            if(numArray[i]%2==0){
                even.add(numArray[i]);
            }
            else if(numArray[i]%2!=0){
                odd.add(numArray[i]);
            }
        }
        System.out.println("\nEven"+"\tOdd");
        for(int j=0;j<even.size()&& j< odd.size();j++){
            System.out.println(even.get(j)+"\t"+odd.get(j));
            
        }
        
        if(even.size()>odd.size()){
            int diff=(even.size()-odd.size())+1;
            for(int i=1;i<diff;i++){ 
            System.out.println(""+even.get(even.size()-i));
            }
        }
        if(odd.size() > even.size()){
            int diff=(odd.size()-even.size())+1;
            for(int i=1;i<diff;i++){
                
                System.out.println("\t"+odd.get(odd.size()-i));
                
            }
        }
    }
       
}
    