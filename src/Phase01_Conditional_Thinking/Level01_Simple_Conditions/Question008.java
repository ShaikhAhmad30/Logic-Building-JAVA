package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

// Question :- Take a temperature value and print “Cold”, “Warm”, or “Hot” using range conditions.

public class Question008 {
    public static void main(String[] args){

        int temperature = 20;
        if(temperature < 15 ){
            System.out.println("Weather is Cold");
        } else if (temperature <= 30 ) {
            System.out.println("Weather is warm");
        }else{
            System.out.println("Weather is Hot");
        }
    }
}
