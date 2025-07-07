package day5;

import java.util.Scanner;


public class RecursiveOccurance {
    public static int findCount(int[]arr,int current,int find){
        if(current==arr.length){
        // System.out.println(arr.length);
        return 0;
        }
        else{
            int count= (arr[current]==find )? 1:0;
            return count+findCount(arr, current+1, find);
        }
    }
    


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={0,1,5,0,7,2,1};
        System.out.println("Enter the number to find occurance");
        System.out.println(findCount(arr,0,sc.nextInt()));
        sc.close();
    }
}
