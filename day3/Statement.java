package day3;

import java.util.Scanner;

public class Statement{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int currentBalance=0,oldBalance=0,debitCount=0;
        
        for(int transaction=0;transaction<=20;transaction++){
            System.out.println("Tell us the current Balance");
            currentBalance=sc.nextInt();
            if(currentBalance<=oldBalance){
                debitCount++;
            }
            oldBalance=currentBalance;
        }
        debitCount -=3;
        if (debitCount>0){
            currentBalance-=(debitCount*23);

        }
        System.out.println(debitCount*23+"has been deducted");
        System.out.println("current Balance ="+currentBalance);
        
    }
    
}
