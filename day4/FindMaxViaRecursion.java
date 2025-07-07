package day4;
public class FindMaxViaRecursion {

    public static int findMax(int [] maxi,int current){
        if(current==maxi.length-1)
            return maxi[current];
        else{
            int currentMax=findMax(maxi, current+1);
            return Math.max(maxi[current],currentMax);
        }
    }

    public static void main(String[] args) {
        int[] arr={0,4,5,3,7,2,1};
        System.out.println(findMax(arr, 0));

    }
    
}
