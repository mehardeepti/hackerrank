import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GradingStudents {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] result = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            result[grades_i] = in.nextInt();
            if(result[grades_i]>=38 && result[grades_i] % 5 >=3){
                result[grades_i] = result[grades_i] + 5 - (result[grades_i] % 5);  
            }
        }
        
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");        

    }
}
