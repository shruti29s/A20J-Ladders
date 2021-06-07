/*      Problem statement : https://codeforces.com/problemset/problem/483/A */

import java.util.*;
import java.io.*;

public class CounterExample {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        long l=sc.nextLong();
        long r=sc.nextLong();
        if(r-l<2)
        {
            System.out.println(-1);
        }
        else if(r-l==2)
        {
            if(l%2==0)
            {
                System.out.println(l+" "+(l+1)+" "+(l+2));
            }
            else{
                System.out.println(-1);
            }
        }
        else{
            if(l%2==0)
            {
                System.out.println(l+" "+(l+1)+" "+(l+2));
            }
            else{
                System.out.println((l+1)+" "+(l+2)+" "+(l+3));
            }
        }
    }
}
