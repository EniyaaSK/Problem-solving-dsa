package day4;

import java.util.Arrays;
import java.util.Scanner;

public class Clockanticlock {
    public static void main(String[] args) {
        int [] source ={111,222,333,444,666};
        int size=source.length;
        int [] anti=new int[size];
        int[] clock =new int[size];
        Scanner sc=new Scanner(System.in);
        System.out.println("Tell us the rotation:");
        int shift = sc.nextInt();
        int rotIndex=0;

        for(int index=0;index<size;index++){
            rotIndex=(index-shift+size)%size;
            anti[index]=source[rotIndex];

        }
        System.out.println(Arrays.toString(anti));

        for(int index=0;index<size;index++){
            rotIndex=(index+shift+size)%size;
            clock[index]=source[rotIndex];
        }
        System.out.println(Arrays.toString(clock));
        sc.close();
        
    }
   
    
}
