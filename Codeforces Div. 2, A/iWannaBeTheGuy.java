/*      Problem statement : https://codeforces.com/problemset/problem/469/A */

import java.util.*;
import java.io.*;

public class iWannaBeTheGuy {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p=sc.nextInt();
        int x[]=new int[p];
        int c[]=new int[n+1];
        for(int i=0;i<p;i++)
        {
            x[i]=sc.nextInt();
            c[x[i]]++;
        }
        int q=sc.nextInt();
        int y[]=new int[q];
        for(int i=0;i<q;i++)
        {
            y[i]=sc.nextInt();
            c[y[i]]++;
        }
        int f=1;
        for(int i=1;i<=n;i++)
        {
            if(c[i]==0)
            {
                f=0;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}
