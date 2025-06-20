package day1;

import java.util.Scanner;

public class MaxPayers{
    public static void main (String []args){
        double income=0.0,firstMax = Integer.MIN_VALUE,secondmax=Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);

        for(int payers =1;payers<=10;payers++){
            System.out.println("tell us the income");
            income=sc.nextInt();

            if(firstMax<=income){
                secondmax=firstMax;
                firstMax=income;
            }
            else if(secondmax<=income && income==firstMax){
                secondmax=income;

            }
           
        }
            System.out.println("Highest tax payers are:"+firstMax+"and"+secondmax);
            sc.close();

    }

}