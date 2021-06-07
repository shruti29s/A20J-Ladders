/*      Problem statement : https://codeforces.com/problemset/problem/276/A */

import java.util.*;
import java.io.*;

public class LunchRush {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int f[]=new int[n];
        int t[]=new int[n];
        for(int i=0;i<n;i++)
        {
            f[i]=sc.nextInt();
            t[i]=sc.nextInt();
        }
        if(t[0]>k)
        {
            f[0]-=t[0]-k;
        }
        int max=f[0];
        for(int i=1;i<n;i++)
        {
            if(t[i]>k)
            {
                f[i]-=t[i]-k;
            }
            max=Math.max(max, f[i]);
        }
        System.out.println(max);
    }
}
