/*      Problem statement : https://codeforces.com/problemset/problem/476/A */

import java.util.*;
import java.io.*;

public class DreamoonAndStairs {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        if(m>n)
        {
            System.out.println(-1);
        }
        else{
            int min=n/2;
            if(n%2!=0)
            {
                min+=1;
            }
            if(min%m!=0)
            {
                int x=min/m;
                min=m*(x+1);
            }
            if(min>n)
            {
                System.out.println(-1);
            }
            else{
                System.out.println(min);
            }
        }
    }
}
