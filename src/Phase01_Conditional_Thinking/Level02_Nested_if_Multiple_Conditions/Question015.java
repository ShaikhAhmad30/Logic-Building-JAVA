package Phase01_Conditional_Thinking.Level02_Nested_if_Multiple_Conditions;

// Question :- Take the hour of the day (0–23) and print “Good Morning”, “Good Afternoon”, “Good
//Evening”, or “Good Night”.



public class Question015 {
    public static void main(String[] args) {
        int hour = 21;

        if (hour >= 5 && hour < 12) {
            System.out.println("Good Morning!!");
        } else if (hour >= 12 && hour < 17) {
            System.out.println("Good Afternoon!!");
        }else if(hour >= 17 && hour < 21){
            System.out.println("Good Evening!!");
        }else{
            System.out.println("Good Night!!");
        }
    }
}