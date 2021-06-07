/*      Problem statement : https://codeforces.com/problemset/problem/255/A */

import java.util.*;
import java.io.*;

public class GregWorkout {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int c=0, bi=0, ba=0;
        for(int i=0;i<n;i++)
        {
            if(i%3==0)
            {
                c+=a[i];
            }
            else if(i%3==1)
            {
                bi+=a[i];
            }
            else{
                ba+=a[i];
            }
        }
        if(c>bi && c>ba)
        {
            System.out.println("chest");
        }
        else if(bi>c && bi>ba)
        {
            System.out.println("biceps");
        }
        else{
            System.out.println("back");
        }
    }
}
