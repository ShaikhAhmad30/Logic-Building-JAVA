package Phase01_Conditional_Thinking.Level02_Nested_if_Multiple_Conditions;

// Question :- If the sides form a valid triangle, determine whether it is equilateral, isosceles, or
//scalene

public class Question012 {
     public static void main() {
         int a = 5, b = 5, c = 5;

         if(a + b > c && b + c > a && a + c > b){
             if(a == b && b == c) System.out.println("Equilateral");
             else if (a == b && b == c && c == a) System.out.println("Isosceles");
             else System.out.println("Scalene");
         }

    }
}
