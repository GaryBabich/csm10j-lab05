package lab05;
import java.util.*;

public class Lab05 {
    static Scanner consule = new Scanner(System.in);
    static boolean Check = false;


    public static void main(String[] args) {
        String num1;
        String num2;
        int count;
        String carry;
        int counter = 0;
        int max;

        System.out.println("Please enter the first number.");
        num1 = consule.next();
    
        System.out.println("Please enter the second number.");
        num2 = consule.next();
    
        if (num1.length() > num2.length()){
            max = num1.length();
        } else {
            max = num2.length();
        }
    
        int[] array1 = new int[max];
        int[] array2 = new int[max];
  
        for(int i=num1.length(); i> 0; i--){
        carry = num1.substring(i-1, i);
        count = Integer.parseInt(carry);
        array1[counter] = count;
        counter = counter + 1;
        }
        counter = 0;
        for(int i=num2.length(); i> 0; i--){
        carry = num2.substring(i-1, i);
        count = Integer.parseInt(carry);
        array2[counter] = count;
        counter = counter + 1;
        }
        int[] finalArray = new int[max + 1];

        for (int i=0 ; i<= max-1; i++){
            /*finalArray[i] = finalArray[i] + array1[i] + array2[i];
            if (finalArray[i] >= 10){
                finalArray[i] = finalArray[i] - 10;
                finalArray[i+1] = finalArray[i+1] + 1;
            
            
            } */
            convertarray ( array1, array2, finalArray, i);
            if (Check == true){
            finalArray[i+1] = finalArray[i+1] +1;
            }
            
        }
        System.out.println("Your final value is: ");
        if (finalArray[max] == 0){
            max = max-1;
        }
        for (int i = max; i>=0; i--){
            System.out.print(finalArray[i]);
        }
        System.out.println("");
    }
    
    public static int[] convertarray (int arr1[], int arr2[], int finalarr[], int set){
        finalarr[set] = finalarr[set] + arr1[set] + arr2[set];
        if (finalarr[set] >= 10){
            finalarr[set] = finalarr[set] - 10;
            Check = true;
        } else {
            Check = false;
        }
        return finalarr;
    }
}
    
    
    

