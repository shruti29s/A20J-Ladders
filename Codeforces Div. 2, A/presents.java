/*      Problem statement : https://codeforces.com/problemset/problem/136/A */

import java.util.*;
import java.io.*;

public class presents {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int p[]=new int[n];
        for(int i=0;i<n;i++)
        {
            p[a[i]-1]=i+1;
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(p[i]+" ");
        }
    }
}
