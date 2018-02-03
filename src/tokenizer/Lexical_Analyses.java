package tokenizer;

import java.util.StringTokenizer;

public class Lexical_Analyses {

    public static void main(String[] args) {
        
        String s = "int i = 3 int void else abc123 ;";
        String token;
        
        StringTokenizer st = new StringTokenizer(s);
        
        while (st.hasMoreTokens()) {
            token = st.nextToken();
            if (isKeyword(token)) {
                System.out.println(token + " --> 'keyword'");
            } else if (isOperator(token)) {
                System.out.println(token + " --> 'operator");
            } else if (isSpecialCharacter(token)) {
                System.out.println(token + " --> 'Special Character'");
            }else if (isInteger(token)) {
                System.out.println(token + " --> 'number'");
            } else if(isAlphabet(token))  {
               System.out.println(token + " --> 'alphabet'");
            } else if(isAlphanumeric(token)){
                System.out.println(token + " --> 'Alphanumeric'");
            }
        } 
    }
    
    public static boolean isKeyword(String s) {
        
        String[] array = {"class", "void", "main", "int", "float", "char", "if", "else", "for", "return"};
        for (int i = 0; i < array.length; i++) {
            if (s.equals(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isOperator(String s) {
        
        String[] array = {"+", "-", "*", "/", "=", "==", "!=", ">", ">=", "<", "<=", "++", "--", "+=", "-="};
        for (int i = 0; i < array.length; i++) {
            if (s.equals(array[i])) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isSpecialCharacter(String s){
        
        String[] array = {"(", ")", "[", "]", "{", "}", "#", ";", ","};
        for (int i = 0; i < array.length ; i++) {
            if(s.equals(array[i])){
                return true;
            }
        }
        return false;
    }
    
    public static boolean isInteger(String s) {
        
        if(s.matches("[0-9]{1,}")){             //{n,m}  n <= length <= m
            return true;                        //{n}    length == n
        }                                       //{n,}   length >= n
        return false;
    }
    
    public static boolean isAlphabet(String s){
        
        if(s.matches("[a-zA-Z]{1,}")){
            return true;
        }
        return false;
    }
    
    public static boolean isAlphanumeric(String s){
        
        if(s.matches("[a-zA-Z0-9]+")){
            return true;
        }
        return false;
    }
    
}