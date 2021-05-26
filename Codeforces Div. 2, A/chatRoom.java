/*      Problem statement : https://codeforces.com/problemset/problem/58/A */

import java.util.*;
import java.io.*;

public class chatRoom {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String s="hello";
        int i=0, j=0;
        while(i<str.length() && j<s.length())
        {
            if(str.charAt(i)==s.charAt(j))
            {
                j++;
            }
            i++;
        }
        if(j==s.length())
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
