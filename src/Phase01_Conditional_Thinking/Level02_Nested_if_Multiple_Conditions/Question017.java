package Phase01_Conditional_Thinking.Level02_Nested_if_Multiple_Conditions;

// Question :- Take two numbers and determine whether both are even, both are odd, or one is
//even and one is odd.


public class Question017 {
    public static void main(String[] args){
        int a = 10;
        int b = 22;
        if(a%2 == 0 && b%2 == 0) System.out.println("Both numbers are even");
        else if(a%2 != 0 && b%2 != 0) System.out.println("Both numbers are odd");
        else System.out.println("One number is even and one number is odd");
    }
}
