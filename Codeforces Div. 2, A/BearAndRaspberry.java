/*      Problem statement : https://codeforces.com/problemset/problem/385/A */

import java.util.*;
import java.io.*;

public class BearAndRaspberry {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        int x[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
        }
        int max=0;
        for(int i=0;i<n-1;i++)
        {
            max=Math.max(x[i]-x[i+1]-c, max);
        }
        System.out.println(max);
    }
}
