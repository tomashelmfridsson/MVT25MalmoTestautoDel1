package alfabetet;

public class Converter {
    public static char convertNumberToChar(int i) {
        return (char) ('A'+i-1);
    }

    public static int convertCharToNumber(char c) {
        c = Character.toUpperCase(c);
        return c-64;
    }

    public static int convertStringToNumber(String str) {
        String result="";
        for (char c: str.toCharArray()){
            int nbr =convertCharToNumber(c);
            result= result.concat(String.valueOf(nbr));
        }
        return Integer.parseInt(result);
    }

    public static String convertNumberToString(int nbr) {
        String str = String.valueOf(nbr);
        String result="";
        for (int i=0; i < str.length() ; i++){
            int n = Integer.parseInt(str.substring(i,i+1));
            char c = convertNumberToChar(n);
            result = result.concat(String.valueOf(c));
        }
        return result;
    }
}
