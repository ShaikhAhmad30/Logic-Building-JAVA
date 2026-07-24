package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

// Question :- Check if a number is even or odd.

public class Question002 {
    public static void main(String[] args){
        int n = 10;

        if(n % 2 == 0){
            System.out.println(n + " Is Even Number");
        }else {
            System.out.println(n + " Is Odd Number");
        }
    }
}
