package  day1;


import java.util.Scanner;

public class LeastDeposit{
    public static void main (String []args){
        int token=0, cash=0,least=Integer.MAX_VALUE;
    Scanner sc=new Scanner(System.in);
    System.out.println("How many no.of.Tokens Distributed:");
    token=sc.nextInt();
    while(token>0){
        System.out.println("Amount to be deposited");
        cash=sc.nextInt();
        if(cash<=least){
            least=cash; 
            token--;
        }
        
    }
    System.out.println("Least deposited amount:"+least);
    sc.close();
     
    }
}