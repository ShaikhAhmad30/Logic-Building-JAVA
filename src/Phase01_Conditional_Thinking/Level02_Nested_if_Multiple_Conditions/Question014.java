package Phase01_Conditional_Thinking.Level02_Nested_if_Multiple_Conditions;

public class Question014 {
    public static void main() {
        int first = 12, second = 36;

        if(first != 0 && second % first == 0) System.out.println("Second is a multiple of first");
        else if (second != 0 && first % second == 0) System.out.println("first is a multiple of second");
        else System.out.println("No number is a multiple of the other");
    }
}
