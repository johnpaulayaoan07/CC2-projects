
package twodimenssionalarray;

import java.util.Scanner;

/**
 *
 * @author cc2_1h-2
 */
public class TwoDimenssionalArray {

   
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Input total row : ");
            int row = sc.nextInt();
        System.out.print("Input total column : ");
            int column = sc.nextInt();

        String [][] twoD = new String[row][column];
            for (int  i = 0; i < row; i++){
                for( int j = 0; j < column; j++) {
    
                    System.out.println("Row ["+i+"]:  Column "+j+" :");
                    twoD[i][j] = (sc.next()); 
                }

            }
            System.out.print("The Array is :\n");
       for(int i=0; i<row; i++){
           for(int j=0; j<column; j++)
           {
               System.out.print(twoD[i][j]+ "  ");
           }
           System.out.println();
       }
    }

    
    
}
