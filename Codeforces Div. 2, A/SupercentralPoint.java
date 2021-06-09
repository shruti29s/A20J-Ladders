/*      Problem statement : https://codeforces.com/problemset/problem/165/A */

import java.util.*;
import java.io.*;

public class SupercentralPoint {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        int c=0;
        for(int i=0;i<n;i++)
        {
            int c1=0, c2=0, c3=0, c4=0;
            for(int j=0;j<n;j++)
            {
                if(x[j]>x[i] && y[i]==y[j])
                    c1++;
                if(x[j]<x[i] && y[i]==y[j])
                    c2++;
                if(x[j]==x[i] && y[j]<y[i])
                    c3++;
                if(x[j]==x[i] && y[j]>y[i])
                    c4++;
            }
            int a=Math.min(Math.min(Math.min(c1, c2), c3), c4);
            if(a>0)
            c++;
        }
        System.out.println(c);
    }
}
