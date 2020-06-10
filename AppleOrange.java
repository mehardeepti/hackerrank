import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AppleOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int d=0;
        int ca=0;
        for(int apple_i=0; apple_i < m; apple_i++){
            d = a + in.nextInt();
            if(d >= s && d <= t) ca++;
        }        
        int co=0;
        for(int orange_i=0; orange_i < n; orange_i++){
            d = b + in.nextInt();
            if(d >= s && d <= t) co++;
        }
        System.out.println(ca);
        System.out.println(co);
    }
}
