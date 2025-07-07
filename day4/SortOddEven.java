package day4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortOddEven {

    public static void main(String[] args) {
        int [] source={1,2,3,5,4,7,10};

        List<Integer> evenList=new ArrayList<>();
        List<Integer> oddList=new ArrayList<>();

        for(int each :source){
            if(each%2!=0){
                oddList.add(each);
            }
            else
                evenList.add(each);
        }
        oddList.sort(Collections.reverseOrder());
        Collections.sort(evenList);

        for(int index=0;index<source.length;index++){
            if(index<oddList.size()){
                source[index]=oddList.get(index);
            }
            else
            source[index]=evenList.get(index -evenList.size()-1);
        }
        System.out.println(Arrays.toString(source));
        
    }
    
}
