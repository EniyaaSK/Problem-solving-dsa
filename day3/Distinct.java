package day3;

public class Distinct {
    public static void main(String[] args) {
        int [] numbers={131,11,48};
        boolean [] digits =new boolean[10];

        int remainder=0;
        for(int each :numbers){
            while(each>0){
                remainder=each%10;
                digits[remainder]=true;
                each/=10;
            }
        }
        for(int index=0;index<digits.length;index++){
            if(digits[index]){
                System.out.println(index+" ");
            }
        }
    }
}
