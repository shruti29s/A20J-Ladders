/*      Problem statement : https://codeforces.com/problemset/problem/144/A */

import java.util.*;
import java.io.*;

public class arrivalOfTheGeneral {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int min=a[0], max=a[0];
        int min_i=0, max_i=0;
        for(int i=1;i<n;i++)
        {
            if(a[i]<=min)
            {
                min=a[i];
                min_i=i;
            }
            else if(a[i]>max)
            {
                max=a[i];
                max_i=i;
            }
        }
        int s=(max_i-0)+(n-1-min_i);
        if(min_i<max_i)
        {
            s--;
        }
        System.out.println(s);
    }
}
