package Phase01_Conditional_Thinking.Level02_Nested_if_Multiple_Conditions;

// Question :- Take an alphabet character and check if it lies between ‘a’ and ‘m’ or ‘n’ and ‘z’.

public class Question018 {
    public static void main(String[] args){
        char ch = 'A';
        if(ch> 'a' && ch <= 'm') System.out.println("Character is in between a and m");
        else if(ch >= 'n' && ch <= 'z') System.out.println("Character is in between n and z");
        else System.out.println("Character is not in lowercase");
    }
}
