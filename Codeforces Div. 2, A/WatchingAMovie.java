/*      Problem statement : https://codeforces.com/problemset/problem/499/A */

import java.util.*;
import java.io.*;

public class WatchingAMovie {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int l[]=new int[n];
        int r[]=new int[n];
        for(int i=0;i<n;i++)
        {
            l[i]=sc.nextInt();
            r[i]=sc.nextInt();
        }
        int s=1;
        long c=0;
        for(int i=0;i<n;i++)
        {
            c+=r[i]-l[i]+1;
            c+=(l[i]-s)%x;
            s=r[i]+1;
        }
        System.out.println(c);
    }
}
