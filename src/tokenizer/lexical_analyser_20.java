package tokenizer;

import java.util.Scanner;

public class lexical_analyser_20 {

    public static boolean isKeyword(String keywords[], String st) {
        for (int i = 0; i < keywords.length; i++) {
            if (st.equals(keywords[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isOperator(String operators[], String st) {
        for (int i = 0; i < operators.length; i++) {
            if (st.equals(operators[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDatatype(String datatypes[], String st) {
        for (int i = 0; i < datatypes.length; i++) {
            if (st.equals(datatypes[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isFunction(String functions[], String st) {
        for (int i = 0; i < functions.length; i++) {
            if (st.equals(functions[i])) {
                return true;
            }
        }
        return false;
    }

    public static boolean isInteger(String st) {
        if (st.matches("[0-9]{1,}")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isFloat(String st) {
        if (st.matches("[0-9]+.[0-9]+")) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean isExtra(String extras[], String st) {

        if (st.equals(";")) {
            System.out.println("\t End of Statement Marker");
            return true;
        } else if (st.equals("|=")) {
            System.out.println("\t Assignment Operator");
            return true;
        } else if (st.equals("var")) {
            System.out.println("\t Declaration Syntax");
            return true;
        } else if (st.equals(".")) {
            System.out.println("\t New Line");
            return true;
        } else if (st.equals(":")) {
            System.out.println("\t Colon Operator");
            return true;
        } else {
            return false;
        }
    }

    public static boolean isIdentifier(String st) {
        if (st.length() == 1) {
            char x = st.charAt(0);
            if (Character.isLetter(x)) {
                return true;
            } else {
                System.out.println("It is NOT an IDENTIFIER with length 1");
            }
        } else {
            char x = st.charAt(0);
            char y = st.charAt(1);
            if (Character.isLetter(x)) {
                return true;
            } else if (x == '_' && Character.isLetter(y)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        
        String keywords[] = {"fi", "elif", "el", "loop"};
        String datatypes[] = {"rational", "digit"};
        String extras[] = {"var", ".", ";", ":", "|="};
        String operators[] = {"|+", "|-", "|*", "|/", "|%", "<>", "!", "<", ">", "(", ")", "|&", "|#", "[", "]"};
        String functions[] = {"display", "acquire"};

        System.out.println("Enter a string");
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String[] result = str.split(" ");

        for (int i = 0; i < result.length; i++) {
            
            String result1 = result[i];
            System.out.print(result1);
            
            if (isKeyword(keywords, result1)) {
                System.out.println("\t Keyword");
            } else if (isExtra(extras, result1)) {
                System.out.println("\t extra");
            } else if (isOperator(operators, result1)) {
                System.out.println("\t Operator");
            } else if (isDatatype(datatypes, result1)) {
                System.out.println("\t Datatype");
            } else if (isFunction(functions, result1)) {
                System.out.println("\t Function");
            } else if (isInteger(result1)) {
                System.out.println("\t Integer");
            } else if (isFloat(result1)) {
                System.out.println("\t Rational Number");
            } else if (isIdentifier(result1)) {
                if (isIdentifier(result1)) {
                    System.out.println("\t Identifier");
                } else {
                    System.out.println("\t Not an Identifier");
                }
            } else {
                System.out.println("\t Invalid Word");
            }
        }
    }

}