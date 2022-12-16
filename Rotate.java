import java.util.Arrays;

/**
 * Writesquare description of class rotate here.
 *
 * @author (your name)
 * @version (today's date)
 */
public class Rotate
{   
    int placeholder;
    
    public static int [][] rotateArray(int [][] square){    
        //create primative variables
        int placeholder = 0;
        //create arrays
        int[][] newSquare = square;
        int[] rowPlaceholder = new  int [(square.length*square.length)];
        
        //start program
        
        //set all values in original 2d array into the 1d array
        for (int k = 0; k < square.length; k ++){
            for (int l = 0; l < square.length; l++){
                rowPlaceholder[placeholder] = newSquare [k][l];
                placeholder++;
            }
        }
        
        //reset placeholder
        placeholder = 0;
        
        //starting from the end of the rows and start of the columns,
        //set the values of the new 2d array to the values of the 1d array
        //in order of which they were put into the 1d array
        for(int i = square.length - 1; i >= 0; i--){
            for(int j = 0; j < square[i].length; j++){
                newSquare[j][i] = rowPlaceholder[placeholder];
                placeholder++;
            }
        }
        return newSquare;
    }
}
