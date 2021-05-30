/*      Problem statement : https://codeforces.com/problemset/problem/230/A */

import java.util.*;
import java.io.*;

public class Dragons {
    public static void main(String [] args)throws IOException{
        Scanner sc=new Scanner(System.in);
        long s=sc.nextLong();
        int n=sc.nextInt();
        int x[]=new int[n];
        int y[]=new int[n];
        for(int i=0;i<n;i++)
        {
            x[i]=sc.nextInt();
            y[i]=sc.nextInt();
        }
        Pair arr[]=new Pair[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=new Pair(x[i], y[i]);
        }
        Arrays.sort(arr, new MyCmp());
        int f=1;
        for(int i=0;i<n;i++)
        {
            if(arr[i].x<s)
            {
                s+=arr[i].y;
            }
            else{
                f=0;
                break;
            }
        }
        if(f==1)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}

class Pair{
    int x, y;
    Pair(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
}
 
class MyCmp implements Comparator<Pair>
{
    public int compare(Pair p1, Pair p2)
    {
        return p1.x-p2.x;
    }
}

