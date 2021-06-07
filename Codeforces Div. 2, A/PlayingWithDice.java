/*      Problem statement : https://codeforces.com/problemset/problem/378/A */

import java.util.*;
import java.io.*;

public class PlayingWithDice {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int wa=0, d=0, wb=0;
        for(int i=1;i<=6;i++)
        {
            int x=Math.abs(a-i);
            int y=Math.abs(b-i);
            if(x<y)
            {
                wa++;
            }
            else if(y<x)
            {
                wb++;
            }
            else{
                d++;
            }
        }
        System.out.println(wa+" "+d+" "+wb);
    }
}
