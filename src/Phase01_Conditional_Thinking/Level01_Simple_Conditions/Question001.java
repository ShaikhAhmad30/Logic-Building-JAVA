package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

// Question :- Take a number and print whether it’s positive, negative, or zero.


public class Question001 {
    public static void main(String[] args){

        int n = -7;

        if(n > 0){
            System.out.println(n + " is Positive Number");
        }else if(n < 0){
            System.out.println(n + " is Negative Number");
        }else{
            System.out.println("Number is Zero");
        }
    }
}
