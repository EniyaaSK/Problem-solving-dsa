package day7;

public class subSum {
    public static int maxSub(int[] trans,int current,int sum){
        for(int index = 0; index<trans.length;index++){
            if(trans[index]==sum)
            return sum;
            else{
                sum+=trans[index];
            }

        }
        return sum;
        
    }

    public static void main(String[] args) {
        int []trans={2,-4,1,9,-6,7,-3};
        System.out.println(maxSub(trans,0,11));
        
    }
    
}
