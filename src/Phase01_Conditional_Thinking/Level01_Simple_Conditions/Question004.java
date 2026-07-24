package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

// Question :- Check if a number is divisible by both 3 and 5.

public class Question004 {
    public static void main(String[] args){
        int n = 10;

        if(n % 3 == 0 && n % 5 == 0){
            System.out.println(n + " is divisible by 3 and 5");
        }else {
            System.out.println(n + " is not divisible by 3 and 5");
        }
    }
}
