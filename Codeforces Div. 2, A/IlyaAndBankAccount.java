/*      Problem statement : https://codeforces.com/problemset/problem/313/A */

import java.util.*;
import java.io.*;

public class IlyaAndBankAccount {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>=0)
        {
            System.out.println(n);
        }
        else{
            String str=Integer.toString(n);
            char ch1=str.charAt(str.length()-1);
            char ch2=str.charAt(str.length()-2);
            String num=str.substring(1,str.length()-2);
            if(ch1>ch2)
            {
                num+=ch2;
            }
            else{
                num+=ch1;
            }
            if(num.equals("0"))
            {
                System.out.println(num);
            }
            else{
                System.out.println("-"+num);
            }
        }
    }
}
