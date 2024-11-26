package arrays;

public class WordCount {
    public static int countWords(String sentence) {
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        System.out.println(countWords("Hola mundo, bienvenido a Java")); // 5
    }
}
