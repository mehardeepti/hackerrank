import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SockMerchant {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        final Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        Integer ar,result=0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar = in.nextInt();
            result = map.get(ar);
            if(result==null)
                map.put(ar, 1);
            else
                map.put(ar,result+1);
        }
        result=map.values().stream().mapToInt(i -> i.intValue()/2).sum();
        System.out.println(result);
    }
}
