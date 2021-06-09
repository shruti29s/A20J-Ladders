/*      Problem statement : https://codeforces.com/problemset/problem/262/A */

import java.util.*;
import java.io.*;

public class RomaAndLuckyNumber {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int num=a[i];
            int c=0;
            while(num>0)
            {
                int r=num%10;
                num=num/10;
                if(r==4 || r==7)
                    c++;
            }
            if(c<=k)
            {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
