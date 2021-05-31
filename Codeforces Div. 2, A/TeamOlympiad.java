/*      Problem statement : https://codeforces.com/problemset/problem/490/A */

import java.util.*;
import java.io.*;

public class TeamOlympiad {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t[]=new int[n];
        for(int i=0;i<n;i++)
        {
            t[i]=sc.nextInt();
        }
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2=new ArrayList<Integer>();
        ArrayList<Integer> a3=new ArrayList<Integer>();
        for(int i=0;i<n;i++)
        {
            if(t[i]==1)
            {
                a1.add(i+1);
            }
            else if(t[i]==2)
            {
                a2.add(i+1);
            }
            else{
                a3.add(i+1);
            }
        }
        int n1=a1.size();
        int n2=a2.size();
        int n3=a3.size();
        int c=Math.min(Math.min(n1, n2),n3);
        int i=0;
        System.out.println(c);
        while(c>0)
        {
            System.out.println(a1.get(i)+" "+a2.get(i)+" "+a3.get(i));
            c--;
            i++;
        }
    }
}
