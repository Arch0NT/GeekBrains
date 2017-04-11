import java.util.Scanner;

public class MyClass3 {
    public static void main(String[] args) {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
                "pear", "pepper", "pineapple", "pumpkin", "potato"};
        final int LENGTH = words.length;
        Scanner scn = new Scanner(System.in);
        String questWord;
        String guessWord;
        StringBuffer hiddenWord;
        int minLength = 0;
        do {
            questWord = words[(int) (Math.random() * LENGTH)];
            System.out.println(questWord);
            System.out.println("Guess the word!");
            do {
                System.out.println("Enter guessing word please");
                guessWord = scn.nextLine().toLowerCase();
                hiddenWord = new StringBuffer("###############");
                minLength = (questWord.length() > guessWord.length()) ? guessWord.length() : questWord.length();
                for (int i = 0; i < minLength; i++) {
                    if (questWord.charAt(i) == guessWord.charAt(i)) hiddenWord.setCharAt(i, questWord.charAt(i));
                }
                if (!hiddenWord.equals("###############"))
                    System.out.println("You have guessed the next characters: " + hiddenWord);
            } while (!questWord.equals(guessWord));
            System.out.println("**********************************************************");
            System.out.println("*                                                        *");
            System.out.println("*       CONGRATULATION!!!   YOU ARE THE WINNER!!!        *");
            System.out.println("*                                                        *");
            System.out.println("**********************************************************");
            System.out.println("Do you want to play again Y/N");
            guessWord = scn.nextLine().toUpperCase();
        } while (guessWord.startsWith("Y"));
    }
}
