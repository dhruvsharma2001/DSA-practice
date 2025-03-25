import java.util.*;
public class pangram {
    public static boolean IsPangram(String s){
        Set<Character> alphabets = new HashSet<>();
        for(char i='a';i<='z';i++){
            alphabets.add(i);
        }

        for(int i=0;i<s.length();i++){
            alphabets.remove(s.charAt(i));
            if(alphabets.isEmpty()){
                return true;
            }
        }
        return false;
    }
    public static void main(String args[]){
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.print(IsPangram(s));
    }
}
