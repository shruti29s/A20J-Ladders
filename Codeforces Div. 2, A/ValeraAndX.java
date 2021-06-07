/*      Problem statement : https://codeforces.com/problemset/problem/404/A */

import java.util.*;
import java.io.*;

public class ValeraAndX {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String a[]=new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.next();
        }
        char d=a[0].charAt(0);
        char o=a[0].charAt(1);
        int f=0;
        if(d==o)
        {
            f=1;
        }
        else{
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(i==j)
                    {
                        if(a[i].charAt(j)!=d){
                            f=1;
                            break;
                        }
                    }
                    else if(j==n-1-i)
                    {
                        if(a[i].charAt(j)!=d){
                            f=1;
                            break;
                        }
                    }
                    else
                    {
                        if(a[i].charAt(j)!=o){
                            f=1;
                            break;
                        }
                    }
                }
                if(f==1)
                {
                    break;
                }
            }
        }
        if(f==1)
        {
            System.out.println("NO");
        }
        else
        {
            System.out.println("YES");
        }
    }
}
