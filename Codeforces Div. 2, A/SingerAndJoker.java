/*      Problem statement : https://codeforces.com/problemset/problem/439/A */

import java.util.*;
import java.io.*;

public class SingerAndJoker {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int d=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int s=(n-1)*10;
        int c=(n-1)*2;
        for(int i=0;i<n;i++)
        {
            s+=arr[i];
        }
        if(s>d)
        {
            System.out.println(-1);
        }
        else{
            if(s<d && d-s>=5)
            {
                c+=(d-s)/5;
            }
            System.out.println(c);
        }
    }
}
