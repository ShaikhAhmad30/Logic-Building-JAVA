package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

// Question :- Check if a given year is a leap year.



public class Question005 {
    public static void main(String[] args){
        int year = 2024;

        if((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)){
            System.out.println("Given year is leap year");
        }else {
            System.out.println("Given year is not leap year");
        }
    }
}
