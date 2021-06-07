/*      Problem statement : https://codeforces.com/problemset/problem/462/A */

import java.util.*;
import java.io.*;

public class ApplemanAndEasyTask {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        int c[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
            for(int j=0;j<n;j++)
            {
                if(a[i].charAt(j)=='o')
                {
                    c[i][j]=1;
                }
            }
        }
        int f=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                int sum=0;
                if(i!=0)
                {
                    sum+=c[i-1][j];
                }
                if(i!=n-1)
                {
                    sum+=c[i+1][j];
                }
                if(j!=0)
                {
                    sum+=c[i][j-1];
                }
                if(j!=n-1)
                {
                    sum+=c[i][j+1];
                }
                if(sum%2!=0)
                {
                    f=1;
                    break;
                }
            }
            if(f==1)
            {
                break;
            }
        }
        if(f==1)
        {
            System.out.println("NO");
        }
        else{
            System.out.println("YES");
        }
    }
}
