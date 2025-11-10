package strings;

/*
    * Given a string, , matching the regular expression [A-Za-z !,?._'@]+,
    * split the string into tokens. We define a token to be one or more consecutive English alphabetic letters.
    * Then, print the number of tokens, followed by each token on a new line.
    * Note: You may find the String.split method helpful in completing this challenge.
 */

public class StringTokens {

    public static void main(String[] args) {
        printTokens("He is a very very good boy, isn't he?");
    }

    public static void printTokens(String str) {
        String trimmedStr = str.trim();
        if (trimmedStr.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tokens = trimmedStr.split("[^A-Za-z]+");
        System.out.println(tokens.length);
        for (String token : tokens) {
            System.out.println(token);
        }
    }

}