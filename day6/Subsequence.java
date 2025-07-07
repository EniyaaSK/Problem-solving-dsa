package day6;
public class Subsequence {
    public static int isSequence(String name,String phrase){
        int alpha=0, beta=0;
        while(alpha<name.length()&&beta<phrase.length()){
            if(name.charAt(alpha)==phrase.charAt(beta)){
                beta++;
            }
            alpha++;
        }
        return (beta==phrase.length())? 1:0;

    }
    public static void main(String[] args) {
        String phrase="TCS";
        String name="Tata Services";

        // String name="Tata Consultancy Services";

        System.out.println(isSequence(name,phrase));
    }
    
}
