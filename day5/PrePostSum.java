package day5;

import java.util.Arrays;

public class PrePostSum {
    public static void presum(int [] arr,int [] pre,int index){
        if(index==0){
            pre[0]=arr[0];

        }
        else{
            presum(arr, pre, index-1);
            pre[index]=pre[index-1]+arr[index];
        }
    }
    public static void postsum(int []arr,int[]post,int index){
        if(index==arr.length-1){
            post[arr.length-1]=arr[arr.length-1];
        }
        else{
            postsum(arr, post, index+1);
            post[index]=post[index+1]+arr[index];
        }
    }

    public static void main(String[] args) {
        int[]nums={23,12,98,45,18,45,12,98};
        int [] presum=new int[nums.length];
        int [] postsum = new int[nums.length];
        presum(nums,presum,nums.length-1);
        System.out.println(Arrays.toString(presum));
        postsum(nums,postsum,0);
        System.out.println(Arrays.toString(postsum));
    }
    
}
