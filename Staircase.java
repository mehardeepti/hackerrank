import java.io.*;
import java.util.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        String hash="#";
        for(int i=1;i<=n;i++)
        {
            System.out.println(String.format("%"+n+"s",hash));
            hash=hash+"#";
        }
    }
}
