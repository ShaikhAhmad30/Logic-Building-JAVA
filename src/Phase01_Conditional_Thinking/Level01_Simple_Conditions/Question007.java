package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

public class Question007 {
    public static void main(String[] args) {
        int first = 10, second = 30 , third = 50;

        int largest = first;

        if(second > largest ){ largest = second;}

        if(third > largest){ largest = third;}

        System.out.println("Largest Number is: "+ largest);

    }
}
