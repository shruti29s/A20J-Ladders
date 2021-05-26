/*      Problem statement : https://codeforces.com/problemset/problem/339/A */

import java.util.*;
import java.io.*;

public class helpfulMaths {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        int i=str.length()/2;
        for(;i<str.length();i++)
        {
            System.out.print(ch[i]);
            if(i!=str.length()-1)
            {
                System.out.print("+");
            }
        }
    }
}
