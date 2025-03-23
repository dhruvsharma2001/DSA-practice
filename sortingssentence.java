import java.util.*;

public class sortingssentence {
    public static String SortingSentence(String s){
        Map<Integer, String> indexWordMap = new HashMap<>();
        for(String word: s.split(" ")){
            int lastIndex = word.length()-1;

            int index = word.charAt(lastIndex)-'0';
            String actualWord = word.substring(0, lastIndex);

            indexWordMap.put(index, actualWord);
        }

        StringBuilder result = new StringBuilder();
        for(Map.Entry<Integer, String> indexWord: indexWordMap.entrySet()){
            result.append(indexWord.getValue());
            result.append(" ");
        }
        String lastAns =  result.toString().trim();
        return lastAns;
    }
    public static void main(String args[]){
        String s= "is2 sentence4 this1 a3";

        String returnedValue= SortingSentence(s);
        System.out.print(returnedValue);
    }
}
