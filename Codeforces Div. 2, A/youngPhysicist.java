/*      Problem statement : https://codeforces.com/problemset/problem/69/A */

import java.util.*;
import java.io.*;

public class youngPhysicist {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        int z[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
            z[i]=sc.nextInt();
        }
        int s1=0, s2=0, s3=0;
        for(int i=0;i<n;i++)
        {
            s1+=x[i];
            s2+=y[i];
            s3+=z[i];
        }
        if(s1==0 && s2==0 && s3==0)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
