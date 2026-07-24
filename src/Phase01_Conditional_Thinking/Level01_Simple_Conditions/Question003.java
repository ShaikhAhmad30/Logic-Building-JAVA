package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

// Question :- Check if a number is divisible by 5.

public class Question003 {
    public static void main(String[] args){

        int n = 23;

        if (n % 5 == 0){
            System.out.println(n + " is divisible by 5 ");
        } else {
            System.out.println(n + " is not divisible by 5");
        }
    }
}
