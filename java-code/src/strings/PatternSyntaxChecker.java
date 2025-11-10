package strings;

import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    public static void main(String[] args) {

        printPatternSyntax("([A-Z])(.+)");
        printPatternSyntax("[AZ[a-z](a-z)");
        printPatternSyntax("batcatpat(nat");

    }
    public static void printPatternSyntax(String regex) {
        try {
            Pattern.compile(regex);
            System.out.println("Valid");
        } catch (PatternSyntaxException e) {
            System.out.println("Invalid");
        }
    }

}
/*

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases > 0){
            String pattern = in.nextLine();
            try {
                "".split(pattern);
                System.out.println("Valid");

            } catch (Exception e){
                System.out.println("Invalid");
            }
            testCases--;
        }
        in.close();
    }

}

 */
