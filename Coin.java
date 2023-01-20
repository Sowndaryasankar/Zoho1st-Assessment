package org.zoho;
import java.util.*;
public class Coin
{
   static int minCoins(int coins[], int m, int amount)
    {

       if (amount == 0) return 0;
     
       int res = Integer.MAX_VALUE;
     
       for (int i=0; i<m; i++)
       {
         if (coins[i] <= amount)
         {
             int res2 = minCoins(coins, m, amount-coins[i]);
     
             if (res2 != Integer.MAX_VALUE && res2 + 1 < res)
                res = res2 + 1;
         }
       }
       return res;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter amount:");
        int amount=sc.nextInt();
       int coins[] =new int[5];
       int m=coins.length;
       System.out.println("Enter coins:");
       for (int i=0;i<m;i++){
           coins[i]=sc.nextInt();
       }
       
       
       System.out.println("Minimum coins required is "+ minCoins(coins, m, amount) );
    }
}

 
