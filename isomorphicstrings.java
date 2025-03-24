import java.util.*;
public class isomorphicstrings {
    public static boolean IsoMorphicString(String s, String t){
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> charMapping = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char original = s.charAt(i);
            char replacement = t.charAt(i);

            if(!charMapping.containsKey(original)){
                if(!charMapping.containsValue(replacement)){
                    charMapping.put(original, replacement);
                }else{
                   return false;
                }
            }else{
                char mappedCharacter = charMapping.get(original);
                if(mappedCharacter != replacement){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String args[]){
        String s1 = "badc";
        String s2 = "kikp";
        System.out.print(IsoMorphicString(s1, s2));
    }
}
