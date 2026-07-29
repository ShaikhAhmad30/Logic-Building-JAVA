package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

// Question:- Take a character and check whether it’s uppercase, lowercase, a digit, or a special
//character


public class Question0010 {
    public static void main(String[] args){
        char ch = '1';

        if(Character.isUpperCase(ch)) System.out.println("Character is Upper case");
        else if (Character.isLowerCase(ch)) System.out.println("Character is Lower Case");
        else if(Character.isDigit(ch)) System.out.println("Character is a Digit");
        else System.out.println("Character is a special character");


    }
}
