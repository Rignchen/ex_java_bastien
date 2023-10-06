package ch.jobtrek;

public class Basics {

    /**
     * This function gets two integers and must compute them as follows :
     * IF all numbers are even or number 1 superior to 10, return true
     * in all other cases, return false
     */
    public static boolean someConditionals(int number1, int number2) {
        return number1>10||(number1%2==0&&number2%2==0);
    }

    /**
     * @param text A string containing words separated by spaces
     * @return A string containing only words of maximum 4 characters and starting
     * with letter T. All words should be uppercase and separated by spaces
     */
    public static String strings(String text) {
        String[] words = text.split(" ");
        text = "";
        for (String word: words) {
            if (word.length() <= 4 && word.toLowerCase().startsWith("t"))
                text += word.toUpperCase();
        }
        return text.substring(0, text.length()-1);
    }

    /**
     * @param needle The word you need to replace
     * @param haystack A string in which you need to replace the needle by the new word
     * @param newWord The replacement word
     * @return A new string where the needle is replaced by newWord
     */
    public static String findAndReplace(String needle, String haystack, String newWord) {
        return haystack.replaceAll(needle,newWord);
    }
}
