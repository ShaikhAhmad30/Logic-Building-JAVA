package Phase01_Conditional_Thinking.Level02_Nested_if_Multiple_Conditions;

// Question :- Take three sides and check if they form a valid triangle

public class Question011 {
    public static void main(String[] args){
        int a = 2, b = 4, c = 5;
        if(a + b > c && b + c > a && c + a > b){
            System.out.println("It is valid triangle");
        }else{
            System.out.println("It is not valid triangle");
        }
    }
}
