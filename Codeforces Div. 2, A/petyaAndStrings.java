/*      Problem statement : https://codeforces.com/problemset/problem/112/A */

import java.util.*;
import java.io.*;
public class petyaAndStrings {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        int i=str1.compareTo(str2);
        if(i==0)
        {
            System.out.println(0);
        }
        else if(i<0)
        {
            System.out.println(-1);
        }
        else{
            System.out.println(1);
        }
    }
}
