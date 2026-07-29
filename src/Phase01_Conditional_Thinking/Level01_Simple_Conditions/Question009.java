package Phase01_Conditional_Thinking.Level01_Simple_Conditions;

// Question :- Take a character and check if it’s a vowel or consonant.

public class Question009 {
    public static void main(String[] args){
        char ch = 't';

        if(Character.isLetter(ch)){
            if(isVowel(ch)) System.out.println("Vowel");
        else
            System.out.println("consonant");
        }else {
            System.out.println("Not an alphabet");
        }
    }

    private static boolean isVowel(char ch){
        char lower = Character.toLowerCase(ch);
        return lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u';
    }
}
